package colecciones;
import java.util.*; // LinkedList pertenece a este paquete

public class LinkedList_I {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("Pepe");
		
		personas.add("Sandra");
		
		personas.add("Ana");
		
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("Juan"); // Estará entre Pepe y Sandra porque se movió el iterador una posición en la línea anterior
		
		
		for(String prsna:personas) {
			
			System.out.println(prsna);
			
		}

	}

}
