package login;

import javax.swing.*;

import GUI.MainWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
	Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    


    public LoginFrame() {

    	Box bv = Box.createVerticalBox();
    	Box bh1 = Box.createHorizontalBox();
    	Box bh2 = Box.createHorizontalBox();
    	Box bh3 = Box.createHorizontalBox();
    	Box bh4 = Box.createHorizontalBox();
    	loginButton.addActionListener(new ButtonListener());
    	resetButton.addActionListener(new ButtonListener());
    	
    	bh1.add(userLabel);
    	bh1.add(userTextField);
    	bh2.add(passwordLabel);
    	bh2.add(passwordField);
    	bh3.add(loginButton);
    	bh3.add(resetButton);
    	bv.add(Box.createVerticalStrut(20));
    	bv.add(bh1);
    	bv.add(bh2);
    	bv.add(bh3);
    	bv.add(Box.createVerticalGlue());
    	getContentPane().add(bv);
    	
    	
    	setVisible(true);
    	setSize (400,300);
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	
    	
    } 
    
    public class ButtonListener implements ActionListener{

    	@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		if (e.getSource()==loginButton)
    		{
    			String user = userTextField.getText();
    			String password = new String(passwordField.getPassword());
    			
    			/*if (user.equals("Grace") && password.equals("123456"))
    			{*/
        			MainWindow window = new MainWindow();
        			setVisible(false);	
    			/*}*/
    			
    		}
    		else if (e.getSource()==resetButton){
    			userTextField.setText("");
    			passwordField.setText("");
    			
    		}
        	System.out.println(e.getSource());
    		
    	}

    }
    
    
}
    
    