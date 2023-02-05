
public class Cadenas {

	public static void main(String[] args) {
		
		String nombre = "Francisco Javier Martinez Padin";
		
		System.out.println("Tu nombre es " + nombre);
		
		System.out.println("La longitud de tu nombre es de " + nombre.length() + " caracteres");
		
		System.out.println("La primera letra de tu nombre es una " + nombre.charAt(0));
		
		System.out.println("La ultima letra de tu nombre es una " + nombre.charAt(nombre.length()-1));
		
		
		String cadena = "Hoy es un estupendo dia para aprender a programar en Java";
		
		System.out.println(cadena.substring(10));
		
		System.out.println(cadena.substring(10, 24));
		
		System.out.println(cadena.substring(0, 28) + " irnos a la playa y olvidarnos de todo...");
		
		
		String alumno1, alumno2, alumno3, alumno4;
		
		alumno1 = "David";
				
		alumno2 = "David";
		
		alumno3 = "david";
		
		alumno4 = "Pedro";
		
		System.out.println(alumno1.equals(alumno2)); // Returns true if they are equals
		
		System.out.println(alumno1.equals(alumno3));
		
		System.out.println(alumno1.equals(alumno4));
		
		System.out.println(alumno1.equalsIgnoreCase(alumno3)); // The method equalsIgnoreCase(), doesn't care about case or non case letters

	}

}
