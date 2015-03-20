package interfaz;

import javax.swing.*;

import logica.Calculadora;

public class VistaJOption {
	private int eleccion;
	private Calculadora calculadora;
	
	 {
		eleccion=Integer.parseInt(JOptionPane.showInputDialog("Calculadora\n[1] SUMAR\n[2] RESTAR \n[3] MULTIPLICAR\n[4] DIVIDIR\n[5] SALIR\n Ingrese una opcion:"));
		switch(eleccion){
		case 1:
			calculadora.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero")));
			calculadora.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero")));
			JOptionPane.showMessageDialog(null, "La suma es: "+ calculadora.sumar());
			break;
		case 2:
			calculadora.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero")));
			calculadora.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero")));
			JOptionPane.showMessageDialog(null, "La resta es: "+ calculadora.restar());
			break;
		case 3:
			calculadora.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero")));
			calculadora.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero")));
			JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ calculadora.multiplicar());
			break;
		case 4:
			calculadora.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero")));
			calculadora.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero")));
			JOptionPane.showMessageDialog(null, "La division es: "+calculadora.dividir());
			break;
		}
		while(eleccion!=5);
	}

}
