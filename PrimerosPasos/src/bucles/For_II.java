package bucles;
import javax.swing.*;

public class For_II {

	public static void main(String[] args) {
		
		// Check e-mail
		
		boolean arroba = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu e-mail: ");
		
		for (int i = 0; i < mail.length(); i++) {
			
			if(mail.charAt(i) == '@') { // Look, we use '' simple quotes
				
				arroba = true;
			}
			
		}

		if (arroba == true) {
			
			System.out.println("E-mail correcto");
			
		} else {
			
			System.out.println("E-mail incorrecto");
			
		}
		
	}

}
