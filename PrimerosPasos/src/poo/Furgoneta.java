package poo;

public class Furgoneta extends Coche{ // extends: heredity

	private int capacidad_carga;
	
	private int plazas_extra;
	
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		
		super(); // Call the constructor of superclass, Coche()
		
		this.capacidad_carga = capacidad_carga;
		
		this.plazas_extra = plazas_extra;
		
	}
	
	
	public String getDatosFurgoneta() {
	
		return "La capacidad de carga es " + this.capacidad_carga + " y las plazas son " + plazas_extra; 
				
	}
	
}
