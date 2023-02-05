package condicionales;
import java.util.*;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		
		int edad = entrada.nextInt();
		
		
		if(edad >= 18) {
			
			System.out.println("Es mayor de edad");
			
		}else{
			
			System.out.println("Es menor de edad");
			
		}
		
		
		if(edad < 18){
			
			System.out.println("Es un adolescente");
			
		}else if(edad<40){
			
			System.out.println("Es joven");
			
		}else if(edad<65){
			
			System.out.println("Es maduro");
			
		}else{
			
			System.out.println("Cuidate");
			
		}

	}

}
