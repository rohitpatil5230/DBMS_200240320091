import java.util.*;
import java.lang.Math; 
class MathOperation{
	private int radius;
	private double area;
	static int add(int a,int b){
		return a+b;
	}
	static int substract(int a,int b){
		return a-b;
	}
	static int multiply(int a,int b){
		return a*b;
	}
	static double power(int a,int b){
		return Math.pow(a, b);
	}
}
//que34=Demo
class que35{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter to num for add,subtract,multiply and power");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=MathOperation.add(a,b);
		int sub=MathOperation.substract(a,b);
		int mul=MathOperation.multiply(a,b);
		double pwr=MathOperation.power(a,b);
		System.out.println("sum="+sum+" substract="+sub+" multiply="+mul+" power="+pwr);
	}
}





