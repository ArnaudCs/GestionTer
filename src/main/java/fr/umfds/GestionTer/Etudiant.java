package fr.umfds.GestionTer;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Etudiant implements Serializable{
	private String nom;
	private String prenom;
	private int id;
	private int idgroupe;
	private ArrayList<Integer> membre;

	public void ajoutetudiant(int id) {membre.add(id);}
	
	public Etudiant() {
		this.nom = "";
		this.prenom = "";
		this.id = 0 ;
		this.idgroupe = 0;
	}
	
	public Etudiant(String nom, String prenom, int id){
		this.nom=nom;
		this.prenom=prenom;
		this.id=id;
		this.idgroupe = 0;
	}
	
	public Etudiant(String nom, String prenom, int id, int idgroupe){
		this.nom=nom;
		this.prenom=prenom;
		this.id=id;
		this.idgroupe = idgroupe;
	}
	
	public String getnom() {return this.nom;}
	public String getprenom() {return this.prenom;}
	public int getid() {return this.id;}
	public void setGroupe(int id) {this.idgroupe = id;}
	public int getidgroupe() {return this.idgroupe;}
	public void suppgroupe() { 
		this.idgroupe = 0;
	}

	public String affichage() {
		return ("\nNom de l'étudiant : " + this.getnom() + "\nPrenom de l'etudiant: " + this.getprenom() 
			+ "\nId de l'etudiant : " + this.getid() + "\nId du groupe : " + this.getidgroupe());
	}
	
	@Override
	public String toString() {
		return String.format("\nNom de l'étudiant : " + this.getnom() + "\nPrenom de l'etudiant: " + this.getprenom() 
		+ "\nId de l'etudiant : " + this.getid() + "\nId du groupe : " + this.getidgroupe());
	}
}


