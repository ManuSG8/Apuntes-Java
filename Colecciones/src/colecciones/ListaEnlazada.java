package colecciones;
import java.util.*;

public class ListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("Espanha");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");

		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		
		System.out.println(paises);
		System.out.println(capitales);
		
		
		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();
		
		while(iterB.hasNext()) {
			
			if(iterA.hasNext()) {
				
				iterA.next();
				
			}
			
			iterA.add(iterB.next());
			
		}
		
		System.out.println(paises);
		
		
		// Elimina los datos en posiciones pares
		iterB = capitales.listIterator();
		
		while(iterB.hasNext()) {
			
			iterB.next();
			
			if(iterB.hasNext()) {
				
				iterB.next();
				
				iterB.remove();
				
			}
			
		}
		
		System.out.println(capitales);
		
		
		// Elimina la colección de capitales y la borra tambien de la colección de países
		paises.removeAll(capitales);
		
		System.out.println(paises);
		
	}

}
