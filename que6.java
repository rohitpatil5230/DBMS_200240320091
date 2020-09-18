import java.util.Scanner;
class que6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double rad=sc.nextDouble();
		double PI=3.14;
		double area=Math.pow(rad,2)*PI;
		double cirm=2*PI*rad;
		System.out.println("Area="+area);
		System.out.println("Circumference="+cirm);
		
	}
}