import java.awt.EventQueue;

import Persistance.DatabaseUtils;
import Views.UserManagement.RegisterPopup;
import BusinessLogic.Facades.UserManagement;


public class Main {
	
	/**
	 * Launch the application.
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
	}
}
