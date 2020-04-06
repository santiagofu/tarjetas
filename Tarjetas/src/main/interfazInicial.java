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



public class interfazInicial {

	private JFrame frmTarjetas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazInicial window = new interfazInicial();
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
	public interfazInicial() {
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
			TriggerLeyes.loadLeyes();
		}
	});
	
	
	}
	
}
