package jugar;

import tarjetaPckg.Tarjeta;

public interface JugarInterface {

	public void jugar();

	public Tarjeta cargarPrimeraTarjeta();

	public Tarjeta siguiente();

	public Tarjeta solucionar(String texto);

}
