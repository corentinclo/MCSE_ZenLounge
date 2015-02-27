package Views.UserManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DropMode;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.util.regex.Pattern;

import javax.swing.JPasswordField;

import BusinessLogic.Facades.UserManagement;

public class Register extends JFrame implements Views.AbstractView {
	private JTextField userName;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField mail;
	private JTextField phone;
	private JPasswordField password;
	private JPasswordField password2;

/**
 */
    public void validation() {        
        // your code here
    }

@Override
public void display() {
	// TODO Auto-generated method stub
	
}

@Override
public void hide() {
	// TODO Auto-generated method stub
	
} 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setResizable(false);
		setTitle("Register");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		userName = new JTextField();
		userName.setBounds(220, 11, 86, 20);
		getContentPane().add(userName);
		userName.setColumns(10);
		
		JLabel lblId = new JLabel("Username");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(50, 14, 160, 14);
		getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(50, 45, 160, 14);
		getContentPane().add(lblPassword);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(220, 101, 86, 20);
		getContentPane().add(firstName);
		
		JLabel lblName = new JLabel("First name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(50, 104, 160, 14);
		getContentPane().add(lblName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(220, 132, 86, 20);
		getContentPane().add(lastName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(50, 135, 160, 14);
		getContentPane().add(lblLastName);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(220, 163, 86, 20);
		getContentPane().add(mail);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(50, 166, 160, 14);
		getContentPane().add(lblEmail);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(220, 194, 86, 20);
		getContentPane().add(phone);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelephone.setBounds(50, 197, 160, 14);
		getContentPane().add(lblTelephone);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Quand le boutton OK est actionné
				if(userName.getText().isEmpty() || lastName.getText().isEmpty() || firstName.getText().isEmpty() || mail.getText().isEmpty() || phone.getText().isEmpty() || password.getText().isEmpty() || password2.getText().isEmpty()){
					//Si un champ n'est pas rempli
					JOptionPane.showMessageDialog(null,"Please fill out all fields completely.","Inane warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(!Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", mail.getText())){
					//Regexp pour vérifier la validité du mail
					JOptionPane.showMessageDialog(null,"Your email adress is not correct.","Inane warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(!Pattern.matches("^[0-9]{10}", phone.getText())){
					//Vérifier la validité du téléphone
					JOptionPane.showMessageDialog(null,"Please enter your phone number like this : 0123456789.","Inane warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(!password.getText().equals(password2.getText())){
					//Vérifier que les mots de passes sont égauxs
					JOptionPane.showMessageDialog(null,"Please match your passwords.","Inane warning",JOptionPane.WARNING_MESSAGE);
				}
				else{
					//Tout va bien, on valide l'inscription
					UserManagement.registerUser(userName.getText(), lastName.getText(), firstName.getText(), mail.getText(), phone.getText(), password.getText());
				}
			}
		});
		btnOk.setBounds(220, 228, 86, 32);
		getContentPane().add(btnOk);
		
		password = new JPasswordField();
		password.setBounds(220, 42, 86, 20);
		getContentPane().add(password);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setBounds(50, 73, 160, 14);
		getContentPane().add(lblConfirmPassword);
		
		password2 = new JPasswordField();
		password2.setBounds(220, 70, 86, 20);
		getContentPane().add(password2);
	}
}
