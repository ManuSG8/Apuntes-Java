
public class CalculosConMath {

	public static void main(String[] args) {
		
		// Math.sqrt() method
		//int raiz = Math.sqrt(16); This throws an error because Math.sqrt() returns a double. Watch for 'refundición'
		double raiz = Math.sqrt(16);
		System.out.println(raiz);
		
		
		// Math.round() method
		//int resultado = Math.round(9.34); You cannot convert a double or a float to integer. Watch for 'refundición'
		double resultado1 = Math.round(9.34);
		double resultado2 = Math.round(9.50);
		double resultado3 = Math.round(9.74);
		
		System.out.println(resultado1 + " " + resultado2 + " " + resultado3);
		
		
		// Refundición
		double num1 = 5.85;
		int resultado4 = (int)Math.round(num1); //Convert to integer the return of the method
		System.out.println(resultado4);
		
		
		// Math.pow() method
		double base = 5;
		double exponente = 3;
		//int resultado5 = Math.pow(base, exponente); Again, this method returns a double
		int resultado5 = (int)Math.pow(base, exponente);
		double resultado6 = Math.pow(base, exponente);
		System.out.println("Resultado entero " + resultado5);
		System.out.println("Resultado decimal " + resultado6); // Look at the difference: integer returns 125, double returns 125.0
		
	}

}
