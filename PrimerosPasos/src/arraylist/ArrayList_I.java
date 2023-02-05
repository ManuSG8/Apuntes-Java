package arraylist;
import java.util.*;

public class ArrayList_I {

	public static void main(String[] args) {
		
		// ARRAY NORMAL
		/*Empleado listaEmpleados[] = new Empleado[3];
		
		listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		
		listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
		
		listaEmpleados[2] = new Empleado("Maria", 25, 2600);*/

		
		// ARRAYLIST (debemos importar el paquete java.util)
		ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>(); // El tipo de dato se declara entre <>, y no permite almacenar datos primitivos (para eso necesitamos usar otros métodos)
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500)); // add() -> para añadir datos
		
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		
		System.out.println(listaEmpleados.size()); // size() -> nos dice cuantos elementos tiene la lista
		
		//listaEmpleados.trimToSize(); // Si estás seguro de que no se van añadir más datos, con trimTosize() cierras el arrayList y borra el exceso de memoria generado. Optimización de recursos
		
		//listaEmpleados.add(new Empleado("Olga", 22, 2200)); // Igualmente puedes añadir más datos después
		
		//listaEmpleados.set(1, new Empleado("Olga", 22, 2200)); // Introducimos un dato en una posición concreta
		
		//System.out.println("Hola " + listaEmpleados.get(2).getDatos()); // get() -> selecciona el dato en una posición concreta
		
		
		/*for(Empleado e:listaEmpleados) {
			
			System.out.println(e.getDatos());
			
		}*/
		
		
		// Uso de un iterador
		Iterator <Empleado> mi_iterador = listaEmpleados.iterator();
		
		while(mi_iterador.hasNext()) { // Con hasNext() sabemos si tiene más datos en la lista. Devuelve un boolean. En este caso: mi_iterador.hasNext() == true
			
			System.out.println(mi_iterador.next().getDatos()); // Con next() recorremos la lista, y con getDatos() proyectamos los datos en la consola
			
		}
		
		
		/*// Bucle for normal
		for(int i = 0; i < listaEmpleados.size(); i++) {
			
			Empleado e = listaEmpleados.get(i); // Se almacena en e, los datos del arrayLista iteración a iteración
			
			System.out.println(e.getDatos());
			
		}*/
		
		
		/*// Copiar los datos de un arrayList a un array normal
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()]; // El tamaño del array normal, será del tamaño del arrayList (.size())
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i = 0; i < arrayEmpleados.length; i++) {
			
			System.out.println(arrayEmpleados[i].getDatos());
			
		}*/
		
	}

}


class Empleado {
	
	private String nombre;
	
	private int edad;
	
	private double salario;
	
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.salario = salario;
		
	}
	
	
	public String getDatos() {
		
		return "El empleado se llama " + this.nombre + ". Tiene " + this.edad + " anhos." + "Y un salario de " + this.salario + " euros.";
		
	}
	
}

