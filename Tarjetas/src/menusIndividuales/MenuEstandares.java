package menusIndividuales;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jugar.JugarEstandares;

public class MenuEstandares {

	public static void loadEstandares() {
		// TODO Auto-generated method stub
		
		JFrame frmEstandares = new JFrame();
		frmEstandares.getContentPane().setBackground(new Color(55, 184, 219));
		frmEstandares.setTitle("Est�ndares");
		frmEstandares.setBounds(600, 300, 400, 400);
		frmEstandares.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEstandares.getContentPane().setLayout(null);
		
		JButton btnA�adir = new JButton("A�ADIR EST�NDAR");
		btnA�adir.setBackground(Color.LIGHT_GRAY);
		btnA�adir.setFont(new Font("Arial", Font.BOLD, 17));
		btnA�adir.setBounds(100, 100, 202, 49);
		frmEstandares.getContentPane().add(btnA�adir);
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setBackground(Color.LIGHT_GRAY);
		btnJugar.setFont(new Font("Arial", Font.BOLD, 20));
		btnJugar.setBounds(100, 200, 202, 49);
		frmEstandares.getContentPane().add(btnJugar);
		
		frmEstandares.setVisible(true);
		
		btnA�adir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"A�n en desarrollo","",JOptionPane.WARNING_MESSAGE);
			}
		});
		
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JugarEstandares j = new JugarEstandares();
				j.Jugar();
			}
		});

		}

	}


