package colecciones;

public class Libro {

	private String titulo;
	
	private String autor;
	
	private int ISBN;
	
	
	public Libro(String titulo, String autor, int ISBN) {
		
		this.titulo = titulo;
		
		this.autor = autor;
		
		this.ISBN = ISBN;
		
	}
	
	
	public String getDatos() {
		
		return "El titulo es: " + this.titulo + ". El autor es " + this.autor + ". Y el ISBN es " + this.ISBN;
		
	}
	
	
	// Sobreescribimos el método equals. Tambien lo podemos hacer automáticamente generandolo en la ventana de Source, junto al método hashCode()
	public boolean equals(Object obj) {
		
		if(obj instanceof Libro) {
			
			Libro otro = (Libro)obj;
			
			if(this.ISBN == otro.ISBN) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		} else {
			
			return false;
			
		}
		
	}
	
}
