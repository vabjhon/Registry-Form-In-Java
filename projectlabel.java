package labelProject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class projectlabel extends JFrame
{

	public static JLabel jLabelLoginEmail,jLabelLoginPassword;
	public static JTextField jTextFieldLoginEmail,jTextFieldLoginPassword;
	public static JPasswordField passwordField;
	public static JButton jButtonLogin;
	
	projectlabel()
	{
		//login Email
		jLabelLoginEmail = new JLabel("EMAIL");
		jLabelLoginEmail.setBounds(20, 20, 80, 20);
		add(jLabelLoginEmail);
		
		jTextFieldLoginEmail = new JTextField();
		jTextFieldLoginEmail.setBounds(100, 20, 80, 20);
		add(jTextFieldLoginEmail);
		
		jLabelLoginPassword = new JLabel("Password");
		jLabelLoginPassword.setBounds(20, 60, 80, 20);
		add(jLabelLoginPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100,60,80,20);
		add(passwordField);
		
		jButtonLogin = new JButton("Login");
		jButtonLogin.setBounds(200,80,100,40);
		add(jButtonLogin);
		
		setTitle("Login Form");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		projectlabel projectlabelObj = new projectlabel();
		

	}

}
