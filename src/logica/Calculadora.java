package logica;
import javax.swing.*;

public class Calculadora {
	
	private int eleccion;
	private double a,b,suma,resta,multiplicacion,division,resultado;
	
	 {
		eleccion=Integer.parseInt(JOptionPane.showInputDialog("nCalculadoran"+
            "[1] SUMAR"+"[2] RESTAR /n[3] MULTIPLICAR[4] DIVIDIR/n[5] SALIR"
            +"Ingresa una opcion:"));
		switch(eleccion){
		case 1:
			a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
			b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
			resultado=a+b;
			JOptionPane.showMessageDialog(null, "La suma es: "+ suma);
			break;
		case 2:
			a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
			b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
			resultado=a-b;
			JOptionPane.showMessageDialog(null, "La resta es: "+ resta);
			break;
		case 3:
			a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
			b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
			resultado=a*b;
			JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ multiplicacion);
			break;
		case 4:
			a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
			b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
			resultado=a/b;
			JOptionPane.showMessageDialog(null, "La division es: "+ division);
			break;
		}
		while(resultado!=5);
	}

}
