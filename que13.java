import java.util.Scanner;
class que13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num");
		int num1=sc.nextInt();
  		System.out.println("Enter 2nd num");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd num");
		int num3=sc.nextInt();
		int num=(num1>num2&&num1>num3)?num1:(num2>num3)?num2:num3;
		System.out.println("Greatest Num for ternary operator "+num);

		if(num1>num2&&num1>num3){
			System.out.println("Greatest Num for If Else "+num1);
		}
		else if(num2>num3){
			System.out.println("Greatest Num for If Else "+num2);
		}
		else{
			System.out.println("Greatest Num for If Else "+num3);
		}
		
	}
}