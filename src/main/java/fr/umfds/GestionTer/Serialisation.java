package fr.umfds.GestionTer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation {
	public static void main(String[] arguments)
	{
		Etudiant E1 = new Etudiant("Arnaud", "Cossu", 21901021);
		Etudiant E3 = new Etudiant("Maxime", "Bourret", 219485);
		
		try {
			FileOutputStream fos = new FileOutputStream("Etudiant.json");
			ObjectOutputStream oos = new ObjectOutputStream(fos);	
			oos.writeObject(E1);
			oos.writeObject(E3);
			oos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
