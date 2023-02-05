package bucles;

public class For_Each {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
		
		paises[0] = "Espanha";
		paises[1] = "Mexico";
		paises[2] = "Colombia";
		paises[3] = "Peru";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";

		
		for(int i = 0; i < paises.length; i++) {
			
			System.out.println("Pais " + (i+1) + " : " + paises[i]);
			
		}
		
		
		for(String elemento:paises) { // elemento should be as the same type as the array (String)
			
			System.out.println("Pais " + elemento);
			
		}
		
	}

}
