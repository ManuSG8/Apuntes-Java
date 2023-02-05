package condicionales;
import java.util.*;
import javax.swing.*;

public class Switch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
			
		case 1: 
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));		
			
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			
			break; // We always put a break
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rectangulo es " + (base * altura));
			
			break; // We always put a break
		
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base")); // We can reuse the variables
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura")); // We can reuse the variables
			
			System.out.println("El area el triangulo es: " + ((base * altura) / 2));
			
			break; // We always put a break
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El area del circulo es: ");
			
			System.out.printf("%1.2f", (Math.PI * (Math.pow(radio, 2)))); // Math.PI() to get number Pi
			
			break; // We always put a break
			
		default: // It's like else, and it's optional too
			
			System.out.println("La opcion no es correcta");
			
		}
		
	}
	
}
