package fr.umfds.GestionTer;

import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {

	public static String writejson(Object o) throws JsonProcessingException{
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(om); 
	}
	
	public static Object readjson(Class<?> c, String filename) throws IOException{
		ObjectMapper om = new ObjectMapper();
		return om.readValue(Paths.get(filename).toFile(), c);
	}
}
