import java.util.Scanner;
class que9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days");
		int days=sc.nextInt();
		int years=days/365;
		int remainDays=days%365;
		int months=remainDays/30;
		int Days1=remainDays%30;
		System.out.println("Days= "+Days1+" Months= "+months+" Year= "+years);
		
	}
}