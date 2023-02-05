package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 2, 25);
		
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologia");
		
		for(Persona p:lasPersonas) {
			
			System.out.println(p.getNombre() + ". " + p.getDescripcion());
			
		}

	}

}


abstract class Persona { // If there is at least one abstract method, the class must be abstract.
	
	private String nombre;
	
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	
	public abstract String getDescripcion(); // Abstract method
	
}



class Empleado2 extends Persona {
	
	private double sueldo;
	
	private Date altaContrato; // We have to import java.util, in order to use Date
	
	
	public Empleado2(String nombre, double sueldo, int anho, int mes, int dia) {
		
		super(nombre);
		
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(anho, mes-1, dia); // mes-1, because January it's 0
		
		this.altaContrato = calendario.getTime(); //getTime() returns the date	
		
	}
	
	
	public double getSueldo() {
		
		return this.sueldo;
		
	}
	
	
	public Date getAltaContrato() {
		
		return this.altaContrato;
		
	}
	
	
	public void setAumentoSueldo(double porcentaje) {
		
		double aumento = (this.sueldo * porcentaje) /100;
		
		sueldo += aumento;
		
	}


	public String getDescripcion() { // Debemos sobreescribir el método abstracto de la clase abstracta Persona
		
		return "Este empleado tiene un sueldo de " + this.sueldo + " euros";
		
	}
	
}



class Alumno extends Persona {
	
	private String carrera;
	
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		
		this.carrera = carrera;
		
	}
	
	
	public String getDescripcion() {
		
		return "Este alumno esta estudiando la carrera de " + this.carrera;
		
	}

}




