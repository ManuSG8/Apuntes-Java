package colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("P en Java", "Juan", 25);
		
		Libro libro2 = new Libro("P en Java", "Juan", 25);
		
		//libro1 = libro2; // Juega a comentar y descomentar esta línea. De esta manera hacemos que la referencia (hashcode) de los 2 libros sea igual
		
		
		if(libro1.equals(libro2)) { // Esto al principio nos va a decir que NO ES el mismo libro, para ello debemos sobreescribir el método equals para que pueda distinguir los ISBN
			
			System.out.println("Es el mismo libro");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
			
		} else {
			
			System.out.println("No es el mismo libro");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
			
		}

	}

}
