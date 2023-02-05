package colecciones;
import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>(); // Recibe 2 elementos <clave, valor>

		personal.put("145", new Empleado("Juan"));
		
		personal.put("146", new Empleado("Ana"));
		
		personal.put("147", new Empleado("Antonio"));
		
		personal.put("148", new Empleado("Sandra"));
		
		System.out.println(personal);
		
		personal.remove("147");
		
		System.out.println(personal);
		
		personal.put("148", new Empleado("Natalia")); // Si introducimos un elemento con la misma clave que otro ya existente, lo reemplaza
		
		System.out.println(personal);
		
		System.out.println(personal.entrySet()); // Le decimos que nos devuelva una coleccion de tipo Set() y que nos la imprima (System.out.println)
		
		
		for(Map.Entry<String, Empleado> entrada:personal.entrySet()) {
			
			String clave = entrada.getKey();
			
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave = " + clave + ", Valor = " + valor);
			
		}
		
	}

}


class Empleado {
	
	private String nombre;
	
	private double sueldo;
	
	
	public Empleado(String nombre) {
		
		this.nombre = nombre;
		
		this.sueldo = 2000;
		
	}
	
	
	public String toString() {
		
		return "[Nombre = " + this.nombre + " , sueldo = " + this.sueldo + " ]";
		
	}
	
}
