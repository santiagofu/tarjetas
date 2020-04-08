package jugar;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import main.PantallaJuego;
import tarjetaPckg.Tarjeta;

public class JugarLeyes {

	private static Tarjeta[] listado;
	private static ArrayList<Tarjeta> mostrados;
	private static String leyes = "leyes";

	public void jugar() {
		try {
			JugarLeyes.listado = data.cargarDatos.cargar(leyes);
			PantallaJuego.jugarTarjetas(JugarLeyes.listado);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Tarjeta cargarPrimeraTarjeta() {
		JugarLeyes.mostrados = new ArrayList<Tarjeta>();
		int index = new SecureRandom().nextInt(JugarLeyes.listado.length);
		Tarjeta primera = JugarLeyes.listado[index];
		JugarLeyes.mostrados.add(primera);
		return primera;
	}

	public Tarjeta siguiente() {
		if (JugarLeyes.mostrados.size() == JugarLeyes.listado.length) {
			JugarLeyes.mostrados.clear();
		}
		int index = new SecureRandom().nextInt(JugarLeyes.listado.length);

		while (JugarLeyes.mostrados.contains(JugarLeyes.listado[index])) {
			index = new SecureRandom().nextInt(JugarLeyes.listado.length);
		}

		mostrados.add(JugarLeyes.listado[index]);
		return JugarLeyes.listado[index];

	}

	public Tarjeta solucionar(String texto) {
		for (Tarjeta t : JugarLeyes.listado) {
			if (t.getAnverso().compareTo(texto) == 0) {
				return t;
			}
		}
		return null;

	}

}
