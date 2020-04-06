package jugar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import main.PantallaJuego;
import tarjetaPckg.Tarjeta;

public class JugarEstandares implements JugarInterface{

	private static Tarjeta[] listado;
	private static ArrayList<Tarjeta> mostrados;
	private static String estandares = "estandares";
	
	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		try {
			listado = data.cargarDatos.cargar(estandares);
			PantallaJuego.jugarTarjetas(listado);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Tarjeta CargarPrimeraTarjeta() {
		// TODO Auto-generated method stub
		mostrados = new ArrayList<Tarjeta>();
		int index = new Random().nextInt(listado.length);
		Tarjeta primera = listado[index];
		mostrados.add(primera);
		return primera;
	}

	@Override
	public Tarjeta Siguiente() {
		if (mostrados.size() == listado.length) {
			mostrados.clear();
		}
		int index = new Random().nextInt(listado.length);

		while (mostrados.contains(listado[index])) {
			index = new Random().nextInt(listado.length);
		}

		mostrados.add(listado[index]);
		return listado[index];

	}

	@Override
	public Tarjeta Solucionar(String texto) {
		for (Tarjeta t : listado) {
			if (t.getAnverso().compareTo(texto) == 0) {
				return t;
			}
		}
		return null;

	}

	

}
