package proyecto_02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.Fondo;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Menu_Principal extends JFrame {

	private JPanel p;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal frame = new Menu_Principal();
					// SE MAXIMIZA A TODA PANTALLA 
					frame.setExtendedState(MAXIMIZED_BOTH); 
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu_Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu_Principal.class.getResource("/imagenes/home.png")));
		setTitle("REGISTROS ACADEMICOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 400);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("M\u00F3dulo de Mantenimiento");
		mnNewMenu.setIcon(new ImageIcon(Menu_Principal.class.getResource("/imagenes/mantenimiento.png")));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNewMenu);
		
		mnNewMenu_1 = new JMenu("M\u00F3dulo de Registro");
		mnNewMenu_1.setIcon(new ImageIcon(Menu_Principal.class.getResource("/imagenes/edit.png")));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("M\u00F3dulo de Consulta");
		mnNewMenu_2.setIcon(new ImageIcon(Menu_Principal.class.getResource("/imagenes/buscar.png")));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNewMenu_2);
		
		mnNewMenu_3 = new JMenu("M\u00F3dulo de Reporte");
		mnNewMenu_3.setIcon(new ImageIcon(Menu_Principal.class.getResource("/imagenes/ventas.png")));
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNewMenu_3);
		
		mnNewMenu_4 = new JMenu("Integrantes");
		mnNewMenu_4.setIcon(new ImageIcon(Menu_Principal.class.getResource("/imagenes/clientes.png")));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNewMenu_4);
		
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		//ADJUNTAR IMAGEN DE FONDO
		 setBounds(100, 100, 900, 400);
		 Fondo p = new Fondo();
		  p.setBorder(new EmptyBorder(5, 5, 5, 5));
		  p.setLayout(new BorderLayout(0, 0));
		 setContentPane(p);

	}

}
