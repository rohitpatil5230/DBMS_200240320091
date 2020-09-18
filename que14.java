import java.util.Scanner;
class que14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		String num=(year%4==0)?"Leap Year":"Not Leap Year";
		System.out.println(num);
	}
}