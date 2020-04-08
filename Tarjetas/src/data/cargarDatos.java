package data;


import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tarjetaPckg.Tarjeta;

public class cargarDatos {

	public static Tarjeta[] cargar(String categoria) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Tarjeta[] tarjetas = null;
		if(categoria.compareTo("leyes")==0) {
			return tarjetas = mapper.readValue(new File("leyes.json"), Tarjeta[].class);
		} 
		
		if(categoria.compareTo("estandares")==0) {
			return tarjetas = mapper.readValue(new File("estandares.json"), Tarjeta[].class);
		}
		return tarjetas;
	}
}
