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
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

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
		
		textField = new JTextField();
		textField.setBounds(220, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("Username");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(146, 14, 64, 14);
		getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(146, 45, 64, 14);
		getContentPane().add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 73, 86, 20);
		getContentPane().add(textField_2);
		
		JLabel lblName = new JLabel("First name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(146, 76, 64, 14);
		getContentPane().add(lblName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(220, 104, 86, 20);
		getContentPane().add(textField_3);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(146, 107, 64, 14);
		getContentPane().add(lblLastName);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(220, 135, 86, 20);
		getContentPane().add(textField_4);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(146, 138, 64, 14);
		getContentPane().add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(220, 166, 86, 20);
		getContentPane().add(textField_5);
		
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 42, 86, 20);
		getContentPane().add(passwordField);
	}
}
