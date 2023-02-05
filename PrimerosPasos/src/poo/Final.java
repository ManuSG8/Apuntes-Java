package poo;

public class Final {

	public static void main(String[] args) {
		
		
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Ana");
		
		
		System.out.println(trabajador1.getDatos());
		
		System.out.println(trabajador2.getDatos());
		
		
		trabajador1.setSeccion("RRHH");
		
		//trabajador1.setNombre("Maria"); // Changing the name has no sense, we must use final to not allow this things
		
		System.out.println(trabajador1.getDatos());
		
		System.out.println(trabajador2.getDatos());

	}

}


class Empleados {
	
	private final String nombre;
	
	private String seccion;
	
	public Empleados(String nombre) {
		
		this.nombre = nombre;
		
		this.seccion = "Administracion";
		
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	public String getDatos() {
		
		return "El nombre es " + this.nombre + " y la seccion es " + this.seccion;
		
	}
	
	// This is not allowed because nombre is final
	/*public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}*/
	
}