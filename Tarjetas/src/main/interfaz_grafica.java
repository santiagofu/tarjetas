package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
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
		frmTarjetas.setBounds(100, 100, 804, 600);
		frmTarjetas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTarjetas.getContentPane().setLayout(null);
		
		JButton btnLeyes = new JButton("LEYES");
		btnLeyes.setBackground(new Color(255, 165, 0));
		btnLeyes.setFont(new Font("Arial", Font.BOLD, 15));
		btnLeyes.setBounds(267, 158, 202, 49);
		frmTarjetas.getContentPane().add(btnLeyes);
		
		JButton btnEstandares = new JButton("EST\u00C1NDARES");
		btnEstandares.setFont(new Font("Arial", Font.BOLD, 15));
		btnEstandares.setBounds(267, 335, 202, 49);
		frmTarjetas.getContentPane().add(btnEstandares);

	
	btnLeyes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	
	
	}
	
}
