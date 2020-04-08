package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import menusIndividuales.MenuEstandares;
import menusIndividuales.MenuLeyes;
import menusIndividuales.MenuMetricaV3;
import menusIndividuales.MenuNTI;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frmTarjetas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
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
		frmTarjetas.setDefaultCloseOperation(3);
		frmTarjetas.getContentPane().setLayout(null);

		JButton btnLeyes = new JButton("LEYES");
		btnLeyes.setBackground(Color.LIGHT_GRAY);
		btnLeyes.setFont(new Font("Arial", Font.BOLD, 20));
		btnLeyes.setBounds(272, 92, 202, 49);
		frmTarjetas.getContentPane().add(btnLeyes);

		JButton btnEstandares = new JButton("EST\u00C1NDARES");
		btnEstandares.setFont(new Font("Arial", Font.BOLD, 20));
		btnEstandares.setBackground(Color.LIGHT_GRAY);
		btnEstandares.setBounds(272, 205, 202, 49);
		frmTarjetas.getContentPane().add(btnEstandares);

		JButton btnNTI = new JButton("Normas T\u00E9cnicas Interoperabilidad");
		btnNTI.setFont(new Font("Arial", Font.BOLD, 20));
		btnNTI.setBackground(Color.LIGHT_GRAY);
		btnNTI.setBounds(189, 303, 385, 57);
		frmTarjetas.getContentPane().add(btnNTI);

		JButton btnMetrica3 = new JButton("M\u00C9TRICA V3");
		btnMetrica3.setFont(new Font("Arial", Font.BOLD, 20));
		btnMetrica3.setBackground(Color.LIGHT_GRAY);
		btnMetrica3.setBounds(272, 407, 202, 49);
		frmTarjetas.getContentPane().add(btnMetrica3);

		btnLeyes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuLeyes.loadLeyes();
			}
		});

		btnEstandares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuEstandares.loadEstandares();
			}
		});
		
		btnNTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MenuNTI.loadNTI();
				JOptionPane.showMessageDialog(null,"Aún en desarrollo","",JOptionPane.WARNING_MESSAGE);
			}
		});
		
		btnMetrica3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MenuMetricaV3.loadMetricaV3();
				JOptionPane.showMessageDialog(null,"Aún en desarrollo","",JOptionPane.WARNING_MESSAGE);
			}
		});

	}

}
