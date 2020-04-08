package jugar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import main.PantallaJuego;
import tarjetaPckg.Tarjeta;

public class JugarEstandares implements JugarInterface{

	private static Tarjeta[] listado;
	private static ArrayList<Tarjeta> mostrados;
	private static String estandares = "estandares";
	
	@Override
	public void jugar() {
		try {
			JugarEstandares.listado = data.cargarDatos.cargar(JugarEstandares.estandares);
			PantallaJuego.jugarTarjetas(JugarEstandares.listado);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	@Override
	public Tarjeta cargarPrimeraTarjeta() {
		JugarEstandares.mostrados = new ArrayList<Tarjeta>();
		int index = new Random().nextInt(JugarEstandares.listado.length);
		Tarjeta primera = JugarEstandares.listado[index];
		JugarEstandares.mostrados.add(primera);
		return primera;
	}

	@Override
	public Tarjeta siguiente() {
		if (JugarEstandares.mostrados.size() == JugarEstandares.listado.length) {
			JugarEstandares.mostrados.clear();
		}
		int index = new Random().nextInt(JugarEstandares.listado.length);

		while (JugarEstandares.mostrados.contains(JugarEstandares.listado[index])) {
			index = new Random().nextInt(JugarEstandares.listado.length);
		}

		JugarEstandares.mostrados.add(JugarEstandares.listado[index]);
		return JugarEstandares.listado[index];

	}

	@Override
	public Tarjeta solucionar(String texto) {
		for (Tarjeta t : JugarEstandares.listado) {
			if (t.getAnverso().compareTo(texto) == 0) {
				return t;
			}
		}
		return null;

	}

	

}
