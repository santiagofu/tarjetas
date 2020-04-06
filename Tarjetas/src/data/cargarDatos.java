package data;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import tarjetaPckg.Tarjeta;

public class cargarDatos {

	public static Tarjeta[] cargar() throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Tarjeta[] tarjetas = mapper.readValue(new File("leyes.json"), Tarjeta[].class);
		return tarjetas;
	}
}
