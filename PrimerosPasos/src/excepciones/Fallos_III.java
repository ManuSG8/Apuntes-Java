package excepciones;
import javax.swing.*;
import java.io.*;

public class Fallos_III {

	public static void main(String[] args) {
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		try {
		
			examina_mail(mail);
			
		}catch(EOFException e) {
			
			System.out.println("La direccion de email no es correcta");
			
		}
		
	}

	
	static void examina_mail(String mail) throws EOFException { // De esta forma le indicas a los demás, que el método puede lanzar una excepcion
		
		int arroba = 0;
		
		boolean punto = false;
		
		if(mail.length() <= 3) { // Lanzamos un error si el mais tiene menos de 3 caracteres
			
			/*ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException(); // Usamos un error cualquiera, porque no sabemos que error es
			
			throw miExcepcion;*/
			
			//throw new ArrayIndexOutOfBoundsException(); // Equivalente
			
			throw new EOFException();
			
		} else {
		
			for(int i = 0; i < mail.length(); i++) {
				
				if(mail.charAt(i) == '@') {
					
					arroba++;
					
				}
				
				if(mail.charAt(i) == '.') {
					
					punto = true;
					
				}	
				
			}
			
			if(arroba == 1 && punto == true) {
				
				System.out.println("Es correcto");
				
			} else {
				
				System.out.println("No es correcto");
				
			}
			
		}
	}
	
}
