package arraylist;
import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {
		
		ArrayList2 archivos = new ArrayList2(4);
		
		archivos.add("Juan");
		
		archivos.add("Maria");
		
		archivos.add("Ana");
		
		archivos.add("Sandra");
		
		String nombrePersona = (String)archivos.get(2); // Le hacemos un casting porque archivos.get() devuelve un valor de tipo Object
		
		System.out.println(nombrePersona);
		
	}

}
