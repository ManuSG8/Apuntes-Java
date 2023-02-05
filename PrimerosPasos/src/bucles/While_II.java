package bucles;
import java.util.*;

public class While_II {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100); // Refundicion (int)  Math.random return a double between 0 and 1
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		while (numero != aleatorio) { // != different
			
			intentos++;
			
			System.out.println("Introduce un numero porfavor");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("Mas bajo");
				
			} else if (aleatorio > numero) {
				
				System.out.println("Mas alto");
				
				}
				
			}
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
			
		}

}


