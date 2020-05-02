package Gestiondesetudiants;

public class Suivre {


	private String id_etudiant;
	private String id_cours;
	


	public Suivre() {}

	
	public Suivre(String id_etudiant, String id_cours) {
		super();
		this.id_etudiant = id_etudiant;
		this.id_cours = id_cours;
		
	}

	public String getId_etudiant() {
		return id_etudiant;
	}
	public void setId_resultat(String id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	
		
	public String getid_cours() {
		return id_cours;
	}
	public void setid_cours(String id_cours) {
		this.id_cours = id_cours;
	}
	
	public String toString()
	{
		return id_etudiant+" "+id_cours;
	}

	}

