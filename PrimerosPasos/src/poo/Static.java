package poo;

public class Static {

	public static void main(String[] args) {
		
		
		Empleados2 trabajador1 = new Empleados2("Paco");
		
		Empleados2 trabajador2 = new Empleados2("Ana");
		
		Empleados2 trabajador3 = new Empleados2("Antonio");
		
		
		System.out.println(trabajador1.getDatos());
		
		System.out.println(trabajador2.getDatos());
		
		
		trabajador1.setSeccion("RRHH");
		
		//trabajador1.setNombre("Sara"); // Changing the name has no sense, we must use final to not allow this things
		
		System.out.println(trabajador1.getDatos());
		
		System.out.println(trabajador2.getDatos());
		
		System.out.println(trabajador3.getDatos());
		
		
		// Static methods aren't used with an object, only with the class. Error: trabajador.getIdSiguiente()
		System.out.println(Empleados2.getIdSiguiente());

	}

}


class Empleados2 {
	
	private final String nombre;
	
	private String seccion;
	
	private int id;
	
	private static int idSiguiente = 1;
	
	public Empleados2(String nombre) {
		
		this.nombre = nombre;
		
		this.seccion = "Administracion";
		
		this.id = this.idSiguiente;
		
		this.idSiguiente++;
		
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	public String getDatos() {
		
		return "El nombre es " + this.nombre + ", la seccion es " + this.seccion + " y el ID es " + this.id;
		
	}
	
	public static String getIdSiguiente() {
		
		return "El id siguiente es: " + idSiguiente;
		
	}
	
	// This is not allowed because nombre is final
	/*public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}*/
	
}