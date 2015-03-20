package interfaz;

import java.util.Scanner;

import logica.Calculadora;

public class VistaConsola {

	private Calculadora calculadora;
	private int eleccion;
	Scanner scanner = new Scanner(System.in);

	public VistaConsola(){
		calculadora = new Calculadora();
		System.out.println("Sumar= 1\nRestar= 2\nMultiplicar= 3\nDividir= 4\nSalir= 5 ");
		eleccion=(scanner.nextInt());
		Calcular(eleccion);
	}
	
	public void Calcular(int eleccion){
		switch(eleccion){
		case 1:
			System.out.println("ingrese el primer numero:");
			calculadora.setNum1(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			calculadora.setNum2(scanner.nextDouble());
			System.out.println("La suma entre: "+calculadora.getNum1()+" y "+ calculadora.getNum2()+ " es: \n"+calculadora.sumar());
			System.exit(0);
			break;
		case 2:
			System.out.println("ingrese el primer numero:");
			calculadora.setNum1(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			calculadora.setNum2(scanner.nextDouble());
			System.out.println("La resta entre: "+calculadora.getNum1()+" y "+ calculadora.getNum2()+ " es: \n"+ calculadora.restar());
			break;
		case 3:
			System.out.println("ingrese el primer numero:");
			calculadora.setNum1(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			calculadora.setNum2(scanner.nextDouble());
			System.out.println("La multiplicacion entre: "+calculadora.getNum1()+" y "+ calculadora.getNum2()+ " es: \n"+calculadora.multiplicar());
			break;
		case 4:
			System.out.println("ingrese el primer numero:");
			calculadora.setNum1(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			calculadora.setNum2(scanner.nextDouble());
			System.out.println("La division entre: "+calculadora.getNum1()+" y "+ calculadora.getNum2()+ " es: "+calculadora.dividir());
			break;
		}
		
		while(eleccion!=5);
		System.exit(0);
	}
}
