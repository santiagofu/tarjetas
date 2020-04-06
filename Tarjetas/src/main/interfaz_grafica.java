package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import tarjetaPckg.Tarjeta;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;



public class interfaz_grafica {

	private JFrame frmTarjetas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_grafica window = new interfaz_grafica();
					window.frmTarjetas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaz_grafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmTarjetas = new JFrame();
		frmTarjetas.getContentPane().setBackground(new Color(135, 206, 235));
		frmTarjetas.setTitle("Tarjetas");
		frmTarjetas.setBounds(400, 200, 800, 600);
		frmTarjetas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTarjetas.getContentPane().setLayout(null);
		
		JButton btnLeyes = new JButton("LEYES");
		btnLeyes.setBackground(Color.LIGHT_GRAY);
		btnLeyes.setFont(new Font("Arial", Font.BOLD, 20));
		btnLeyes.setBounds(272, 230, 202, 49);
		frmTarjetas.getContentPane().add(btnLeyes);

	
	btnLeyes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JFrame frmLeyes = new JFrame();
			frmLeyes.getContentPane().setBackground(new Color(55, 184, 219));
			frmLeyes.setTitle("Leyes");
			frmLeyes.setBounds(600, 300, 400, 400);
			frmLeyes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmLeyes.getContentPane().setLayout(null);
			
			JButton btnAñadir = new JButton("AÑADIR LEY");
			btnAñadir.setBackground(Color.LIGHT_GRAY);
			btnAñadir.setFont(new Font("Arial", Font.BOLD, 20));
			btnAñadir.setBounds(100, 100, 202, 49);
			frmLeyes.getContentPane().add(btnAñadir);
			
			JButton btnJugar = new JButton("JUGAR");
			btnJugar.setBackground(Color.LIGHT_GRAY);
			btnJugar.setFont(new Font("Arial", Font.BOLD, 20));
			btnJugar.setBounds(100, 200, 202, 49);
			frmLeyes.getContentPane().add(btnJugar);
			
			frmLeyes.setVisible(true);
			
			btnJugar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {	
					try {
						Tarjeta[] listado = data.cargarDatos.cargar();
						JOptionPane.showMessageDialog(null, listado[0].getAnverso(), "Alert", JOptionPane.ERROR_MESSAGE);
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
			});
			
		}
	});
	
	
	}
	
}
