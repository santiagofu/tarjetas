package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import jugar.JugarEstandares;
import jugar.JugarLeyes;
import tarjetaPckg.Tarjeta;

public class PantallaJuego {

	private static String texto;

	public static void jugarTarjetas(Tarjeta[] listado) {

		JFrame frmJuegoTarjetas = new JFrame();
		frmJuegoTarjetas.getContentPane().setBackground(new Color(55, 184, 219));
		frmJuegoTarjetas.setTitle("Tarjetas");
		frmJuegoTarjetas.setBounds(450, 150, 700, 500);
		frmJuegoTarjetas.setDefaultCloseOperation(2);
		frmJuegoTarjetas.getContentPane().setLayout(null);

		JTextArea lbl = new JTextArea("");
		lbl.setEditable(false);
		lbl.setLineWrap(true);
		lbl.setWrapStyleWord(true);
		lbl.setBackground(new Color(55, 184, 219));
		lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl.setBounds(200, 100, 300, 150);
		frmJuegoTarjetas.getContentPane().add(lbl);

		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBackground(Color.LIGHT_GRAY);
		btnSiguiente.setFont(new Font("Arial", Font.BOLD, 20));
		btnSiguiente.setBounds(50, 350, 200, 50);
		frmJuegoTarjetas.getContentPane().add(btnSiguiente);

		JButton btnSolucionar = new JButton("SOLUCIONAR");
		btnSolucionar.setBackground(Color.LIGHT_GRAY);
		btnSolucionar.setFont(new Font("Arial", Font.BOLD, 20));
		btnSolucionar.setBounds(400, 350, 200, 50);
		frmJuegoTarjetas.getContentPane().add(btnSolucionar);

		String categoria = listado[0].getCategoria();
		if (categoria.compareTo("Ley") == 0) {
			JugarLeyes j = new JugarLeyes();
			Tarjeta inicial = j.cargarPrimeraTarjeta();
			lbl.setText(inicial.getAnverso());

			PantallaJuego.texto = lbl.getText();

			frmJuegoTarjetas.setVisible(true);

			btnSiguiente.addActionListener(e -> {
				btnSiguiente.setEnabled(false);
				btnSolucionar.setEnabled(false);
				Tarjeta siguiente = j.siguiente();
				lbl.setText("");
				lbl.setText(siguiente.getAnverso());
				btnSiguiente.setEnabled(true);
				btnSolucionar.setEnabled(true);
			});

			btnSolucionar.addActionListener(e -> {
				btnSiguiente.setEnabled(false);
				btnSolucionar.setEnabled(false);
				PantallaJuego.texto = lbl.getText();
				Tarjeta solucion = j.solucionar(PantallaJuego.texto);
				lbl.setText("");
				lbl.setText(solucion.getReverso());
				btnSiguiente.setEnabled(true);
			});
		}
		if (categoria.compareTo("Estandar") == 0) {
			JugarEstandares e = new JugarEstandares();
			Tarjeta inicial = e.cargarPrimeraTarjeta();
			lbl.setText(inicial.getAnverso());

			PantallaJuego.texto = lbl.getText();

			frmJuegoTarjetas.setVisible(true);

			btnSiguiente.addActionListener(evt -> {
				btnSiguiente.setEnabled(false);
				btnSolucionar.setEnabled(false);
				Tarjeta siguiente = e.siguiente();
				lbl.setText("");
				lbl.setText(siguiente.getAnverso());
				btnSiguiente.setEnabled(true);
				btnSolucionar.setEnabled(true);
			});

			btnSolucionar.addActionListener(evt -> {
				btnSiguiente.setEnabled(false);
				btnSolucionar.setEnabled(false);
				PantallaJuego.texto = lbl.getText();
				Tarjeta solucion = e.solucionar(PantallaJuego.texto);
				lbl.setText("");
				lbl.setText(solucion.getReverso());
				btnSiguiente.setEnabled(true);
			});
		}

	}
}
