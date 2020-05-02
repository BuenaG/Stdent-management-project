package Gestiondesetudiants;

public class Prof {
	
		private String id_prof;
		private String nom,prenom,email;
		private String addresse,ville,codePostal,pays,telefone;


		public Prof() {}

		public Prof(String id_prof, String nom, String prenom, String email,  String addresse, String ville, 
				String codePostal, String pays, String telefone) {
			super();
			this.id_prof = id_prof;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.addresse = addresse;
			this.ville = ville;
			this.codePostal = codePostal;
			this.pays = pays;
			this.telefone = telefone;
		}

		
		public String getId_prof() {
			return id_prof;
		}
		public void setId_prof(String id_prof) {
			this.id_prof = id_prof;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddresse() {
			return addresse;
		}
		public void setAddresse(String addresse) {
			this.addresse = addresse;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public String getCodePostal() {
			return codePostal;
		}
		public void setCodePostal(String codePostal) {
			this.codePostal = codePostal;
		}
		public String getPays() {
			return pays;
		}
		public void setPays(String pays) {
			this.pays = pays;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String toString()
		{
			return nom+" "+prenom;
		}
		}



