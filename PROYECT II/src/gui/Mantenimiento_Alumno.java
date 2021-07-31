package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloAlumnos;
import clase.Alumno;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mantenimiento_Alumno extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblcodigo;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lbldni;
	private JLabel lblcelular;
	private JLabel lblestado;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JLabel lbledad;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtEdad;
	private JTextField txtCelular;
	private JComboBox cboEstado;
	private JScrollPane scrollPane;
	private JTable tblAlumno;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane_1;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	

//  Declaración global
	ArregloAlumnos aa = new ArregloAlumnos();
	
	private JButton btnReportar;
	private JComboBox comboBox;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenimiento_Alumno frame = new Mantenimiento_Alumno();
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
	public Mantenimiento_Alumno() {
		setTitle("MANTENIMIENTO  | ALUMNO ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblcodigo = new JLabel("C\u00F3digo");
		lblcodigo.setBounds(28, 27, 46, 14);
		contentPane.add(lblcodigo);
		
		lblnombre = new JLabel("Nombre ");
		lblnombre.setBounds(28, 57, 46, 14);
		contentPane.add(lblnombre);
		
		lblapellido = new JLabel("Apellido ");
		lblapellido.setBounds(28, 99, 46, 14);
		contentPane.add(lblapellido);
		
		lbldni = new JLabel("DNI ");
		lbldni.setBounds(28, 134, 46, 14);
		contentPane.add(lbldni);
		
		lblcelular = new JLabel("Celular");
		lblcelular.setBounds(28, 167, 46, 14);
		contentPane.add(lblcelular);
		
		lblestado = new JLabel("Estado ");
		lblestado.setBounds(28, 196, 46, 14);
		contentPane.add(lblestado);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(84, 24, 186, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
				
		txtNombre = new JTextField();
		txtNombre.setBounds(84, 54, 186, 20);
		txtNombre.setColumns(10);
		contentPane.add(txtNombre);
		
		lbledad = new JLabel("Edad");
		lbledad.setBounds(242, 134, 46, 14);
		contentPane.add(lbledad);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(84, 96, 186, 20);
		txtApellido.setColumns(10);
		contentPane.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setBounds(84, 134, 107, 20);
		txtDni.setColumns(10);
		contentPane.add(txtDni);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(277, 131, 58, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(84, 164, 107, 20);
		txtCelular.setColumns(10);
		contentPane.add(txtCelular);
		
		cboEstado = new JComboBox();
		cboEstado.setBounds(84, 192, 107, 22);
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Registrado", "Matriculado", "Retirado"}));
		contentPane.add(cboEstado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 245, 593, 171);
		contentPane.add(scrollPane);
		
		tblAlumno = new JTable();
		tblAlumno.setFillsViewportHeight(true);
		tblAlumno.setColumnSelectionAllowed(true);
		tblAlumno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tblAlumno.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nombre", "Apellido", "DNI", "Edad", "Celular", "Estado"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		

		
		scrollPane.setViewportView(tblAlumno);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(439, 27, 101, 23);
		contentPane.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(439, 61, 101, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(439, 95, 101, 23);
		contentPane.add(btnEliminar);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(23, 427, 598, 161);
		contentPane.add(scrollPane_1);
		
		txtS = new JTextArea();
		txtS.setTabSize(12);
		scrollPane_1.setViewportView(txtS);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(439, 134, 101, 23);
		contentPane.add(btnReportar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Registrado ", "Matriculado ", "Retirado "}));
		comboBox.setBounds(84, 192, 107, 22);
		contentPane.add(comboBox);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReportar) {
			actionPerformedBtnReportar(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {

		/**
		 * Agrega un nuevo alumno
		 */	
       //  declarar variables locales 
		int codigo=leerCodigos();
		String nombre= leerNombre();
		String apellido= leerApellido();
		String dni = leerDni();
		int edad= leerEdad ();
		int celular= leerCelular();
		int estado= leerEstado();
			
		//Creando un nuevo objeto del tipo alumno 
		Alumno nuevo = new Alumno(codigo, nombre, apellido, dni, edad,celular, estado);		

		//Añadir el nuevo objeto al ArrayList
		aa.adicionar(nuevo);
		listar();
		limpieza(); 	}
 
	
	    protected void actionPerformedBtnReportar(ActionEvent e) {
	    	txtS.setText("");

			imprimir("cantidad de Alumnos: " + aa.tamaño()); 
			    
	    }
	
	//  Métodos tipo void (con parámetros)
		void imprimir(String s) {
			txtS.append(s + "\n");
		}
		
	//  Métodos tipo void (sin parámetros)
		void imprimir() {
			imprimir("");    
		}
		
		void limpieza() {
			txtCodigo.setText("");
			txtNombre.setText("");
			txtApellido.setText("");
			txtDni.setText("");
			txtEdad.setText("");
			txtCelular.setText("");
			txtCodigo.requestFocus();			
		}
		

			
		 	void listar() {
	 		DefaultTableModel modelo = (DefaultTableModel) tblAlumno.getModel(); // revisar
				modelo.setRowCount(0);
				for (int i = 0; i < aa.tamaño(); i++) {

			//Por cada objeto debemos de crear una fila
			Object[] fila = {
							aa.obtener(i).getCodAlumno(),
							aa.obtener(i).getNombres(),
							aa.obtener(i).getApellidos (),
							aa.obtener(i).getDni(),
							aa.obtener(i).getEdad(),
							aa.obtener(i).getCelular(),
							aa.obtener(i).getEstado(),
									};
// (int codAlumno, String nombres, String apellidos, String dni, int edad, int celular, int estado)
			
					modelo.addRow(fila);
				}	
			}
		
	//  
     void navegar(){
		int fila=tblAlumno.getSelectedRow();

		txtCodigo.setText("" +tblAlumno.getValueAt(fila, 0));
		txtNombre.setText("" +tblAlumno.getValueAt(fila, 1));
		txtApellido.setText("" +tblAlumno.getValueAt(fila, 2));
		txtDni.setText("" +tblAlumno.getValueAt(fila, 3));
		txtEdad.setText("" +tblAlumno.getValueAt(fila, 4));
		txtCelular.setText("" +tblAlumno.getValueAt(fila, 5));  
		cboEstado.getSelectedIndex();  // revisar
		 	}
     
    /* void mensaje(String s) {
 		JOptionPane.showMessageDialog(this, s);
 	} */ 
 	
 	//  Métodos que retornan valor (sin parámetros)
 	int leerCodigos () {
 		return Integer.parseInt(txtCodigo.getText().trim());
 	}
 	String leerNombre() {
 		return txtNombre.getText().trim();
 	}
 	String leerApellido() {
 		return txtApellido.getText().trim();
 	}
 	String leerDni () {
 		return txtDni.getText().trim();
 	}
 	int leerEdad () {
 		return Integer.parseInt(txtEdad.getText().trim());
 	}
 	
 	int leerCelular () {
 		return Integer.parseInt(txtCelular.getText().trim());
 	}
 	 
 	int leerEstado () {
 		return cboEstado.getSelectedIndex();
 	}
 	
 	
 	}
 	
	
	

