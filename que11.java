import java.util.Scanner;
class que11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Num for Awap");
		int num1=sc.nextInt();
  		int num2=sc.nextInt();
		System.out.println("After Swap");
		System.out.println("num1= "+num1+" num2= "+num2);
		int num = num1+ num2;
		num2= num-num2;
 		num1= num-num2;
		System.out.println("Before Swap");
		System.out.println("num1= "+num1+" num2= "+num2);
		
	}
}