package Persistance;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import BusinessLogic.Models.ModelIt;
import BusinessLogic.Models.User;

import com.sun.corba.se.impl.util.Version;

/**
 */
public abstract class DatabaseUtils {

	private static Connection con = null;
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	private final static String server = "jdbc:postgresql://mcse.heliohost.org:5432/mcse_zenlounge";
	private final static String login = "mcse";
	private final static String password = ProtectedConfigFile.getPassword(1);

	/**
	 * This is the database connection
	 */
	public static void connexion() {
		try {
			// Class.forName("org.postgresql.Driver");
			// System.out.println("Driver O.K.");
			con = DriverManager.getConnection(server, login, password);
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
			if (pst != null) {
				pst.close();
			}
			if (con != null) {
				con.close();
			}

		} catch (SQLException ex) {
			Logger lgr = Logger.getLogger(Version.class.getName());
			lgr.log(Level.WARNING, ex.getMessage(), ex);
		}
	}

	/**
	 * @param <AbstractModel>
	 * @param request
	 * @return
	 */
	public static ModelIt selectOne(Class maClass, int id) {
		ModelIt result = null;
		try {
			String tableName = maClass.getSimpleName() + "s";
			if (tableName.substring(tableName.length()-1).equals("y"))
				tableName = tableName.substring(0, tableName.length()-2) + "ies";
			
			String query = "SELECT * FROM zenlounge." + tableName
					+ " WHERE num" + maClass.getSimpleName() + " = " + id;
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();

			ResultSetMetaData meta = rs.getMetaData();
			ArrayList<String> dBCollumns = new ArrayList<>();
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				dBCollumns.add(meta.getColumnName(i));
			}

			result = (ModelIt) maClass.newInstance();
			List<Field> classFields = Arrays
					.asList(maClass.getDeclaredFields());

			Method method = null;

			int pos = 0;
			rs.next();

			for (int i = 0; i < dBCollumns.size(); i++) {

				String colName = classFields.get(i).getName();
				colName = colName.substring(0, 1).toUpperCase()
						+ colName.substring(1);

				if (dBCollumns.contains(colName.toLowerCase())) {
					try {
						pos = dBCollumns.indexOf(colName.toLowerCase()) + 1;
						method = result.getClass().getMethod("set" + colName,
								classFields.get(i).getType());
						method.invoke(result, rs.getObject(pos));
					} catch (NoSuchMethodException | SecurityException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
					} catch (IllegalAccessException e) {
					} catch (InvocationTargetException e) {
					}
				}
			}
		} catch (SQLException | InstantiationException | IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		result.store();
		return result;
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
