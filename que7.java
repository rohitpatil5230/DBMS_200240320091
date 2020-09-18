import java.util.Scanner;
class que7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Sub mark");
		double sub1=sc.nextDouble();
		System.out.println("Enter 2nd Sub mark");
		double sub2=sc.nextDouble();
		System.out.println("Enter 3rd Sub mark");
		double sub3=sc.nextDouble();
		System.out.println("Enter 4th Sub mark");
		double sub4=sc.nextDouble();
		System.out.println("Enter 5th Sub mark");
		double sub5=sc.nextDouble();
		double totle=sub1+sub2+sub3+sub4+sub5;
		double per=totle/5;
		System.out.println("percentage marks="+per);
		
	}
}