
public class DeclaracionesOperadores {

	public static void main(String[] args) {
		
		int a = 5;
		
		int b;
		b = 7;
		
		int c = b + a;
		
		System.out.println("El resultado de a + b es " + c);
		
		c++;
		System.out.println(c);
		
		c+=4;
		System.out.println(c);
		
		c-=2;
		System.out.println(c);
		
		c = b / a;
		System.out.println(c); // Returns an integer not a decimal, because c is defined as integer
		
		
		double d = b / a;
		System.out.println(d); // This has no sense, a and b are integers so it would round it anyways
		
		
		double num1 = 5;	
		double num2 = 7;
		double num3 = num2 / num1;
		System.out.println(num3);
		
		
		//How to declare multiple variables in the same line
		int x, y, z, p;
		
		x = 10;
		
		y = 3;
		
		z = 8;
		
		p = 4;
		
		int resultado2 = x + y + z + p;
		
		System.out.println(resultado2);
		
		
		// How to declare constants
		final int constant = 10;
		
		System.out.println(constant);
		
		//constant = 2; This line throws an error because you can't change the value of constants
		
		
		final double aPulgadas = 2.54;
		
		int cm = 6;
		
		double resultado = cm / aPulgadas;
		
		System.out.println(cm + " cm son " + resultado + " pulgadas");
		
		
		

	}

}










