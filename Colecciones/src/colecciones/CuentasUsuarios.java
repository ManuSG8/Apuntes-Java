package colecciones;
import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		
		Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		
		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 500000);
		
		Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000);
		
		Cliente cl6 = new Cliente("Antonio Banderas", "00008", 200000);

		
		// Creamos la colección con la interfaz Set y el método HashSet()
		Set <Cliente> clientesBanco = new HashSet<Cliente>(); 
		
		
		// Agregamos los clientes a la colección
		clientesBanco.add(cl1);
		
		clientesBanco.add(cl2);
		
		clientesBanco.add(cl3);
		
		clientesBanco.add(cl4);
		
		clientesBanco.add(cl5); // No permite duplicados, porque sobreescribimos el método equals()
		
		clientesBanco.add(cl6);
		
		
		/*// Recorremos la colección	
		for (Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
			
		}*/
		
		
		/*// Otra manera de recorrer una colección: Iterator<T>
		Iterator<Cliente> it = clientesBanco.iterator(); // Creamos el objeto iterador
		
		while(it.hasNext()) { // Mientras haya un siguiente elemento...
			
			String nombreCliente = it.next().getNombre();
			
			System.out.println(nombreCliente);
			
			//String n_cuenta = it.next().getN_cuenta(); // Cuidado, volvemos a llamar a next(), por lo que saltamos a la siguiente posición
			//System.out.println(n_cuenta);
			
		}*/
		
		
		/*// Buscar y eliminar un objeto de la colección versión incorrecta. No podemos eliminar un objeto a la vez que recorremos una colección, va a dar un error
		for (Cliente cliente : clientesBanco) {
			
			if(cliente.getNombre().equals("Julio Iglesias")) {
				
				clientesBanco.remove(cliente); // Eliminamos el cliente en el que estamos, porque cumple la condición
				
			}
			
		}*/
		
		
		// Buscar y eliminar un objeto de la colección versión correcta
		Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombreCliente = it.next().getNombre();
			
			if(nombreCliente.equals("Julio Iglesias")) {
				
				it.remove();
				
			}
			
		}
		
		
		for (Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
			
		}
		
	}

}

