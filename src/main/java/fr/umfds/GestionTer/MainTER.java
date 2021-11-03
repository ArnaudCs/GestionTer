package fr.umfds.GestionTer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainTER {
	public static void main(String[] arguments)
	{ 
		ArrayList<Integer> membreG1 = new ArrayList<Integer>();
		ArrayList<Integer> membreG2 = new ArrayList<Integer>();
		Etudiant E3 = new Etudiant("Maxime", "Bourret", 219485);
				
		Groupe G1 = new Groupe(213, "GroupeB", 145, membreG1);
		Groupe G2 = new Groupe(213, "GroupeB", 150, membreG2);
		G2.ajoutetudiant(E3.getid());
		System.out.println(G1.getmembre());
		System.out.println(G1.getmembre() == "[111111]");
		
		ObjectMapper objectMapper = new ObjectMapper(); 
		Etudiant E1 = new Etudiant("Cossu", "Arnaud", 215451, 1254);
		try {
			objectMapper.writeValue(new File("target/etudiant.json"), E1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Etudiant listeEtudiants = objectMapper.readValue(Paths.get("target/etudiant.json").toFile(), Etudiant.class);
			System.out.println(listeEtudiants);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}

