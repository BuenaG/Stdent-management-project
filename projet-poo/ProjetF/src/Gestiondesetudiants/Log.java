package Gestiondesetudiants;
import java.awt.Color;

import javax.swing.*;

public class Log extends JFrame {

	public static void main(String[] args) {
		new Log();
		
	}

	private JPanel p1;
	private JLabel l1, l2;
	private JTextField t1;
	private JPasswordField pass;
	private JButton b1,b2;
	private ImageIcon img;
	
	Log() {
		p1= new JPanel ();
		p1.setLayout(null);
		p1.setBackground(new Color (200,200,100));
		
		img = new ImageIcon(getClass().getResource("/Gestiondesetudiants/User-icon.png"));
		l1 = new JLabel (img);
		l1.setBounds(0, 0, 200, 300);
		this.add(l1);
		
	}
	
	
	
	
}

