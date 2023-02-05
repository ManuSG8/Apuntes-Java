package bucles;
import javax.swing.JOptionPane;

public class For_III {

	public static void main(String[] args) {
		
		int arroba = 0;
		
		boolean punto = false;
				
		String mail = JOptionPane.showInputDialog("Introduce tu e-mail: ");
				
		for (int i = 0; i < mail.length(); i++) {
					
			if(mail.charAt(i) == '@') { // Look, we use '' simple quotes
						
				arroba++;
			}
			
			if(mail.charAt(i) == '.') {
				
				punto = true;
				
			}
					
		}

		if (arroba == 1 && punto == true) {
					
			System.out.println("E-mail correcto");
					
		} else {
					
			System.out.println("E-mail incorrecto");
					
		}

	}

}
