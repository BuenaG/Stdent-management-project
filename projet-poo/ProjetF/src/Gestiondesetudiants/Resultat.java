package Gestiondesetudiants;

import java.util.Date;

public class Resultat {


	private String id_resultat, etudiant, points, prof, cours;
	
	


	public Resultat() {}

	
	public Resultat(String id_resultat, String etudiant, String points, String prof, String cours) {
		super();
		this.id_resultat = id_resultat;
		this.etudiant = etudiant;
		this.points = points;
		this.prof = prof;
		this.cours = cours;
		
	}

	public String getId_resultat() {
		return id_resultat;
	}
	public void setId_resultat(String id_resultat) {
		this.id_resultat = id_resultat;
	}
	
	public String getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(String etudiant) {
		this.etudiant = etudiant;
	}
	
	public String getpoints() {
		return points;
	}
	public void setpoints(String points) {
		this.points = points;
	}
	
	public String getprof() {
		return prof;
	}
	public void setprof(String prof) {
		this.prof = prof;
	}
	
	
	public String getcours() {
		return cours;
	}
	public void setcours(String cours) {
		this.cours = cours;
	}
	
	public String toString()
	{
		return etudiant+" "+points;
	}

	}

