package excepciones;
import javax.swing.*;

public class Fallos_I {

	public static void main(String[] args) {
		
		int [] miMatriz = new int[5];
		
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
		miMatriz[5] = 81; // Esto da una excepcion. Nos pasamos del limite del array
		
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Posicion: " + i + " = " + miMatriz[i]);
			
		}
		
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
				 
		System.out.println("Hola " + nombre + ". Tienes " + edad + " anhos." + " El programa termino su ejecucion.");
		
	}

}
