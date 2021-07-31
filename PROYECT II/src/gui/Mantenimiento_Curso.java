package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mantenimiento_Curso extends JDialog implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblAsignatura;
	private JLabel lblCiclo;
	private JLabel lblCreditos;
	private JLabel lblHoras;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JTextArea txtS;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_Curso dialog = new Mantenimiento_Curso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_Curso() {
		setBackground(Color.GREEN);
		setForeground(Color.LIGHT_GRAY);
		getContentPane().setBackground(Color.GREEN);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		setTitle("Mantenimiento Curso");
		setBounds(100, 100, 768, 647);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Cod. Curso:");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(36, 40, 118, 33);
		getContentPane().add(lblNewLabel);
		
		lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAsignatura.setBounds(36, 91, 118, 33);
		getContentPane().add(lblAsignatura);
		
		lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCiclo.setBounds(36, 149, 118, 33);
		getContentPane().add(lblCiclo);
		
		lblCreditos = new JLabel("Creditos:");
		lblCreditos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreditos.setBounds(36, 204, 118, 33);
		getContentPane().add(lblCreditos);
		
		lblHoras = new JLabel("Horas:");
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHoras.setBounds(36, 254, 118, 33);
		getContentPane().add(lblHoras);
		
		textField = new JTextField();
		textField.setBounds(107, 40, 129, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 92, 129, 33);
		getContentPane().add(textField_1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Primero", "Segundo", "Tercero", "Cuarto", "Quinto"}));
		comboBox.setBounds(107, 150, 129, 33);
		getContentPane().add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(107, 204, 129, 33);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 255, 129, 33);
		getContentPane().add(textField_3);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdicionar.setBounds(348, 47, 129, 33);
		getContentPane().add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConsultar.setBounds(348, 98, 129, 33);
		getContentPane().add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnModificar.setBounds(348, 149, 129, 33);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEliminar.setBounds(348, 204, 129, 33);
		getContentPane().add(btnEliminar);
		
		txtS = new JTextArea();
		txtS.setBounds(35, 341, 645, 214);
		getContentPane().add(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
	}
}