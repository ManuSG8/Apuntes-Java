package excepciones;
import java.util.*;

public class Fallos_II {

	public static void main(String[] args) {
		
		System.out.println("Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada = new Scanner(System.in);
		
		int decision = entrada.nextInt();
		
		if(decision ==1) {
			
			try {
			
				pedirDatos();
			
			} catch(InputMismatchException e) {
				
				System.out.println("Que demonios has introducido?");
				
			}
			
		} else {
			
			System.out.println("Adios");
			
			System.exit(0);
			
		}
		
		entrada.close();

	}
	
	static void pedirDatos() throws InputMismatchException{ // Debes poner el throw. Aunque es más correcto hacerlo en la llamada del método (línea 18)
		
		//try {
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce tu nombre: ");
			
			String nombre_usuario = entrada.nextLine();
			
			System.out.println("Introduce tu edad: ");
			
			int edad = entrada.nextInt();
			
			System.out.println("Hola " + nombre_usuario + ". El anho que viene tendras " + (edad+1) + " anhos");
			
			entrada.close();
		
		//} catch(InputMismatchException e) { // Podrías poner "Exception e" a secas, es más general, pero funciona igualmente
			
			//System.out.println("Que demonios has introducido?");
			
		//}
		
		System.out.println("Hemos terminado");
		
	}

}


