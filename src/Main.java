import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

import BusinessLogic.Models.ModelIt;
import BusinessLogic.Models.User;
import Persistance.DatabaseUtils;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RegisterPopup frame = new RegisterPopup();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		DatabaseUtils.connexion();
		Hashtable<String, String> titi = new Hashtable<String, String>();
		titi.put("firstNameUser", "Florent");
		ArrayList<ModelIt> test = DatabaseUtils.selectMany(User.class, titi);
		for (int i = 0; i < test.size(); i++)
			test.get(i).store();
		
	}
}
