package com.ust.srs.ui;

import java.awt.GridLayout;

import javax.swing.*;

public class LoginUI extends JFrame{
	private JTextField userID;
	private JPasswordField pass;
	private JButton loginButton;
	
	public LoginUI() {
		setTitle("QappalShips Ship Reservation Services");
		setSize(400,200);
		setLayout(new GridLayout(3,2));
		
		add(new JLabel("User ID: "));
		userID=new JTextField();
		add(userID);
		
		add(new JLabel("Password: "));
		pass=new JPasswordField();
		add(pass);
		
		loginButton=new JButton("Login");
		add(loginButton);
		
		//loginButton.addActionListener(e-> Login());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	private void Login() {
	String user= userID.getText();
	String password=new String(pass.getPassword());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(LoginUI::new);
	}
}