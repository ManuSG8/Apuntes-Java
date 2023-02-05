package arrays;

public class Arrays_I {

	public static void main(String[] args) {
		
		int [] mi_matriz = new int[5]; // [5] number of elements in the array
		//int mi_matriz[] = new int[5] This is a valid way to declare the array too
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		
		System.out.println("Usando un print: " + mi_matriz[3]);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(mi_matriz[i]);
			
		}
		
		
		// Another way to declare an array
		
		int [] mi_matriz2 = {5, 38, -15, 92, 71, 95, 85, 65, 25, 14, 78};
		
		System.out.println("Usando un print: " + mi_matriz2[3]);
		
		for(int i = 0; i < mi_matriz2.length; i++) {
			
			System.out.println(mi_matriz2[i]);
			
		}

	}

}
