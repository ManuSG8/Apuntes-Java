package clasespropias;

public class Pareja<T> { // Así se define una clase genérica. Se suelen usar las letras: T U K

	private T primero;
	
	
	public Pareja() {
		
		this.primero = null;
		
	}
	
	
	public void setPrimero(T nuevoValor) { // Con la T le decimos que va a recibir un elemento de tipo genérico
		
		this.primero = nuevoValor;
		
	}
	
	
	public T getPrimero() { // Con la T le decimos que va a devolver un elemento de tipo genérico
		
		return this.primero;
		
	}
	
	
	/*public static void imprimirTrabajador(Pareja<Empleado> p) {
		
		Empleado primero = p.getPrimero();
		
		System.out.println(primero);
		
	}*/
	
	// Con tipo comodín
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) { // Le decimos que puede recibir un objeto de tipo Empleado, o cualquier subclase perteneciente a Empleado
		
		Empleado primero = p.getPrimero();
		
		System.out.println(primero);
		
	}
	
}
