package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

import Gestiondesetudiants.Cours;

import login.LoginFrame.ButtonListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JPanel;

public class GestionCours extends JPanel {
	

	JButton ajouterButton = new JButton ("Ajouter");
	JButton modifierButton = new JButton ("Modifier");
	JButton supprimerButton = new JButton ("Supprimer");
	JButton clearButton = new JButton ("Reset");
	JButton quitterButton = new JButton ("Quitter");
	
	ArrayList<Cours> listeCours;

	public GestionCours()
	{
	
		listeCours = MainWindow.linkDB.getAllCours();  
		System.out.println(listeCours);
    	Box bh = Box.createHorizontalBox();
    	Box bh1 = Box.createHorizontalBox();
    	Box bh2 = Box.createHorizontalBox();
    	Box bh3 = Box.createHorizontalBox();
    	Box bh4 = Box.createHorizontalBox();
    	Box bh5 = Box.createHorizontalBox();
    	Box bh6 = Box.createHorizontalBox();
    	Box bh7 = Box.createHorizontalBox();
    	Box bh8 = Box.createHorizontalBox();
    	Box bh9 = Box.createHorizontalBox();
    	
		Box bv1 = Box.createVerticalBox();
		Box bv2= Box.createVerticalBox();
		
		JLabel id_coursLabel = new JLabel("ID cours:");
		JLabel nom_coursLabel = new JLabel("Nom de cours:");
		JLabel profLabel = new JLabel("Professeur:");
		
		
		JTextField id_coursTextField = new JTextField();
		JTextField nom_coursTextField = new JTextField();
		JTextField profTextField = new JTextField();
		
		

	// etudiant1 , 2 vont etre remplacé par notre base de données)
	JList cours = new JList (listeCours.toArray());

	cours.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	 cours.addListSelectionListener(
            new ListSelectionListener() {
                 public void valueChanged(ListSelectionEvent e) {
               
               	  Cours element = (Gestiondesetudiants.Cours) cours.getSelectedValue();
               	  
               	                 	 
               	      id_coursTextField.setText(element.getId_cours());
               	      nom_coursTextField.setText(element.getNom_cours());
                      profTextField.setText(element.getProf());
                      
                 }
            });
                     
	
	//pour ajouter scolling line
    JScrollPane listScroller = new JScrollPane(cours);
	listScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	 
//mettre 2 box(bv1 et bv2) dans un box (bh)
	bh.add(Box.createHorizontalStrut(20));
	bh.add(bv1);
	bh.add(bv2);
	bv2.add(bh1);
	bv2.add(bh2);
	bv2.add(bh3);
	
	bv2.add(bh4);
	bv2.add(bh5);
	bv2.add(bh6);
	bv2.add(bh7);
	bv2.add(bh8);
	bv2.add(bh9);
	
	
	
	id_coursTextField.setColumns(30);
	nom_coursTextField.setColumns(30);
	profTextField.setColumns(30);
	
	bh1.add(id_coursLabel);
	bh1.add(Box.createHorizontalGlue());
	bh1.add(id_coursTextField);
	
	bh2.add(nom_coursLabel);
	bh2.add(Box.createHorizontalGlue());
	bh2.add(nom_coursTextField);
	
	bh3.add(profLabel);
	bh3.add(Box.createHorizontalGlue());
	bh3.add(profTextField);
	
	
	
	ajouterButton.addActionListener(new ButtonListener());
	bh5.add(ajouterButton);
	
	modifierButton.addActionListener(new ButtonListener());
	bh6.add(modifierButton);
	
	supprimerButton.addActionListener(new ButtonListener());
	bh7.add(supprimerButton);
	
	clearButton.addActionListener(new ButtonListener());
	bh8.add(clearButton);
	
	quitterButton.addActionListener(new ButtonListener());
	bh9.add(quitterButton);
		
	
	this.add(bh);
	bv1.add(listScroller);
	bv1.add(bh5);
	bv1.add(bh6);
	bv1.add(bh7);
	bv1.add(bh8);
	bv1.add(bh9);
	}
	
    public class ButtonListener implements ActionListener {

             		@Override
             		public void actionPerformed(ActionEvent e) {
             			// TODO Auto-generated method stub
             			if (e.getSource()==ajouterButton) {
             				ajouterButton.setToolTipText("Cliquez ici pour ajouter le étudiant.");
             		MainWindow.linkDB.ajouterCours(null);
             				
             		
             		
             			
             				JList cours = new JList (listeCours.toArray());
             				
             			//	ajouterCours();
             				
             				
             			} else if (e.getSource() == modifierButton) {
             		       
             		    } else if (e.getSource() == supprimerButton) {
             		    	supprimerButton.setToolTipText("Cliquez ici pour supprimer le étudiant");
             		    } else if (e.getSource() == clearButton) {
             		        // do other stuff
             		    	
             		    	Label id_coursTextField;
						//	id_coursTextField.setText("");
             	            Label nomTextField;
						//	nomTextField.setText("");
             	         //   profTextField.setText("");
             	            
             		    	
             		    	
             		    } else if (e.getSource() == quitterButton) {
             		    	quitterButton.setToolTipText("Cliquez ici pour fermer le programme.");
             		    	
             		    	System.exit(0);
             		    }
             				System.out.println(e.getSource());
             				
             			
             		}
             		
    }   
    
}
             			
             		
             		
             		
            
                	