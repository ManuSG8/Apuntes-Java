package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador3 {

	public static void main(String[] args) {
		
		Reloj2 mireloj = new Reloj2();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa 'OK' para terminar");
		
		System.exit(0);

	}

}


class Reloj2 {
	
	// Podemos prescindir del constructor de Reloj2
	
	public void enMarcha(int intervalo, final boolean sonido) { // Declaramos sonido como final, porque la clase interna usamos la variable sonido, pero intervalo no
		
		class DameLaHora2 implements ActionListener { // Clase interna local. Solo se puede llamar una vez. No puede llevar ningun modificador de acceso
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
				
				if(sonido) { // Equivalente if(sonido == true)
					
					Toolkit.getDefaultToolkit().beep();
					
				}
				
			}
			
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer mitemporizador = new Timer(intervalo, oyente);
		
		mitemporizador.start();
		
	}
	
	
	
	
}
