package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Gestiondesetudiants.Cours;
import Gestiondesetudiants.Etudiants;
import Gestiondesetudiants.Groupe;
import Gestiondesetudiants.Prof;
import Gestiondesetudiants.Resultat;
import Gestiondesetudiants.Suivre;

import java.util.Date;


public class LinkDatabase {

	private Database db;

	public LinkDatabase () 
	{
		db = new Database ();

	}
	public ArrayList<Etudiants> getAllEtudiants (){
		try {
			/**
			 * Statement, pour ex�cuter des requ�tes 
			 * Le ResultSet contient le r�sultat de la requ�te "SELECT" !
			 */
			Statement statement = db.getStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM etudiants");
			ArrayList<Etudiants> liste = new ArrayList<Etudiants>();

			while(rs.next()){

				String id_etudiant = rs.getString("id_etudiant");
				String groupe = rs.getString("groupe");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String birth_day = rs.getString("birth_day");
				String sexe = rs.getString("sexe"); 
				String email = rs.getString("email");
				String addresse = rs.getString("addresse"); 
				String ville = rs.getString("ville");
				String codePostal = rs.getString("codePostal"); 
				String pays = rs.getString("pays");
				String telefone = rs.getString("telefone"); 

				
				Etudiants etudiant = new Etudiants(id_etudiant, groupe, nom, prenom, birth_day, sexe, email,  
						 addresse, ville, codePostal, pays, telefone);
				liste.add(etudiant);
			} 
			return liste;
		}
			catch(Exception ex)
			{	System.out.println("Connection failed...");
				System.out.println(ex);}
     		return null;	
		}		
		
	public ArrayList<Cours> getAllCours (){
		try {
			Statement statement = db.getStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM cours");
			ArrayList<Cours> liste = new ArrayList<Cours>();

			while(rs.next()){

				
				
				String id_cours = rs.getString("id_cours");
				String nom_cours = rs.getString("nom_cours");
				String prof = rs.getString("prof");
			
				Cours cour = new Cours(id_cours, nom_cours,prof);
				liste.add(cour);
				
			} 
			return liste;
		}
			catch(Exception ex) {
				System.out.println("Connection failed...");
				System.out.println(ex);}
		
	
	return null;
}
	public ArrayList<Prof> getAllProf (){
		try {
			Statement statement = db.getStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM prof");
			ArrayList<Prof> liste = new ArrayList<Prof>();

			while(rs.next()){

				String id_prof = rs.getString("id_prof");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String addresse = rs.getString("addresse"); 
				String ville = rs.getString("ville");
				String codePostal = rs.getString("codePostal"); 
				String pays = rs.getString("pays");
				String telefone = rs.getString("telefone"); 

				
				Prof proff = new Prof(id_prof, nom, prenom, email, 
						addresse, ville, codePostal, pays, telefone);
				liste.add(proff);
			} return liste;
		}
			catch(Exception ex)
			{	System.out.println("Connection failed...");
				System.out.println(ex);}
     		return null;	
		}	
	
	public ArrayList<Groupe> getAllGroupe (){
		try {
			Statement statement = db.getStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM groupe");
			
			ArrayList<Groupe> liste = new ArrayList<Groupe>();

			while(rs.next()){

				
				
				String id_groupe = rs.getString("id_groupe");
				String groupeName = rs.getString("groupeName");
				
			
				
				Groupe grou = new Groupe(id_groupe, groupeName);
				liste.add(grou);
				
			} 
			return liste;
		}
			catch(Exception ex) {
				System.out.println("Connection failed...");
				System.out.println(ex);}
		
	
	return null;
}
	
	public ArrayList<Resultat> getAllResultat (){
		try {
			Statement statement = db.getStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM resultat");
			
			ArrayList<Resultat> liste = new ArrayList<Resultat>();

			while(rs.next()){

				
				
				String id_resultat = rs.getString("id_resultat");
				String etudiant = rs.getString("etudiant");
				String points = rs.getString("points");
				String prof = rs.getString("prof");
				String cours = rs.getString("cours");
				
			
				
				Resultat resul = new Resultat(id_resultat, etudiant, points, prof, cours);
				liste.add(resul);
				
			} 
			return liste;
		}
			catch(Exception ex) {
				System.out.println("Connection failed...");
				System.out.println(ex);}
		
	
	return null;
}
	
