package arreglos;

import java.util.ArrayList;

import clases.Alumno;

public class ArregloAlumnos {
	
	//Atributo privado (declaracion )
	private ArrayList<Alumno> alum;
	
		
	public ArregloAlumnos() {
		alum= new ArrayList<Alumno>();
		
		adicionar(new Alumno(202010001, "Andrea", "Chávez Heredia", "44076870",     28, 96722785, 0));		
		adicionar(new Alumno(202010002,	"Luis Felipe", "Delgado Barrón", "64400820",21,	97225396, 1));
		adicionar(new Alumno(202010003,	"Andres Miguel", "Espejo Ramos", "70553660",18, 94880783, 2));
		adicionar(new Alumno(202010004,	"Karla Soledad", "Flores Silva", "31121707",33, 98319480, 0));
		adicionar(new Alumno(202010005,	"Lorenzo Tito",	"García Orozco", "77885348",	25, 98254951, 0));
		adicionar(new Alumno(202010006,	"Sara Janet", "Lara Agapito",    "17050303",	30,	97340626, 1));
		adicionar(new Alumno(202010007,	"Diana Laura","Morales Gonzalez" ,"42873051",	22,	90314463, 2));
		adicionar(new Alumno(202010008, "Adriana Alejandra" ,"Ortega Romero", "61450461",26,97010090, 1));
		adicionar(new Alumno(202010009, "Ricardo Alonso", "Torres Rojas",  "54503505",	31,	98080499, 1));
		adicionar(new Alumno(202010010, "Javier Elvis" ,"Zamora Peinado",  "15862135",	35,	91933131, 0));

		}
	
     	// metodo adicionar 
		public void adicionar(Alumno x) {
		alum.add(x);
		}
		
		// metodo 
		public int tamaño() {
		return alum.size();
		}
		
		// obtiene la pos del arraylist
		public Alumno obtener(int i) {
		return alum.get(i);
		}
		
		
	
	
	

}



















