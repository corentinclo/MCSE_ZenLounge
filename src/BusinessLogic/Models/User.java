package BusinessLogic.Models;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.TreeSet;

import BusinessLogic.Facades.NotificationCenter;
import Persistance.DatabaseUtils;

/**
 * @author florent
 *
 */
public class User implements ModelIt{

	public static String cryptPassword(String password,String prefix, String sufix) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update((prefix+password+sufix).getBytes());
		md.digest();
    	return new String(md.digest(), "UTF-16");
    }
	public static void registerUser(String id, String lastName, String firstName, String mail, String tel, String password) 
    		throws UnsupportedEncodingException, NoSuchAlgorithmException {        
    	String cryptPassword	= null;
    	SecureRandom random 	= new SecureRandom();
    	String prefix 			= null;
    	String sufix 			= null;
		prefix 	= new String(random.generateSeed(8),"UTF-16");
		sufix 	= new String(random.generateSeed(8),"UTF-16");
		cryptPassword = cryptPassword(password,prefix,sufix);
		
    	User newUser = new User(-1,id,lastName,firstName,mail,tel,cryptPassword,prefix,sufix);
    	newUser.store();
    }
	private int numUser;
	private String prefixUser;
	private String sufixUser;
	private String idUser;
	private String mailUser;
	private String nameUser;
	private String firstNameUser;
	private String telUser;
	private String passwordUser;
	public Order order;
	public Collection<Product> 	shoppingCart = new TreeSet<Product>();

	public NotificationCenter	notificationCenter;
	
	public Collection<Activite>	activite = new TreeSet<Activite>();
	
    public User () {
		
	} 
    
    public User(int num, String id, String lastName, String firstName,
			String mail, String tel, String password, String sufix,
			String prefix) {
		setNameUser(lastName);
		setFirstNameUser(firstName);
		setMailUser(mail);
		setTelUser(tel);
		setPasswordUser(password);
		setPrefixUser(prefix);
		setSufixUser(sufix);
		setIdUser(id);
		setNumUser(num);
	}

	/**
	 * @return
	 */
	@Override
	public boolean store() {
		System.out.println("Num " + getNumUser());
		System.out.println("Id " + getIdUser());
		System.out.println("Name : " + getNameUser());
		System.out.println("First name : " + getFirstNameUser());
		System.out.println("Mail : " + getMailUser());
		System.out.println("Tel : " + getTelUser());
		System.out.println("Pass : " + getPasswordUser());
		System.out.println("Prefix : " + getPrefixUser());
		System.out.println("Suffix : " + getSufixUser());
		return true;
	}
	
	/**
	 * @return
	 */
	public String getFirsNameUser() {
		return getFirstNameUser();
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	/**
	 * @return
	 */
	public String getIdUser() {
		return idUser;
	}

	/**
	 * @return
	 */
	public String getMailUser() {
		return mailUser;
	}

	/**
	 * @return
	 */
	public String getNameUser() {
		return nameUser;
	}

	/**
	 * @return
	 */
	public int getNumUser() {
		return numUser;
	}

	/**
	 * @return
	 */
	public String getPasswordUser() {
		return passwordUser;
	}

	/**
	 * @return
	 */
	public String getPrefixUser() {
		return prefixUser;
	}

	/**
	 * @return
	 */
	public String getSufixUser() {
		return sufixUser;
	}

	/**
	 * @return
	 */
	public String getTelUser() {
		return telUser;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param _firsNameUser
	 */
	public void setFirsNameUser(String _firsNameUser) {
		setFirstNameUser(_firsNameUser);
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	/**
	 * @param _idUser
	 */
	public void setIdUser(String _idUser) {
		idUser = _idUser;
	}

	/**
	 * @param _mailUser
	 */
	public void setMailUser(String _mailUser) {
		mailUser = _mailUser;
	}

	/**
	 * @param _nameUser
	 */
	public void setNameUser(String _nameUser) {
		nameUser = _nameUser;
	}

	public void setNumUser(int numUser) {
		this.numUser = numUser;
	}

	/**
	 * @param _passwordUser
	 */
	public void setPasswordUser(String _passwordUser) {
		passwordUser = _passwordUser;
	}

	public void setPrefixUser(String prefixUser) {
		this.prefixUser = prefixUser;
	}

	public void setSufixUser(String sufixUser) {
		this.sufixUser = sufixUser;
	}

	/**
	 * @param _telUser
	 */
	public void setTelUser(String _telUser) {
		telUser = _telUser;
	}
}
