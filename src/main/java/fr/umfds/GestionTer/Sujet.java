package fr.umfds.GestionTer;

public class Sujet{
	
	  private int id;
	  private String titre;
	  private int idgroupe;
	  private int idens;
	  

	  public Sujet(){
	    id = 0000;
	    titre = "Inconnu";
	    idgroupe = 0;
	    idens = 0;
	  }
	  
	  public Sujet(int id, String titre){
		 this.id = id;
		 this.titre = titre;
		 this.idgroupe = 0;
	  }

	  public Sujet(int id, String titre, int idg){
	     this.id = id;
	     this.titre = titre;
		 this.idgroupe=idg;
	  }
		  
	  public Sujet(int id, String titre, int idg, int idens) {
		 this.id = id;
		 this.titre = titre;
		 this.idgroupe=idg;
		 this.idens = idens;
	  }
	  
	  public String gettitre() {return this.titre;}
	  public int getid() {return this.id;}
	  public void setidg(int idg) {this.idgroupe = idg;}
	  public int getidg() {return this.idgroupe;}
	  
	  /*public Sujet getsujet() {
		  return Sujet;
	  }*/
	  
	  public void setTitre(String titre) {this.titre = titre;}
	  public void setId(int id){this.id = id;} 
	  
	  public String affichage() {return ("\nTitre du sujet : " + this.gettitre() + "\nId du sujet : " + this.getid() + "\nId du groupe : " + this.getidg());}
	  
	  @Override
	  public String toString() {
			return String.format("\nTitre du sujet : " + this.gettitre() + "\nId du sujet : " + this.getid() + "\nId du groupe : " + this.getidg());
	  }
}




