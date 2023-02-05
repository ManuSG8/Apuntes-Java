package clasespropias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		
		// Líneas de referencia
		
		/*Empleado administrativa = new Empleado("Elena", 45, 1500);
		
		Empleado directoraComercial = new Jefe("Ana", 27, 3500);
		
		Empleado nuevoEmpleado = directoraComercial; // Un jefe es siempre un empleado. Puedo almacenar un elemento de tipo Jefe, dentro de una variable de tipo Empleado. Principio de sustitución*/

		
		
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		
		Pareja<Jefe> directoraComercial = new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevoEmpleado = directoraComercial; // Esto da error porque el principio de sustitución no se permite cuando manejas clases genéricas
		
		Pareja.imprimirTrabajador(administrativa);
		
		Pareja.imprimirTrabajador(directoraComercial); // Daría error porque espera una variable de tipo Empleado, no de tipo Jefe. Para solucionarlo usamos tipos comodín
		
	}

}
