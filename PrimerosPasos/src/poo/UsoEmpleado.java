package poo;
import java.util.*;

// Only one class can have public as access modifier and only one class can have a public static void main
public class UsoEmpleado {

	public static void main(String[] args) {
		// Instances
		
		/*Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17); 
		
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		empleado1.setAumentoSueldo(5);
		
		empleado2.setAumentoSueldo(5);
		
		empleado3.setAumentoSueldo(5);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + 
				" Fecha de Alta: " + empleado1.getAltaContrato());
		
		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado3.getSueldo() + 
				" Fecha de Alta: " + empleado2.getAltaContrato());
		
		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + 
				" Fecha de Alta: " + empleado3.getAltaContrato());*/
		
		
		// Alternative
		
		Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefeRRHH.setIncentivo(2570);;
		
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		misEmpleados[3] = new Empleado("Antonio Fernandez"); // Sobrecarga de constructores
		
		misEmpleados[4] = jefeRRHH; // Polimorfismo
		
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		
		
		Jefatura jefa_Finanzas = (Jefatura)misEmpleados[5]; // Casting o refundicion de clase
		
		jefa_Finanzas.setIncentivo(55000);
		
		
		// Uso de instanceof
		/*Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 5, 5);
		
		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 6, 6);
		
		if(director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo jefatura");
			
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("Implementa la interfaz comparable");
			
		}*/
		
		
		//Jefatura jefe_Compras = (Jefatura) misEmpleados[1]; This throws an error, because an employee not always is a boss, so you cannot do this casting here
		
		
		// Interfaces
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.getNombre() + " tiene un bonus de " +  jefa_Finanzas.setBonus(500) + " euros");
		
		System.out.println("El empleado " + misEmpleados[3].getNombre() + " tiene un bonus de " +  misEmpleados[3].setBonus(200) + " euros");
		
		
		/*for(int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].setAumentoSueldo(5);
			
		}*/
		
		
		// Alternative loop for
		for(Empleado e:misEmpleados) {
			
			e.setAumentoSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados); // Debemos implementar la interfaz Comparable para que funcione
		
		/*for(int i = 0; i < misEmpleados.length; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: " + misEmpleados[i].getSueldo() + 
					" Fecha de Alta: " + misEmpleados[i].getAltaContrato());
			
		}*/
		
		// Alternative loop for
		for(Empleado e:misEmpleados) {
			
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + 
					" Fecha de Alta: " + e.getAltaContrato());
			
		}
		
	}

}


class Empleado implements Comparable, Trabajadores { // Debemos implementar la interfaz Comparable para poder usar el método Arrays.sort(Object[] a)
	
	public int compareTo(Object miObjeto) { // Y debemos implementar el método compareTo()
		
		Empleado otroEmpleado = (Empleado)miObjeto; // Debemos hacer una refundicion
		
		if(this.sueldo < otroEmpleado.sueldo) {
			
			return -1;
			
		}
		
		if(this.sueldo > otroEmpleado.sueldo) {
			
			return 1;
			
		}
		
		return 0; // Si son iguales
		
	}
	
	
	public double setBonus(double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion;
		
	}
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato; // We have to import java.util, in order to use Date
	
	
	public Empleado(String nombre, double sueldo, int anho, int mes, int dia) {
		
		this.nombre = nombre;
		
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(anho, mes-1, dia); // mes-1, because January it's 0
		
		this.altaContrato = calendario.getTime(); //getTime() returns the date	
		
	}
	
	
	// Sobrecarga de constructores
	public Empleado(String nombre) {
		
		this(nombre, 30000, 2000, 1, 1); // Añade datos por defecto
		
	}
	
	
	public String getNombre() {
		
		return this.nombre;
		
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
	
}


final class Jefatura extends Empleado implements Jefes{ // Con final, ninguna clase podrá heredar de ella, mira abajo la clase director, lo mismo pasa con los métodos. 
														//Si en Empleado ponemos: final public getSueldo(), en Jefatura no podremos llamarlo con el mismo nombre.
	
	public String tomar_decisiones(String decision){ // Debemos implementar el método de la interfaz, igual que en las clases abstractas (porque las interfaces tambien son abstractas
		
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
		
	}
	
	
	public double setBonus(double gratificacion) { // Debemos implementar el método de la interfaz Trabajadores porque está implementada en la interfaz Jefes
		
		double prima = 2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
		
	}
	
	
	private double incentivo;
	
	
	public Jefatura(String nombre, double sueldo, int anho, int mes, int dia) {
		
		super(nombre, sueldo, anho, mes, dia);
		
	}
	
	
	public void setIncentivo(double b) {
		
		this.incentivo = b;
		
	}
	
	
	public double getSueldo() {
		
		double sueldoJefe = super.getSueldo(); // With super, we make reference to getSueldo FROM class Empleado, NOT FROM class Jefatura
		
		return sueldoJefe + incentivo;
		
	}
	
}


/*class Director extends Jefatura{
	
	public Director(String nombre, double sueldo, int anho, int mes, int dia) {
		
		super(nombre, sueldo, anho, mes, dia);
		
	}
	
}*/

