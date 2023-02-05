import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: "); // It's not necessary to create the object
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad: "); // edad is a String because the return of the method JOptionPane.showInputDialog() is a String
		
		int edad_usuario = Integer.parseInt(edad); // Convert string to integer
		
		edad_usuario++; // Increment
		
		System.out.println("Tu nombre es " + nombre + " y tu edad el anho que viene sera " + edad_usuario + " anhos");

	}

}
