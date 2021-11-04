package fr.umfds.GestionTer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialisation {
		
	public void serialisation(Class<?> c, Object f, String nomfichier) {
	    ObjectMapper objectMapper = new ObjectMapper(); 
		try {
			objectMapper.writeValue(new File("target/"+nomfichier+".json"), f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

