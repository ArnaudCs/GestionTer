package fr.umfds.GestionTer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TestEtudiant {
	ArrayList<Integer> membreG1 = new ArrayList<Integer>();
	Etudiant E1 = new Etudiant("Arnaud", "Cossu", 21901021);
	Etudiant E3 = new Etudiant("Maxime", "Bourret", 219485);
	Etudiant E4 = new Etudiant("Gatien", "Haddad", 219154);
	Groupe G1 = new Groupe(213, "GroupeB", 145, membreG1);
	
	@Test
	public void TestEtudiantCons() {
		Etudiant E = new Etudiant("test1", "test1", 125487);
		assertTrue(E.getid() == 125487);
		assertTrue(E.getidgroupe() == 0);
		E.setGroupe(125);
		assertTrue(E.getidgroupe() == 125);
		assertEquals(E.getnom(), "test1");
		E.suppgroupe();
		assertTrue(E.getidgroupe() == 0);
		
		Etudiant Evide = new Etudiant();
		assertTrue(Evide.getid() == 0 && Evide.getidgroupe() == 0 && Evide.getnom() == "" && Evide.getprenom() == "");
		assertFalse(Evide.getid() == 8 || Evide.getidgroupe() == 2 || Evide.getnom() == "a" || Evide.getprenom() == "a");
		
		Etudiant E15 = new Etudiant("test2", "test2", 125486, 4587);
		assertTrue(E15.getid() == 125486);
		assertTrue(E15.getidgroupe() == 4587);
		assertEquals(E15.getnom(), "test2");
		E15.suppgroupe();
		assertTrue(E15.getidgroupe() == 0);
	}
}
