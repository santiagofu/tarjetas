package menusIndividuales;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jugar.JugarEstandares;

public class MenuEstandares {

	public static void loadEstandares() {
		// TODO Auto-generated method stub

		JFrame frmEstandares = new JFrame();
		frmEstandares.getContentPane().setBackground(new Color(55, 184, 219));
		frmEstandares.setTitle("Estándares");
		frmEstandares.setBounds(600, 150, 400, 400);
		frmEstandares.setDefaultCloseOperation(2);
		frmEstandares.getContentPane().setLayout(null);

		JButton btnAñadir = new JButton("AÑADIR ESTÁNDAR");
		btnAñadir.setBackground(Color.LIGHT_GRAY);
		btnAñadir.setFont(new Font("Arial", Font.BOLD, 17));
		btnAñadir.setBounds(100, 100, 202, 49);
		frmEstandares.getContentPane().add(btnAñadir);

		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setBackground(Color.LIGHT_GRAY);
		btnJugar.setFont(new Font("Arial", Font.BOLD, 20));
		btnJugar.setBounds(100, 200, 202, 49);
		frmEstandares.getContentPane().add(btnJugar);

		frmEstandares.setVisible(true);

		btnAñadir.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Aún en desarrollo", "", JOptionPane.WARNING_MESSAGE);

		});

		btnJugar.addActionListener(e -> {
			frmEstandares.dispose();
			JugarEstandares j = new JugarEstandares();
			j.jugar();
		});

	}

}
