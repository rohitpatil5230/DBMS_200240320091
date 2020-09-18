import java.util.Scanner;
class que8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principe amount");
		double pri=sc.nextDouble();
		System.out.println("Enter Rate");
		double rate=sc.nextDouble();
		System.out.println("Enter Time");
		double time=sc.nextDouble();
		double SI=(pri*rate*time)/100;
		System.out.println("Simple Intrest="+SI);
		
	}
}