	public ArrayList<Suivre> getAllSuivre (){
		try {
			Statement statement = db.getStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM suivre");
			
			ArrayList<Suivre> liste = new ArrayList<Suivre>();

			while(rs.next()){

				
				
				String id_etudiant = rs.getString("id_etudiant");
				String id_cours = rs.getString("id_cours");
				
			
				
				Suivre suiv = new Suivre(id_etudiant, id_cours);
				liste.add(suiv);
				
			} 
			return liste;
		}
			catch(Exception ex) {
				System.out.println("Connection failed...");
				System.out.println(ex);}
		
	
	return null;
}	

	
	public void ajouterEtudiants(Etudiants etudiant1)  {
		
		PreparedStatement ps = null; 
		try {
			ps=db.getConnection().prepareStatement("INSERT INTO etudiants (id_etudiant, groupe, nom, prenom, birth_day, sexe, email,  addresse, ville, codePostal, pays, telefone) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			  
			    ps.setString(1,etudiant1.getid_etudiant());
				ps.setString(2,etudiant1.getgroupe());
			    ps.setString(3,etudiant1.getnom());
				ps.setString(4,etudiant1.getprenom());
				ps.setString(5,etudiant1.getbirth_day());
				ps.setString(6,etudiant1.getville()); 
				ps.setString(7,etudiant1.getemail());
				ps.setString(8,etudiant1.getaddresse()); 
			    ps.setString(9, etudiant1.getville());
				ps.setString(10, etudiant1.getcodePostal()); 
				ps.setString(11,etudiant1.getpays());
				ps.setString(12, etudiant1.gettelefone());  
				  ps.executeUpdate();   
		          ps.close();   
		        
			  
			 			
			
		} catch (Exception ex) {
			System.out.println("Connection failed...");
			System.out.println(ex);}
	


		
	}
	
	public void ajouterCours(Cours cour1)  {
		
		PreparedStatement ps = null; 
		try {
			ps=db.getConnection().prepareStatement("INSERT INTO cours (id_cours, nom_cours, prof) VALUES (?,?,?)");
			  
			    ps.setString(1,cour1.getId_cours());
				ps.setString(2,cour1.getNom_cours());
			    ps.setString(3,cour1.getProf());
				
				  ps.executeUpdate();   
		          ps.close();   
		        
			  
			 			
			
		} catch (Exception ex) {
			System.out.println("Connection failed...");
			System.out.println(ex);}
		
		
	}
	public void ajouterGroupe(Groupe groupe1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public void modifierEtudiants(Etudiants etudiant1) {
		
		PreparedStatement ps = null; 
		try {
			ps=db.getConnection().prepareStatement("UPDATE etudiants SET id_etudiant=?, groupe=?, nom=?, prenom=?, birth_day=?, sexe=?, email=?,  addresse=?, ville=?, codePostal=?, pays=?, telefone=? WHERE id_etudiant=?");
			  
			    ps.setString(1,etudiant1.getid_etudiant());
				ps.setString(2,etudiant1.getgroupe());
			    ps.setString(3,etudiant1.getnom());
				ps.setString(4,etudiant1.getprenom());
				ps.setString(5,etudiant1.getbirth_day());
				ps.setString(6,etudiant1.getville()); 
				ps.setString(7,etudiant1.getemail());
				ps.setString(8,etudiant1.getaddresse()); 
			    ps.setString(9, etudiant1.getville());
				ps.setString(10, etudiant1.getcodePostal()); 
				ps.setString(11,etudiant1.getpays());
				ps.setString(12, etudiant1.gettelefone());  
				  ps.executeUpdate();   
		          ps.close();   
		        
			  
			 			
			
		} catch (Exception ex) {
			System.out.println("Connection failed...");
			System.out.println(ex);}
	


		
	}
	
	
}


