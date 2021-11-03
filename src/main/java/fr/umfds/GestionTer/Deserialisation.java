package fr.umfds.GestionTer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {
	public static void main(String[] arguments)
	{
		Etudiant E1 = new Etudiant("Arnaud", "Cossu", 21901021);
		Etudiant E3 = new Etudiant("Maxime", "Bourret", 219485);
		
		try {
			FileInputStream fis = new FileInputStream("Etudiant.json");
			ObjectInputStream ois = new ObjectInputStream(fis);	
			Etudiant etudiant1 = (Etudiant)ois.readObject();
			Etudiant etudiant2 = (Etudiant)ois.readObject();

			System.out.println(etudiant1);
			System.out.println(etudiant2);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
