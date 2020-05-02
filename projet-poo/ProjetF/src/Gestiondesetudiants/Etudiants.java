
package Gestiondesetudiants;

import java.util.Date;

public class Etudiants {


	public String id_etudiant;
	private String groupe;
	private String nom,prenom,sexe, email;
	private String birth_day;
	private String addresse,ville,codePostal,pays,telefone;


	public Etudiants() {}

	
	public Etudiants(String id_etudiant, String groupe, String nom, String prenom, String birth_day,  String sexe, String email,  String addresse,
			String ville, String codePostal, String pays, String telefone) {
		super();
		this.id_etudiant = id_etudiant;
		this.groupe = groupe;
		this.nom = nom;
		this.prenom = prenom;
		this.birth_day = birth_day;
		this.sexe = sexe;
		this.email = email;
		this.addresse = addresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
		this.telefone = telefone;
	}

	public String getid_etudiant() {
		return id_etudiant;
	}
	public void setid_etudiant(String id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	public String getgroupe() {
		return groupe;
	}
	public void setgroupe(String groupe) {
		this.groupe = groupe;
	}
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	public String getprenom() {
		return prenom;
	}
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	public String sexe() {
		return sexe;
	}
	public void setsexe(String sexe) {
		this.sexe = sexe;
	}
	public String getemail() {
		return email;
	}
	public void email(String email) {
		this.email = email;
	}
	public String getbirth_day() {
		return birth_day;
	}
	public void setbirth_day(String birth_day) {
		this.birth_day = birth_day;
	}
	
	public String getaddresse() {
		return addresse;
	}
	public void setaddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getville() {
		return ville;
	}
	public void setville(String ville) {
		this.ville = ville;
	}
	public String getcodePostal() {
		return codePostal;
	}
	public void setcodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getpays() {
		return pays;
	}
	public void setpays(String pays) {
		this.pays = pays;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString()
	{
		return nom+" "+prenom;
	}


	}
