package jugar;

import java.util.ArrayList;

import tarjetaPckg.Tarjeta;

public interface JugarInterface {

	public void Jugar();

	public Tarjeta CargarPrimeraTarjeta();

	public Tarjeta Siguiente();

	public Tarjeta Solucionar(String texto);
}
