package excepciones;
import javax.swing.*;

public class Fallos_V {

	public static void main(String[] args) {
		
		try {
		
			division();

		} catch(ArithmeticException e) { // Como poner varias excepciones
			
			System.out.println("Estas dividiendo por 0, la cual no se permite");
			
		} catch(NumberFormatException e) { // Simplemente poner más catch()
			
			System.out.println("No has introducido un numero entero");
			
			//System.out.println(e.getMessage()); // Devuelve un mensaje del error
			
			//System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());
			
		}
		
	}

	
	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introducel el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introducel el divisor"));
		
		System.out.println("El resultado es: " + num1/num2);
		
	}
	
}
