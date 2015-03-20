package logica;

public class Calculadora {

	private double num1, num2, res;
	public Calculadora(){
	}
	
	public double getNum1(){
		return num1;
	}
	public double getNum2(){
		return num2;
	}
	public void setNum1(double num1){
		this.num1=num1;
	}
	
	public void setNum2(double num2){
		this.num2=num2;
	}
	
	public double sumar(){
		this.res= this.num1+this.num2;
		return this.res;
	}
	public double restar(){
		res=num1-num2;
		return res;
	}
	public double multiplicar(){
		res=num1*num2;
		return res;
	}
	public double dividir(){
		if(num2!=0){
			res=num1/num2;
		}
		else{
			System.out.println("error");
		}
		return res;
	}


	
}
