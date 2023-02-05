package poo;

public interface Jefes extends Trabajadores {

	// El programa Java da por hecho que pones public abstract, asique da igual que no lo pongas porque va a interpretarlo como tal de todos modos
	
	String tomar_decisiones(String decision);
	
}
