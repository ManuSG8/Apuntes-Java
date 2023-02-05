package clasespropias;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombres[] = {"Jose", "Maria", "Pepe"};
		
		String elementos = MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		
		System.out.println(MisMatrices.getMenor(nombres));

	}

}


class MisMatrices {
	
	public static <T> String getElementos(T[] a) { // Con la T le decimos que va a recibir un array de tipo indefinido
		
		return "El array tiene " + a.length + " elementos";
		
	}
	
	public static <T extends Comparable> T getMenor(T[] a) { // extends Comparable para poder usar el compareTo()
		
		if(a == null || a.length == 0) {
			
			return null;
			
		}
		
		T elementoMenor = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			if(elementoMenor.compareTo(a[i]) > 0) {
				
				elementoMenor = a[i];
				
			}
			
		}
		
		return elementoMenor;
		
	}
	
}
