package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import tarjetaPckg.Tarjeta;

public class PantallaJuego {

	public static void jugarTarjetas(Tarjeta[] listado) {
		
		JFrame frmJuegoTarjetas = new JFrame();
		frmJuegoTarjetas.getContentPane().setBackground(new Color(55, 184, 219));
		frmJuegoTarjetas.setTitle("Tarjetas de Leyes");
		frmJuegoTarjetas.setBounds(500, 250, 700, 500);
		frmJuegoTarjetas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmJuegoTarjetas.getContentPane().setLayout(null);
		
		
		
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
		
		frmJuegoTarjetas.setVisible(true);
		
		TriggerJugar.CargarPrimeraTarjeta();
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TriggerJugar.Siguiente();
			}
		});
		
		btnSolucionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TriggerJugar.Solucionar();
			}
		});
		
	}
}
