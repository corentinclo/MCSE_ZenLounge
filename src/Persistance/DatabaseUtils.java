package Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.corba.se.impl.util.Version;

/**
 */
public abstract class DatabaseUtils {

	private static Connection conn = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	private final static String server = "jdbc:postgresql://mcse.heliohost.org:5432/mcse_zenlounge";
	private final static String login = "mcse_zen";
	private final static String password = ProtectedConfigFile.getPassword(1);
	
	/**
	 * This is the database connection
	 */
	public static void connexion() {
       
		try {
			//Class.forName("org.postgresql.Driver");
			//System.out.println("Driver O.K.");

			conn = DriverManager.getConnection(server, login, password);
			st = conn.createStatement();
	        rs = st.executeQuery("SELECT * FROM information_schema.tables;");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
		} catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
	
	/**
 */
	public static void deconnexion() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.WARNING, ex.getMessage(), ex);
        }
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
