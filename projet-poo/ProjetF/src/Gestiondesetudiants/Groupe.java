package Gestiondesetudiants;

public class Groupe {
	
		        private String id_groupe;
				private String groupeName;
				
				public Groupe() {}

				public Groupe(String id_groupe, String groupeName) {
					super();
					this.id_groupe = id_groupe;
					this.groupeName = groupeName;
					
				}


				public String getId_groupe() {
					return id_groupe;
				}
				public void setId_groupe(String id_groupe) {
					this.id_groupe = id_groupe;
				}
				public String getGroupeName() {
					return groupeName;
				}
				public void setGroupeName(String groupeName) {
					this.groupeName = groupeName;
				}
				public String toString()
				{
					return groupeName;
				}
	}

