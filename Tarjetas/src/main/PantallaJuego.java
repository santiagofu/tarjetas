package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import tarjetaPckg.Tarjeta;

public class PantallaJuego {

	private static String texto;

	public static void jugarTarjetas(Tarjeta[] listado) {

		JFrame frmJuegoTarjetas = new JFrame();
		frmJuegoTarjetas.getContentPane().setBackground(new Color(55, 184, 219));
		frmJuegoTarjetas.setTitle("Tarjetas");
		frmJuegoTarjetas.setBounds(500, 250, 700, 500);
		frmJuegoTarjetas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		Tarjeta inicial = TriggerJugar.CargarPrimeraTarjeta();
		lbl.setText(inicial.getAnverso().toString());

		texto = lbl.getText();

		frmJuegoTarjetas.setVisible(true);

		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSiguiente.setEnabled(false);
				btnSolucionar.setEnabled(false);
				Tarjeta siguiente = TriggerJugar.Siguiente();
				lbl.setText("");
				lbl.setText(siguiente.getAnverso());
				btnSiguiente.setEnabled(true);
				btnSolucionar.setEnabled(true);
			}
		});

		btnSolucionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSiguiente.setEnabled(false);
				btnSolucionar.setEnabled(false);
				texto = lbl.getText();
				Tarjeta solucion = TriggerJugar.Solucionar(texto);
				lbl.setText("");
				lbl.setText(solucion.getReverso());
				btnSiguiente.setEnabled(true);
				btnSolucionar.setEnabled(true);
			}
		});

	}
}
