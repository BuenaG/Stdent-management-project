package GUI;

import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import DB.LinkDatabase;


public class MainWindow extends JFrame {
	
	public static LinkDatabase linkDB;
	
	public MainWindow()
	{
		linkDB = new LinkDatabase();
		
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel panel1 = new GestionEtudiants();
		tabbedPane.addTab("Gestion des Etudiants", panel1);
		
		JPanel panel2 = new GestionCours();
		tabbedPane.addTab("Gestion des Cours", panel2);
		
		JPanel panel3 = new GestionProf();
		tabbedPane.addTab("Gestion des Profs", panel3);
		
		JPanel panel4 = new GestionGroupe();
	    tabbedPane.addTab("Groupes", panel4);

	    JPanel panel5 = new GestionResultat();
	    tabbedPane.addTab("Gestion des Resultats", panel5);
	    
	    JPanel panel6= new GestionSuivre();
	    tabbedPane.addTab("Suivre", panel6);
		
		getContentPane().add(tabbedPane);

		setSize(800,600);
		setVisible(true);
	}
}