package poo;

public class Coche {

	private int ruedas; // private means encapsulate
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	// Constructor
	public Coche() {
		
		this.ruedas = 4;
		
		this.largo = 2000;
		
		this.ancho = 300;
		
		this.motor = 1600;
		
		this.peso_plataforma = 500;
		
	}
	
	
	public String getLargo() {
		
		return "El largo del coche es " + this.largo + " cm";
		
	}
	
	
	public void setColor(String color_coche) {
		
		this.color = color_coche;
		
	}
	
	
	public String getColor() {
		
		return "El color del coche es " + this.color;
		
	}
	
	
	public String dimeDatosGenerales() {
		
		return "La plataforma del vehiculo tiene " + this.ruedas + " ruedas" + 
		". Mide " + this.largo/1000 + " metros con un ancho de " + this.ancho + 
		" cm y un peso de plataforma de " + this.peso_plataforma + " kg.";
		
	}
	
	
	public void setAsientosCuero(String asientos_cuero) { // Look, the name of the argument is equal to the class variable
		
		if(asientos_cuero.equalsIgnoreCase("si") == true) {
			
			this.asientos_cuero = true; // With "this", we make reference of the class
			
		} else {
			
			this.asientos_cuero = false;
			
		}
		
	}
		
	
	public String getAsientosCuero() {
		
		if(this.asientos_cuero == true) {
			
			return "El coche tiene asientos de cuero";
			
		} else {
			
			return "El coche tiene asientos de serie";
			
		}
		
	}
	
	
	public void setClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si") == true) {
			
			this.climatizador = true;
			
		} else {
			
			this.climatizador = false;
			
		}
		
	}
	
	
	public String getClimatizador() {
		
		if(this.climatizador == true) {
			
			return "El coche incorpora climatizador";
			
		} else {
			
			return "El coche lleva aire acondicionado";
			
		}
		
	}
	
	
	public String getPesoCoche() { // This is a setter and a getter. Not recommended
		
		int peso_carroceria = 500;
		
		this.peso_total = this.peso_plataforma + peso_carroceria;
		
		if(this.asientos_cuero == true) {
			
			this.peso_total  = this.peso_total + 50;
			
		}
		
		if(this.climatizador == true) {
			
			this.peso_total = this.peso_total + 20;
			
		}
		
		return "El peso del coche es " + peso_total;
		
	}
	
	
	public int getPrecioCoche() { // This is a getter, because we are not changing the value of any class variables
		
		int precio_final = 10000;
		
		if(this.asientos_cuero == true) {
			
			precio_final+=2000;
			
		}
		
		if(this.climatizador == true) {
			
			precio_final+=1500;
			
		}
		
		return precio_final;
		
	}
		 
		
}
	
	
	/*public static void main(String[] args) {
		
		Coche renault = new Coche(); // Class instance
		
		System.out.println("Este coche tiene " + renault.ruedas + " ruedas");
		
	}*/ // You can put a main here too, or you can put it on another class like we did
	


// You can create more classes in the same archive, but it's not recommended
/*class Camion {
	
}

class Moto {
	
}*/





