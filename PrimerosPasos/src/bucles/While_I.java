package bucles;
import javax.swing.*;

public class While_I {

	public static void main(String[] args) {
		
		String clave = "Juan";
		
		String password = "";
		
		while (clave.equals(password) == false){
			
			password = JOptionPane.showInputDialog("Introduce la contraseña: ");
			
			if (clave.equals(password) == false) {
				
				System.out.println("Contrasenha incorrecta. Intentalo de nuevo");
				
			}else {
				
				System.out.println("Contrasenha correcta. Acceso permitido");
				
			}
			
		}

	}

}
