package menusIndividuales;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jugar.JugarLeyes;

public class MenuLeyes {
	
	public static void loadLeyes() {

	JFrame frmLeyes = new JFrame();
	frmLeyes.getContentPane().setBackground(new Color(55, 184, 219));
	frmLeyes.setTitle("Leyes");
	frmLeyes.setBounds(600, 300, 400, 400);
	frmLeyes.setDefaultCloseOperation(2);
	frmLeyes.getContentPane().setLayout(null);
	
	JButton btnA�adir = new JButton("A�ADIR LEY");
	btnA�adir.setBackground(Color.LIGHT_GRAY);
	btnA�adir.setFont(new Font("Arial", Font.BOLD, 20));
	btnA�adir.setBounds(100, 100, 202, 49);
	frmLeyes.getContentPane().add(btnA�adir);
	
	JButton btnJugar = new JButton("JUGAR");
	btnJugar.setBackground(Color.LIGHT_GRAY);
	btnJugar.setFont(new Font("Arial", Font.BOLD, 20));
	btnJugar.setBounds(100, 200, 202, 49);
	frmLeyes.getContentPane().add(btnJugar);
	
	frmLeyes.setVisible(true);
	
	btnA�adir.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null,"A�n en desarrollo","",JOptionPane.WARNING_MESSAGE);
		}
	});
	
	btnJugar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JugarLeyes jg = new JugarLeyes();
			jg.jugar();
		}
	});

	}

	}


	
