package Programacion;

import javax.swing.JOptionPane;

public class Ejercicio3bloque3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String mensaje = "";		
		int num1, num2, opcion;
		String menu = "MENU/n"
				+ "1. Cálculo de la hipotenusa de un triángulo."
                + "2. Cálculo de la superficie de una circunferencia."
                + "3. Cálculo del perímetro de una circunferencia."
                + "4. Cálculo del área de un rectángulo."
                + "5. Cálculo del área de un triángulo."
                + "0. Salir de la aplicación.";
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		// Petición de los dos valores, en todos los casos se piden DOS valores
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Intoduzca primer n�mero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo n�mero"));
		
		// Resolución de la operación según el tipo de operación pedido por el usuario
		switch (opcion){
			case 1: //Calculo de la hipotenusa
				mensaje = "Resultado: " + Math.sqrt(Math.pow(num1, 2)) + (Math.pow(num2, 2));
			
		}

	}

}
