package fr.umfds.GestionTer;

import java.io.Serializable;
import java.lang.String; 
import java.util.ArrayList;

public class Groupe implements Serializable{
	
  private int id;
  private String nom;
  private int idSujet;
  private ArrayList<Integer> membre;


  public Groupe(int id, String nom, int idS, ArrayList<Integer> membre){
    this.id = id;
    this.nom = nom;
    this.idSujet = idS;
    this.membre = membre;
  }
  
  public Groupe(int id, String nom, ArrayList<Integer> membre){
	this.id = id;
	this.nom = nom;
	this.idSujet = 0;
	this.membre = membre;
  }
  
  public int getIdsujet() {return idSujet;}
  public String getmembre() {return membre.toString();}
  public int getid() {return this.id;}
  public String getnom() {return this.nom;}
  public int getidsujet() {return this.idSujet;}
  public void setidsujet(int ids) {this.idSujet = ids;}
  
  public void ajoutetudiant(int id) {membre.add(id);}
 
  public String suppgroupe(int id) {
	  int n = membre.size();
	   for(int i = 0; i<n; i++) {
		   if (membre.get(i) == id) {
			   membre.remove(i);
			   return "\nL'étudiant à bien été supprimé\n";
		   }
	   }
	   return "\nL'étudiant n'est pas dans le groupe\n";
  }
 
  public String affichage(){
	  return ("\nId du groupe : " + this.getid() + "\nNom du groupe : " + this.getnom() + "\nId du sujet : " 
			  + this.getidsujet() + "\nMembres du groupe : " + this.getmembre());
  }
}

  
  
  
  
  
  
  
  
  
  
  
  
  