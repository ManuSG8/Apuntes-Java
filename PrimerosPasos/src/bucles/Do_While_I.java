package bucles;
import java.util.*;

import java.util.Scanner;

public class Do_While_I {
	
	public static void main(String[] args) {	
	
		// This loop executes the code at least once
	
		int aleatorio = (int)(Math.random()*100); // Refundicion (int)  Math.random return a double between 0 and 1
	
		Scanner entrada = new Scanner(System.in);
	
		int numero = 0;
	
		int intentos = 0;
	
		do { 
		
			intentos++;
		
			System.out.println("Introduce un numero porfavor");
		
			numero = entrada.nextInt();
		
			if (aleatorio < numero) {
			
				System.out.println("Mas bajo");
			
			} else if (aleatorio > numero) {
			
				System.out.println("Mas alto");
			
				}
			
			} while (numero != aleatorio);
	
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
		

	}
	
}
	
	
	
	

