package jugar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import main.PantallaJuego;
import tarjetaPckg.Tarjeta;

public class JugarLeyes implements JugarInterface {

	private static Tarjeta[] listado;
	private static ArrayList<Tarjeta> mostrados;
	private static String leyes = "leyes";

	@Override
	public void Jugar() {
		try {
			JugarLeyes.listado = data.cargarDatos.cargar(leyes);
			PantallaJuego.jugarTarjetas(JugarLeyes.listado);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Tarjeta CargarPrimeraTarjeta() {
		JugarLeyes.mostrados = new ArrayList<Tarjeta>();
		int index = new Random().nextInt(JugarLeyes.listado.length);
		Tarjeta primera = JugarLeyes.listado[index];
		JugarLeyes.mostrados.add(primera);
		return primera;
	}

	@Override
	public Tarjeta Siguiente() {
		if (JugarLeyes.mostrados.size() == JugarLeyes.listado.length) {
			JugarLeyes.mostrados.clear();
		}
		int index = new Random().nextInt(JugarLeyes.listado.length);

		while (JugarLeyes.mostrados.contains(JugarLeyes.listado[index])) {
			index = new Random().nextInt(JugarLeyes.listado.length);
		}

		mostrados.add(JugarLeyes.listado[index]);
		return JugarLeyes.listado[index];

	}

	@Override
	public Tarjeta Solucionar(String texto) {
		for (Tarjeta t : JugarLeyes.listado) {
			if (t.getAnverso().compareTo(texto) == 0) {
				return t;
			}
		}
		return null;

	}

}
