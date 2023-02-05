package poo;
import paquetepruebas.Clase3; // Debemos importar el paquete porque la Clase3 está en otro paquete

public class Clase2 {

	public static void main(String[] args) {
		
		Clase1 miobjeto = new Clase1();
		
		Clase3 miobjeto2 = new Clase3();
		
		System.out.println(miobjeto.mimetodo());
		
		System.out.println(miobjeto2.mimetodo());

	}

}
