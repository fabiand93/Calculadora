package interfaz;

import java.util.Scanner;

public class VistaConsola {
	double num1, num2, res;
	int eleccion;
	 Scanner scanner = new Scanner(System.in);
	 
	public void Calcular(int eleccion){
		switch(eleccion){
		case 1:
			System.out.println("ingrese el primer numero:");
			num1=(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			num2=(scanner.nextDouble());
			res=num1+num2;
			System.out.println("La suma entre: "+num1+" y "+ num2+ "es: \n"+res);
			System.exit(0);
			break;
		case 2:
			System.out.println("ingrese el primer numero:");
			num1=(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			num2=(scanner.nextDouble());
			res=num1-num2;
			System.out.println("La resta entre: "+num1+" y "+ num2+ " es: \n"+ res);
			break;
		case 3:
			System.out.println("ingrese el primer numero:");
			num1=(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			num2=(scanner.nextDouble());
			res=num1*num2;
			System.out.println("La multiplicacion entre: "+num1+" y "+ num2+ " es: \n"+res);
			break;
		case 4:
			System.out.println("ingrese el primer numero:");
			num1=(scanner.nextDouble());
			System.out.println("ingrese el segundo numero:");
			num2=(scanner.nextDouble());
			if (num2!=0){
				res=num1/num2;
				System.out.println("La suma entre: "+num1+" y "+ num2+ " es: "+res);
				break;
				}
				else{
					System.out.println("Math Error");
					break;
					}
		}
		while(eleccion!=5);
		System.exit(0);
	}
	
	public VistaConsola(){
		System.out.println("Sumar= 1\nRestar= 2\nMultiplicar= 3\nDividir= 4\nSalir= 5 ");
		eleccion=(scanner.nextInt());
		Calcular(eleccion);
	}
}
