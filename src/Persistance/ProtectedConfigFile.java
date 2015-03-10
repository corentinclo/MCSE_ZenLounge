package Persistance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

// TODO: Auto-generated Javadoc
/**
 * The Class ProtectedConfigFile.
 */
public class ProtectedConfigFile {

    /** The Constant PASSWORD. */
    private static char[] PASSWORD = "Un mot de passe d'enfer !".toCharArray();
    
    /** The Constant SALT. */
    private static byte[] SALT = {
        (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,
        (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,
    };

    /**
     * Gets the password.
     *
     * @param number the number
     * @return the password
     */
    public static String getPassword(int number) {
    	String decryptedPassword = null;
		try (BufferedReader br = new BufferedReader(new FileReader("passwd")))
		{
			String sCurrentLine = null;
			for (int i = 0; i < number; i++)
				sCurrentLine = br.readLine();
			decryptedPassword = ProtectedConfigFile.decrypt(sCurrentLine);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		}
		return decryptedPassword;
    }

    /**
     * Encrypt.
     *
     * @param property the property
     * @return the string
     * @throws GeneralSecurityException the general security exception
     * @throws UnsupportedEncodingException the unsupported encoding exception
     */
    private static String encrypt(String property) throws GeneralSecurityException, UnsupportedEncodingException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.ENCRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
        return base64Encode(pbeCipher.doFinal(property.getBytes("UTF-8")));
    }

    /**
     * Base64 encode.
     *
     * @param bytes the bytes
     * @return the string
     */
    private static String base64Encode(byte[] bytes) {
        // NB: This class is internal, and you probably should use another impl
        return new BASE64Encoder().encode(bytes);
    }

    /**
     * Decrypt.
     *
     * @param property the property
     * @return the string
     * @throws GeneralSecurityException the general security exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static String decrypt(String property) throws GeneralSecurityException, IOException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.DECRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
        return new String(pbeCipher.doFinal(base64Decode(property)), "UTF-8");
    }

    /**
     * Base64 decode.
     *
     * @param property the property
     * @return the byte[]
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static byte[] base64Decode(String property) throws IOException {
        // NB: This class is internal, and you probably should use another impl
        return new BASE64Decoder().decodeBuffer(property);
    }

}