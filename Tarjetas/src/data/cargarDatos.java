package data;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tarjetaPckg.Tarjeta;

public class cargarDatos {

	public static Tarjeta[] cargar() throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "data/leyes.json";
		Tarjeta[] tarjetas = mapper.readValue(jsonString, Tarjeta[].class);
		return tarjetas;
	}
}
