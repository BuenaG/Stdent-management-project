package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.sql.Statement;
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

import Gestiondesetudiants.Etudiants;
import login.LoginFrame.ButtonListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;




public class GestionEtudiants extends JPanel {
	JButton ajouterButton = new JButton ("Ajouter");
	JButton modifierButton = new JButton ("Modifier");
	JButton supprimerButton = new JButton ("Supprimer");
	JButton clearButton = new JButton ("Reset");
	JButton quitterButton = new JButton ("Quitter");
	
	JLabel id_etudiantLabel = new JLabel("ID etudiant:");
	JLabel groupeLabel = new JLabel("Groupe:");
	JLabel nomLabel = new JLabel("Nom:");
	JLabel prenomLabel = new JLabel("Prenom:");
	JLabel birth_dayLabel = new JLabel("Date de Naissance:");
	JLabel sexeLabel = new JLabel("Sexe:");
	JLabel emailLabel = new JLabel("Email:");
	JLabel addresseLabel = new JLabel("Adresse:");
	JLabel villeLabel = new JLabel("Ville:");
	JLabel codePostalLabel = new JLabel("Code Postal:");
	JLabel paysLabel = new JLabel("Pays:");
	JLabel telefoneLabel = new JLabel("Telephone:");
	
	JTextField id_etudiantTextField = new JTextField();
	JTextField groupeTextField = new JTextField();
	JTextField nomTextField = new JTextField();
	JTextField prenomTextField = new JTextField();
	JTextField birth_dayTextField = new JTextField();
	JTextField sexeTextField = new JTextField();
	JTextField emailTextField = new JTextField();
	JTextField addresseTextField = new JTextField();
	JTextField villeTextField = new JTextField();
	JTextField codePostalTextField = new JTextField();
	JTextField paysTextField = new JTextField();
	JTextField telefoneTextField = new JTextField();
	
	
	ArrayList<Etudiants> listeEtudiants;
	
