import java.util.*;
import java.lang.Math; 
class MathOperation36{
	private int radius;
	private double area;
	static void multiply(int a,int b){
		int k= a*b;
		System.out.println(k);
	}
	static void multiply(float a,float b,float c){
		float k= a*b*c;
		System.out.println(k);
	}
	static void multiply(int arr[]){
		int k=1;
		for(int a:arr){
			k*= a;
		}
		System.out.println(k);
	}
	static void multiply(double a,int b){
		double k= a*b;
		System.out.println(k);
	}
}
//que34=Demo
class que36{
	public static void main(String args[]){
		int arr[]={1,2,3,4};
		MathOperation36.multiply(2,3);
		MathOperation36.multiply(2.2f,3.1f,4.2f);
		MathOperation36.multiply(arr);
		MathOperation36.multiply(2,3);
		
	}
}





