package poo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();
		
		Timer mitemporizador = new Timer(5000, oyente); // 5000 ms -> 5 segundos
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener"); // Para que se mantenga en ejecución
		
		System.exit(0);
		
	}
	
}



class DameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) { // Implementamos el método que tiene la interfaz ActionListener
		
		Date ahora = new Date(); // Necesitamos importar java.util.*
		
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep(); // Para el sonido
		
	}
	
}


