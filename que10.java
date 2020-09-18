import java.util.Scanner;
class que10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit");
		double fah=sc.nextDouble();
		double cel=5*(fah-32)/9 ;
		System.out.println("Celsius "+cel);
		
	}
}