package poo;


public class UsoVehiculo {

	public static void main(String[] args) {
		
		/*Coche micoche = new Coche(); // Class instance
		
		// We cannot access to the variables in the class Coche because they 
		// are encapsulated (private) so we have to use the setters and getters
		
		
		//System.out.println("Este coche tiene " + micoche.ruedas + " ruedas");
		
		
		//micoche.ruedas = 3; // This has no sense, we have to encapsulate
		
		System.out.println(micoche.getLargo());
		
		
		micoche.setColor(JOptionPane.showInputDialog("Introduce el color")); // We can use a JOptionPane to get the parameters
		
		System.out.println(micoche.getColor());
		
		System.out.println(micoche.dimeDatosGenerales());
		
		
		micoche.setAsientosCuero("si");
		
		System.out.println(micoche.getAsientosCuero());
		
		
		micoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(micoche.getClimatizador());
		
		
		System.out.println(micoche.getPesoCoche());
		
		
		System.out.println("El precio del coche es: " + micoche.getPrecioCoche() + " euros");*/
		
		
		
		// Use of class Furgoneta
		
		Coche micoche1 = new Coche();
		
		micoche1.setColor("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(580, 7);
		
		mifurgoneta1.setColor("");
		
		mifurgoneta1.setAsientosCuero("si");
		
		mifurgoneta1.setClimatizador("si");
		
		System.out.println(micoche1.dimeDatosGenerales() + " " + micoche1.getColor());
		
		System.out.println(mifurgoneta1.dimeDatosGenerales() + " " + mifurgoneta1.getDatosFurgoneta());
		
	}

}
