import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Creating the object
		
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre = entrada.nextLine();
	
		
		System.out.println("Introduce tu edad: ");
		
		int edad = entrada.nextInt();
		
		
		System.out.println("Hola " + nombre + ". El anho que viene tendras " + (edad + 1) + " años");
		
		
		
	}

}
