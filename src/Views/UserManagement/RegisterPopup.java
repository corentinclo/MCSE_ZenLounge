package Views.UserManagement;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import BusinessLogic.Facades.UserManagement;

// TODO: Auto-generated Javadoc
/**
 * The Class RegisterPopup.
 */
public class RegisterPopup extends JFrame implements Views.AbstractView, ActionListener {
	
	/** The Constant serialVersionUID. */
	private static long serialVersionUID = -4761385680424596264L;
	
	/** The Constant ERROR_COLOR. */
	private static Color ERROR_COLOR = new Color(255,170,170);
	
	/** The user name ui. */
	private JTextField userNameUI;
	
	/** The first name ui. */
	private JTextField firstNameUI;
	
	/** The last name ui. */
	private JTextField lastNameUI;
	
	/** The mail ui. */
	private JTextField mailUI;
	
	/** The phone ui. */
	private JTextField phoneUI;
	
	/** The password ui. */
	private JPasswordField passwordUI;
	
	/** The password2 ui. */
	private JPasswordField password2UI;

	/**
	 * Validation.
	 */
	public void validation() {
		// your code here
	}

	/* (non-Javadoc)
	 * @see Views.AbstractView#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.Window#hide()
	 */
	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	/**
	 * Instantiates a new register popup.
	 */
	public RegisterPopup() {
		setResizable(false);
		setTitle("Register");
		//setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		userNameUI = new JTextField();
		userNameUI.setBounds(220, 11, 86, 20);
		getContentPane().add(userNameUI);
		userNameUI.setColumns(10);

		JLabel lblId = new JLabel("Username");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(50, 14, 160, 14);
		getContentPane().add(lblId);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(50, 45, 160, 14);
		getContentPane().add(lblPassword);

		firstNameUI = new JTextField();
		firstNameUI.setColumns(10);
		firstNameUI.setBounds(220, 101, 86, 20);
		getContentPane().add(firstNameUI);

		JLabel lblName = new JLabel("First name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(50, 104, 160, 14);
		getContentPane().add(lblName);

		lastNameUI = new JTextField();
		lastNameUI.setColumns(10);
		lastNameUI.setBounds(220, 132, 86, 20);
		getContentPane().add(lastNameUI);

		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(50, 135, 160, 14);
		getContentPane().add(lblLastName);

		mailUI = new JTextField();
		mailUI.setColumns(10);
		mailUI.setBounds(220, 163, 86, 20);
		getContentPane().add(mailUI);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(50, 166, 160, 14);
		getContentPane().add(lblEmail);

		phoneUI = new JTextField();
		phoneUI.setColumns(10);
		phoneUI.setBounds(220, 194, 86, 20);
		getContentPane().add(phoneUI);

		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelephone.setBounds(50, 197, 160, 14);
		getContentPane().add(lblTelephone);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setBounds(220, 228, 86, 32);
		getContentPane().add(btnOk);

		passwordUI = new JPasswordField();
		passwordUI.setBounds(220, 42, 86, 20);
		getContentPane().add(passwordUI);

		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setBounds(50, 73, 160, 14);
		getContentPane().add(lblConfirmPassword);

		password2UI = new JPasswordField();
		password2UI.setBounds(220, 70, 86, 20);
		getContentPane().add(password2UI);
		
		setVisible(true);
	}
		
		
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		// Quand le boutton OK est clické
		resetBackground();
		String id = userNameUI.getText();
		String lastName = lastNameUI.getText();
		String firstName = firstNameUI.getText();
		String mail = mailUI.getText();
		String phone = phoneUI.getText();
		String password = new String(passwordUI.getPassword());
		String passVerif = new String (password2UI.getPassword());
		if (id.isEmpty() || lastName.isEmpty() || firstName.isEmpty()
				|| mail.isEmpty() || phone.isEmpty()
				|| password.isEmpty() || passVerif.isEmpty()) {
			// Si un champ n'est pas rempli
			JOptionPane.showMessageDialog(null,
					"Please fill out all fields completely.",
					"Inane warning", JOptionPane.WARNING_MESSAGE);
		} else if (!Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$",mail)) {
			// Regexp pour vérifier la validité du mail
			mailUI.setBackground(ERROR_COLOR);
			mailUI.grabFocus();
			JOptionPane.showMessageDialog(null,
					"Your email adress is not correct.",
					"Inane warning", JOptionPane.WARNING_MESSAGE);
		} else if (!Pattern.matches("^(\\+\\d{2}|0)\\d{9}", phone) && phone.length() != 10) {
			// Vérifier la validité du téléphone
			phoneUI.setBackground(ERROR_COLOR);
			phoneUI.grabFocus();
			JOptionPane.showMessageDialog(null,
					"Please enter your phone number like this : 0123456789.",
					"Inane warning", JOptionPane.WARNING_MESSAGE);
			phoneUI.grabFocus();
		} else if (!password.equals(passVerif)) {
			System.out.println(password + " : " + passVerif);
			// Vérifier que les mots de passes sont égauxs
			passwordUI.setBackground(ERROR_COLOR);
			password2UI.setBackground(ERROR_COLOR);
			passwordUI.grabFocus();
			JOptionPane.showMessageDialog(null,
					"Please match your passwords.", 
					"Inane warning", JOptionPane.WARNING_MESSAGE);
		} else {
			// Tout va bien, on valide l'inscription
			UserManagement.registerUser(id,lastName, firstName, mail, phone, password);
		}
		passwordUI.setText("");
		password2UI.setText("");
	}
	
	/**
	 * Reset background.
	 */
	private void resetBackground() {
		userNameUI.setBackground(Color.WHITE);
		firstNameUI.setBackground(Color.WHITE);
		lastNameUI.setBackground(Color.WHITE);
		mailUI.setBackground(Color.WHITE);
		phoneUI.setBackground(Color.WHITE);
		passwordUI.setBackground(Color.WHITE);
		password2UI.setBackground(Color.WHITE);
	}
}
