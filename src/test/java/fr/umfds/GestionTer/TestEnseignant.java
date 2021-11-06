package fr.umfds.GestionTer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestEnseignant {
	ArrayList<Integer> membreG1 = new ArrayList<Integer>();
	Enseignant E1 = new Enseignant("Arnaud", "Cossu", 21901021);
	Enseignant E3 = new Enseignant("Maxime", "Bourret", 219485);
	Enseignant E4 = new Enseignant("Gatien", "Haddad", 219154);
	
	@Test
	public void TestEtudiantCons() {
		Enseignant E = new Enseignant("test1", "test1", 125487);
		assertTrue(E.getid() == 125487);
		assertTrue(E.getids() == 0);
		E.setids(125);
		assertTrue(E.getids() == 125);
		assertEquals(E.getnom(), "test1");
		E.setids(0);
		assertTrue(E.getids() == 0);
		
		Enseignant Evide = new Enseignant();
		assertTrue(Evide.getid() == 0 && Evide.getids() == 0 && Evide.getnom() == "" && Evide.getprenom() == "");
		assertFalse(Evide.getid() == 8 || Evide.getids() == 2 || Evide.getnom() == "a" || Evide.getprenom() == "a");
		
		Enseignant E15 = new Enseignant("test2", "test2", 125486, 4587);
		assertTrue(E15.getid() == 125486);
		assertTrue(E15.getids() == 4587);
		assertEquals(E15.getnom(), "test2");
		E15.setids(0);
		assertTrue(E15.getids() == 0);
	}
}