	public GestionEtudiants() 
	{
		listeEtudiants = MainWindow.linkDB.getAllEtudiants();  
		System.out.println(listeEtudiants);
		
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
    	Box bh10 = Box.createHorizontalBox();
    	Box bh11 = Box.createHorizontalBox();
    	Box bh12 = Box.createHorizontalBox();
    	Box bh13 = Box.createHorizontalBox();
    	Box bh14 = Box.createHorizontalBox();
    	Box bh15 = Box.createHorizontalBox();
    	Box bh16 = Box.createHorizontalBox();
    	Box bh17 = Box.createHorizontalBox();
    	Box bh18 = Box.createHorizontalBox();
    	
		Box bv1 = Box.createVerticalBox();
		Box bv2= Box.createVerticalBox();
		
		
		
		

	// etudiant1 , 2 vont etre remplac� par notre base de donn�es)
	JList<Etudiants> etudiants = new JList(listeEtudiants.toArray());
	 
	 etudiants.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	 etudiants.addListSelectionListener(
             new ListSelectionListener() {
                  public void valueChanged(ListSelectionEvent e) {
                	
                	  Etudiants element = (Gestiondesetudiants.Etudiants) etudiants.getSelectedValue();
                	  
                	   
                	 
                	   id_etudiantTextField.setText(element.getid_etudiant());
                	   groupeTextField.setText(element.getgroupe());
                	   nomTextField.setText(element.getnom());
                       prenomTextField.setText(element.getprenom());
                       birth_dayTextField.setText(element.getbirth_day());
                       sexeTextField.setText(element.sexe());
                       emailTextField.setText(element.getemail());
                       addresseTextField.setText(element.getaddresse());
                       villeTextField.setText(element.getville());
                       codePostalTextField.setText(element.getcodePostal());
                       paysTextField.setText(element.getpays());
                       telefoneTextField.setText(element.gettelefone());
                        
                  }
             });
	
	  
	 
	 
	//pour ajouter scolling line
	JScrollPane listScroller = new JScrollPane(etudiants);
	//listScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	 
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
	bv2.add(bh10);
	bv2.add(bh11);
	bv2.add(bh12);
	
	nomTextField.setColumns(30);
	prenomTextField.setColumns(30);
	sexeTextField.setColumns(2);
	
	bh1.add(id_etudiantLabel);
	bh1.add(Box.createHorizontalGlue());
	bh1.add(id_etudiantTextField);
	
	bh2.add(groupeLabel);
	bh2.add(Box.createHorizontalGlue());
	bh2.add(groupeTextField);
	
	bh3.add(nomLabel);
	bh3.add(Box.createHorizontalGlue());
	bh3.add(nomTextField);
	
	bh4.add(prenomLabel);
	bh4.add(Box.createHorizontalGlue());
	bh4.add(prenomTextField);
	
	bh5.add(birth_dayLabel);
	bh5.add(Box.createHorizontalGlue());
	bh5.add(birth_dayTextField);
	
	bh6.add(sexeLabel);
	bh6.add(Box.createHorizontalGlue());
	bh6.add(sexeTextField);
	
	bh7.add(emailLabel);
	bh7.add(Box.createHorizontalGlue());
	bh7.add(emailTextField);
	
	bh8.add(addresseLabel);
	bh8.add(Box.createHorizontalGlue());
	bh8.add(addresseTextField);
	
	bh9.add(villeLabel);
	bh9.add(Box.createHorizontalGlue());
	bh9.add(villeTextField);
	
	bh10.add(codePostalLabel);
	bh10.add(Box.createHorizontalGlue());
	bh10.add(codePostalTextField);
	
	bh11.add(paysLabel);
	bh11.add(Box.createHorizontalGlue());
	bh11.add(paysTextField);
	
	bh12.add(telefoneLabel);
	bh12.add(Box.createHorizontalGlue());
	bh12.add(telefoneTextField);
	
	ajouterButton.addActionListener(new ButtonListener());
	bh13.add(Box.createHorizontalStrut(20));
	bh13.add(ajouterButton);
	bh13.add(Box.createHorizontalGlue());
	
	modifierButton.addActionListener(new ButtonListener());
	bh14.add(Box.createHorizontalStrut(20));
	bh14.add(modifierButton);
	bh14.add(Box.createHorizontalGlue());
	
	supprimerButton.addActionListener(new ButtonListener());
	bh15.add(Box.createHorizontalStrut(20));
	bh15.add(supprimerButton);
	bh15.add(Box.createHorizontalGlue());
	
	clearButton.addActionListener(new ButtonListener());
	bh16.add(Box.createHorizontalStrut(20));
	bh16.add(clearButton);
	bh16.add(Box.createHorizontalGlue());
	
	quitterButton.addActionListener(new ButtonListener());
	bh17.add(Box.createHorizontalStrut(20));
	bh17.add(quitterButton);
	bh17.add(Box.createHorizontalGlue());
	
	this.add(bh);
	bv1.add(listScroller);
	bv2.add(Box.createVerticalGlue());
	bv2.add(Box.createVerticalStrut(100));
	bv2.add(bh18);
	bh18.add(bh13);
	bh18.add(bh14);
	bh18.add(bh15);
	bh18.add(bh16);
	bh18.add(bh17);
		
	}
	
    
	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==ajouterButton) {
				ajouterButton.setToolTipText("Cliquez ici pour ajouter le �tudiant.");
//			     MainWindow.linkDB.ajouterEtudiants(null);//yannick
//			     JList etudiants = new JList (listeEtudiants.toArray()); //yannick
			// String id_etudiant, groupe, nom, prenom, birth_day, sexe, email,  addresse, ville, codePostal, pays, telefone;
//             Etudiants etudiant1=new Etudiants(); //yannick
           
             //etudiant1.id_etudiant=id_etudiant.getText();
               try {
            	String id_etudiant = id_etudiantTextField.getText();
   				String groupe1 = groupeTextField.getText();
   				String nom = nomTextField.getText();
   				String prenom = prenomTextField.getText();
   				String birth_day = birth_dayTextField.getText();
   				String sexe = sexeTextField.getText().trim();
   				String email = emailTextField.getText();
   				String addresse = addresseTextField.getText();
   				String ville = villeTextField.getText();
   				String codePostal = codePostalTextField.getText();
   				String pays = paysTextField.getText();
   				String telefone = telefoneTextField.getText();

   				
   				Etudiants etudiant1 = new Etudiants(id_etudiant, groupe1, nom, prenom, birth_day, sexe, email,  
   						 addresse, ville, codePostal, pays, telefone);
   				MainWindow.linkDB.ajouterEtudiants(etudiant1);
   				
            	   
               } catch(Exception ex) {
            	  System.out.println("Connection failed...");
   				  System.out.println(ex);
               }
				
			
            
             		
							
				
			} else if (e.getSource() == modifierButton) {
				
	//			 MainWindow.linkDB.modifierEtudiants(null);
				
				
		       
		    } else if (e.getSource() == supprimerButton) {
		    	supprimerButton.setToolTipText("Cliquez ici pour supprimer le �tudiant");
		    //	 MainWindow.linkDB.modifierEtudiants(null);
		    	 
		    	
		    	
		    } else if (e.getSource() == clearButton) {
		        // do other stuff
		    	 
		             //Clearing Fields
		         /*    id_etudiantTextField.setText("");
		             groupeTextField.setText("");
		             nomTextdField.setText("");
		             prenomTextField.setText("");
		             birth_dayTextField.setText("");
		             sexeTextField.setText("");
		             emailTextField.setText("");
		             addresseTextField.setText("");
		             villeTextField.setText("");
		             codePostalTextField.setText("");
		             paysTextField.setText("");
		             telefoneTextField.setText("");*/
		         
		    	
		    	
		    } else if (e.getSource() == quitterButton) {
		    	quitterButton.setToolTipText("Cliquez ici pour fermer le programme.");
		    	
		    	System.exit(0);
		    }
				System.out.println(e.getSource());
				
			} 
		
			
		}
		
		

	}  		

