package fr.umfds.GestionTer;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {
	ArrayList<Integer> membreG1 = new ArrayList<Integer>();
	Etudiant E1 = new Etudiant("Arnaud", "Cossu", 21901021);
	Enseignant EN3 = new Enseignant("Maxime", "Bourret", 219485, 1255487);
	Etudiant E4 = new Etudiant("Gatien", "Haddad", 219154);
	Groupe G1 = new Groupe(213, "GroupeB", 145, membreG1);
	Sujet S1 = new Sujet(12548, "Les singes en france");
	
	@Test
	public void TestJsonEtudiant() {
		ObjectMapper objectMapper = new ObjectMapper(); 
		try {
			objectMapper.writeValue(new File("target/etudianttest.json"), E1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Etudiant etudiant = objectMapper.readValue(Paths.get("target/etudianttest.json").toFile(), Etudiant.class);
			System.out.println(etudiant);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestJsonEnseignant() {
		ObjectMapper objectMapper = new ObjectMapper(); 
		try {
			objectMapper.writeValue(new File("target/enseignanttest.json"), EN3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Enseignant enseignant = objectMapper.readValue(Paths.get("target/enseignanttest.json").toFile(), Enseignant.class);
			System.out.println(enseignant);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestJsonSujet() {
		ObjectMapper objectMapper = new ObjectMapper(); 
		try {
			objectMapper.writeValue(new File("target/sujettest.json"), S1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Sujet sujet = objectMapper.readValue(Paths.get("target/sujettest.json").toFile(), Sujet.class);
			System.out.println(sujet);
			assertTrue(S1.getid() == 12548);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestJsonGroupe() {
		ObjectMapper objectMapper = new ObjectMapper(); 
		try {
			G1.ajoutetudiant(12554);
			objectMapper.writeValue(new File("target/groupetest.json"), G1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Groupe groupe = objectMapper.readValue(Paths.get("target/groupetest.json").toFile(), Groupe.class);
			System.out.println(groupe);
			assertTrue(G1.getid() == 213);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
