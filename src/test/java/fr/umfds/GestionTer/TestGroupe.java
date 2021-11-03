package fr.umfds.GestionTer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TestGroupe {
	ArrayList<Integer> membreG1 = new ArrayList<Integer>();
	Etudiant E1 = new Etudiant("Arnaud", "Cossu", 21901021);
	Etudiant E3 = new Etudiant("Maxime", "Bourret", 219485);
	Etudiant E4 = new Etudiant("Gatien", "Haddad", 219154);
	Groupe G1 = new Groupe(213, "GroupeB", 145, membreG1);

	@Test
	public void TestGroupe(){
		G1.ajoutetudiant(E1.getid());
		assertEquals("[21901021]", G1.getmembre());
		assertTrue(G1.getidsujet() == 145);
		G1.suppgroupe(E1.getid()); 
		assertEquals("[]", G1.getmembre()); 
	}
}
