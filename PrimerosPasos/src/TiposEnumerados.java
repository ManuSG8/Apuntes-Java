import java.util.*;

public class TiposEnumerados {
	
	/*1enum Talla {MINI, MEDIANO, GRANDE, MUYGRANDE} // Los tipos enumerados se crean fuera del main*/
	
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		
		private String abreviatura;
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
			
		}
		
		public String getAbreviatura() {
			
			return this.abreviatura;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*String talla;
		
		talla = "Pequenha";
		
		talla = "Mediana";
		
		talla = "Grande";
		
		talla = "Azul";*/ // Bro, como vas almacenar "azul" como una talla...
		
		
		/*1Talla s = Talla.MINI;
		
		Talla m = Talla.MEDIANO;
		
		Talla l = Talla.GRANDE;
		
		Talla xl = Talla.MUYGRANDE;
		
		//Talla xxl = Talla.ENORME; Da error porque ENORME no está incluido en el tipo enumerado*/
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: (MINI; MEDIANO; GRANDE; MUYGRANDE");
		
		String dato = entrada.next().toUpperCase(); // Tambien lo pasamos a mayúsculas para evitar problemas
		
		Talla la_talla = Enum.valueOf(Talla.class, dato);
		
		System.out.println("Talla: " + la_talla);
		
		System.out.println("Abreviatura: " + la_talla.getAbreviatura());
		
	}
	
}
