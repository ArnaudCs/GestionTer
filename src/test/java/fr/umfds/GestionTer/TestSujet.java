package fr.umfds.GestionTer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TestSujet {
	ArrayList<Integer> membreG1 = new ArrayList<Integer>();
	Etudiant E1 = new Etudiant("Arnaud", "Cossu", 21901021);
	Groupe G1 = new Groupe(213, "GroupeB", 145, membreG1);
	Sujet S1 = new Sujet(125468, "Publicité des singes");
	Sujet S2 = new Sujet(125468, "Publicité des singes", 125487);

	@Test
	public void TestSujetGroupe(){
		assertTrue(G1.getidsujet() == 145);
		ArrayList<Integer> membreG3 = new ArrayList<Integer>();
		Groupe G2 = new Groupe(214, "GroupeSansSujet", membreG3);
		Groupe G3 = new Groupe(214, "GroupeSansSujet", membreG3);
		G3.setidsujet(126);
		assertTrue(G3.getidsujet() == 126);
		assertTrue(G2.getidsujet() == 0);
	}
	
	@Test
	public void SujetEnseignant(){
		Enseignant ES1 = new Enseignant("Philippe", "Ciot", 1254879);
		Enseignant ES2 = new Enseignant("Pierre", "Labom", 1254748, 126);
		assertTrue(ES1.getids() == 0);
		ES1.setids(149);
		assertTrue(ES1.getids() == 149);
		assertTrue(ES2.getids() == 126);
	}
}