package main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import tarjetaPckg.Tarjeta;

public class TriggerJugar {

	public static void Jugar() {
		try {
			Tarjeta[] listado = data.cargarDatos.cargar();
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
	
	public static void CargarPrimeraTarjeta() {
		// TODO Auto-generated method stub
		
	}
	
	public static Tarjeta Siguiente() {
		return null;
		
		
	}
	
	public static String Solucionar() {
		return null;
		
		
	}


	}

