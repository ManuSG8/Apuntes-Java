package clasespropias;

public class UsoPareja {

	public static void main(String[] args) {
		
		Pareja<String> una = new Pareja<String>();

		una.setPrimero("Juan");
		
		System.out.println(una.getPrimero());
		
		
		Persona pers1 = new Persona("Ana");
		
		Pareja<Persona> otra = new Pareja<Persona>();	
		
		otra.setPrimero(pers1);
		
		System.out.println(otra.getPrimero());
		
	}

}



class Persona {
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String toString() { // Sobreescribimos este método de la clase Object para que saque por consola el nombre "Ana", no el código del objeto
		
		return this.nombre;
		
	}
	
}