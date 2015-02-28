package Persistance;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 */
public abstract class DatabaseUtils {

	private static Connection conn;
	
	private final static String server = "sql.free.fr";
	private final static String login = "mcse.zenlounge";
	private final static String password = ProtectedConfigFile.getPassword(1);
	
	/**
 */
	public static void connexion() {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver O.K.");

			conn = DriverManager.getConnection(server, login, password);
			System.out.println("Connexion effective !");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
 */
	public static void deconnexion() {
		// your code here
	}

	/**
	 * @param request
	 * @return
	 */
	public static Object select(String request) {
		// your code here
		return null;
	}

	/**
	 * @param request
	 * @return
	 */
	public static boolean update(String request) {
		// your code here
		return false;
	}

	/**
	 * @param request
	 * @return
	 */
	public static boolean delete(String request) {
		// your code here
		return false;
	}

	/**
	 * @param request
	 * @return
	 */
	public static boolean insert(String request) {
		// your code here
		return false;
	}
}
