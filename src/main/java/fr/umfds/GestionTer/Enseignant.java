package fr.umfds.GestionTer;

public class Enseignant{
	private String nom;
	private String prenom;
	private int id;
	private int idSujet;
	
	public Enseignant(String nom, String prenom, int id, int ids){
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.idSujet = ids;
	} 
	
	public Enseignant(String nom, String prenom, int id){
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.idSujet = 0;
	}
	
	public String getnom() {return this.nom;}
	public String getprenom() {return this.prenom;}
	public int getid() {return this.id;}
	public void setids(int ids) {this.idSujet=ids;}
	public int getids() {return this.idSujet;}
	
	public String affichage() {
		return ("\nNom de l'enseignant : " + this.getnom() + "\nPrenom de l'enseignant : " + this.getprenom() + "\nId de l'enseignant : " 
				+ this.getid() + "\nId du sujet : " + this.getids());
	}
}

