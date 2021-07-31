package proyecto_02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class Modulo_Mantenimiento extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Modulo_Mantenimiento dialog = new Modulo_Mantenimiento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			// CENTRAR VENTANA EN LA PANTALLA
			dialog.setLocationRelativeTo(null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Modulo_Mantenimiento() {
		setBounds(100, 100, 724, 407);
		getContentPane().setLayout(new BorderLayout());
	}
}
