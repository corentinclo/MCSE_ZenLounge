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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import BusinessLogic.Models.ModelIt;

import com.sun.corba.se.impl.util.Version;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseUtils.
 */
public abstract class DatabaseUtils {

	/** The con. */
	private static Connection con = null;
	
	/** The pst. */
	private static PreparedStatement pst = null;
	
	/** The rs. */
	private static ResultSet rs = null;

	/** The Constant server. */
	private final static String server = "jdbc:postgresql://mcse.heliohost.org:5432/mcse_zenlounge";
	
	/** The Constant login. */
	private final static String login = "mcse";
	
	/** The Constant password. */
	private final static String password = ProtectedConfigFile.getPassword(1);

	/**
	 * Connexion.
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
	 * Deconnexion.
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
	 * Select one element from the database and create the associated object.
	 *
	 * @param maClass the ma class
	 * @param id the id
	 * @return the model it
	 */
	public static ModelIt selectOne(Class<?> maClass, int id) {
		try {
			// Je met le nom de la classe au pluriel pour matcher avec la BD
			String tableName = plurialize(maClass.getSimpleName());
			
			// Je génère le code SQL qui va bien pour un seul objet
			String query = "SELECT * FROM zenlounge." + tableName + " WHERE num" + maClass.getSimpleName() + " = " + id;
			
			// J'execute la requête
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			// Je fais un next, car après la création on est en position "beforeFirst"
			rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Création de l'objets
		return createObject(maClass);
	}
	
	/**
	 * Select many elements from the database and create associated objects in an ArrayList.
	 *
	 * @param maClass the ma class
	 * @param params the params
	 * @return the tree set
	 */
	public static ArrayList<ModelIt> selectMany(Class<?> maClass, Hashtable<String, String> params) {
		ArrayList<ModelIt> result = new ArrayList<ModelIt>();
		try {
			// Je met le nom de la classe au pluriel pour matcher avec la BD
			String tableName = plurialize(maClass.getSimpleName());
			
			// Réupération des noms de collones du Hashtable params
			Enumeration<String> keys = params.keys();
			String row = keys.nextElement();
			
			// Génération du code SQL qui va bien
			String query = "SELECT * FROM zenlounge." + tableName + " WHERE " + row + " = \'" + params.get(row) + "\'";
			// Loop sur la tableau params pour rajouter les paramètres spécifiques à la recherche
			while (keys.hasMoreElements()) {
				row = keys.nextElement();
				query = query + "AND " + row + " = \'" + params.get(row) + "\'";
			}
			System.out.println(query);
			// Execution de la requête
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			
			// Création des objets dans le tableau
			while (rs.next()) {
				result.add(createObject(maClass));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * Creates the object.
	 *
	 * @param maClass the ma class
	 * @return the model it
	 */
	private static ModelIt createObject(Class<?> maClass) {
		ModelIt result = null;
		try {
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
		
		return result;
	}

	private static String plurialize (String maClass) {
		String result = "";
		if (maClass.substring(maClass.length()-1).equals("y"))
			result = maClass.substring(0, maClass.length()-1) + "ies";
		else 
			result = maClass + "s";
		return result;
	}
	
	private static String singularize (String maClass) {
		String result = "";
		if (result.substring(result.length()-3).equals("ies"))
			result = maClass.substring(0, maClass.length()-3);
		else 
			result = maClass.substring(0, maClass.length()-1);
		return result;
	}
	
	/**
	 * Update.
	 *
	 * @param request the request
	 * @return true, if successful
	 */
	public static boolean update(String request) {
		// your code here
		return false;
	}

	/**
	 * Delete.
	 *
	 * @param request the request
	 * @return true, if successful
	 */
	public static boolean delete(String request) {
		// your code here
		return false;
	}

	/**
	 * Insert.
	 *
	 * @param request the request
	 * @return true, if successful
	 */
	public static boolean insert(String request) {
		// your code here
		return false;
	}
}
