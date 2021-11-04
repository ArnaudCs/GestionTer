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
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainTER {
	public static void main(String[] arguments)
	{ 
		ArrayList<Integer> membreG1 = new ArrayList<Integer>();
		ArrayList<Integer> membreG2 = new ArrayList<Integer>();
		Etudiant E3 = new Etudiant("Maxime", "Bourret", 219485);
				
		Groupe G2 = new Groupe(213, "GroupeB", 150, membreG2);
		G2.ajoutetudiant(E3.getid());
		
		ObjectMapper objectMapper = new ObjectMapper(); 
		//objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		Groupe G1 = new Groupe(213, "GroupeB", 145, membreG1);
		G1.ajoutetudiant(125487);
		G1.ajoutetudiant(125496); 

		try {
			objectMapper.writeValue(new File("target/groupe.json"), G1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Groupe groupe = objectMapper.readValue(Paths.get("target/groupe.json").toFile(), Groupe.class);
			System.out.println(groupe);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		/*try {
			Etudiant[] listetudiant = objectMapper.readValue(Paths.get("target/etudiant.json").toFile(), Etudiant[].class);
			for(int i = 0; i < listetudiant.length; i ++) {
				System.out.println(listetudiant[i]);}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	} 
}

//etudiant bon, enseignant bon, sujet bon,groupe pas bon || liste etudiant bon



