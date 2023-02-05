package colecciones;
import java.util.TreeSet;
import java.util.*;

public class PruebaTreeSet {

	public static void main(String[] args) {
		
		/*TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		
		ordenaPersonas.add("Amanda");
		
		ordenaPersonas.add("Diana");
		
		for(String s:ordenaPersonas) {
			
			System.out.println(s); // Con TreeSet las imprime por orden alfabético
			
		}*/
		
		
		Articulo primero = new Articulo(1, "Primer articulo");
		
		Articulo segundo = new Articulo(2, "Segundo articulo");
		
		Articulo tercer = new Articulo(3, "Este es el tercer articulo");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercer);
		
		ordenaArticulos.add(primero);
		
		ordenaArticulos.add(segundo);
		
		for(Articulo art:ordenaArticulos) {
			
			System.out.println(art.getDescripcion());
			
		}	
		
		
		Articulo comparadorArticulos = new Articulo();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos); // Al pasarle por parámatro comparadorArticulos, le decimos que los ordene según indique 
																						 // el criterio del método de comparadorArticulos (alfabéticamente por descripicon)
		ordenaArticulos2.add(primero);
		
		ordenaArticulos2.add(segundo);
		
		ordenaArticulos2.add(tercer);
	
		for(Articulo art:ordenaArticulos2) {
			
			System.out.println(art.getDescripcion());
			
		}
		
	}

}


class Articulo implements Comparable<Articulo>, Comparator<Articulo> { // Debemos implementar la interfaz Comparable para poder usar la clase Articulo con el método TreeSet

	private int numArticulo;
	
	private String descripcion;
	
	
	public Articulo() { // Creamos a mayores un constructor vacío
		
	}
	
	
	public Articulo(int num, String desc) {
		
		this.numArticulo = num;
		
		this.descripcion = desc;
		
	}
	
	
	public String getDescripcion() {
		
		return descripcion;
		
	}
	
	
	@Override // Debemos sobreescribir el método compareTo() 
	public int compareTo(Articulo o) { 
		
		return this.numArticulo - o.numArticulo;
	
	}


	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		String descripcionA = o1.getDescripcion();
		
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
		
	} 
	
	
}





