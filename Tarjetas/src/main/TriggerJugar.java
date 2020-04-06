package main;

import java.io.IOException;
import java.util.Random;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import tarjetaPckg.Tarjeta;

public class TriggerJugar {
	
	private static Tarjeta[] listado;

	public static void Jugar() {
		try {
			listado = data.cargarDatos.cargar();
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
	
	public static Tarjeta CargarPrimeraTarjeta() {
		// TODO Auto-generated method stub
		int index = new Random().nextInt(listado.length);
		return listado[index];
	}
	
	public static Tarjeta Siguiente() {
		return null;
		
	}
	
	public static Tarjeta Solucionar(String texto) {
		return null;
		
		
	}


	}

