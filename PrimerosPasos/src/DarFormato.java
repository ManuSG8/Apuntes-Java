import javax.swing.JOptionPane;

public class DarFormato {

	public static void main(String[] args) {

		/*double x = 10000.0;
		
		System.out.printf("%1.2f",x / 3); // printf: print with format   1.2 means 2 decimals  1.3 means 3 decimals ...
		*/
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		
		System.out.printf("%1.2",Math.sqrt(num2)); //Should work but...okay...

	}

}
