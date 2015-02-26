package Views.UserManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
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
import javax.swing.JPasswordField;

public class Register extends JFrame implements Views.AbstractView {
	private JTextField userName;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField mail;
	private JTextField phone;
	private JPasswordField password;

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
		lblId.setBounds(146, 14, 64, 14);
		getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(146, 45, 64, 14);
		getContentPane().add(lblPassword);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(220, 73, 86, 20);
		getContentPane().add(firstName);
		
		JLabel lblName = new JLabel("First name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(146, 76, 64, 14);
		getContentPane().add(lblName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(220, 104, 86, 20);
		getContentPane().add(lastName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(146, 107, 64, 14);
		getContentPane().add(lblLastName);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(220, 135, 86, 20);
		getContentPane().add(mail);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(146, 138, 64, 14);
		getContentPane().add(lblEmail);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(220, 166, 86, 20);
		getContentPane().add(phone);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelephone.setBounds(146, 169, 64, 14);
		getContentPane().add(lblTelephone);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Quand le boutton OK est actionné
				
			}
		});
		btnOk.setBounds(146, 197, 160, 53);
		getContentPane().add(btnOk);
		
		password = new JPasswordField();
		password.setBounds(220, 42, 86, 20);
		getContentPane().add(password);
	}
}
