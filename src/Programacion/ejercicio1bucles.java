package Programacion;

import javax.swing.JOptionPane;

public class ejercicio1bucles {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int i, acumuladorNumerosMayores10 = 0;
		
		for (i = 1; i < 5; i++) {
			int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero " + i));
			
			
		if (numero>10) {
		acumuladorNumerosMayores10 += numero;
			}
			
		}
		JOptionPane.showMessageDialog(null, acumuladorNumerosMayores10, , messageType);
	}

}
