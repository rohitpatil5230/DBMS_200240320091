import java.util.Scanner;
class que15{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the gender");
		char gender= sc.next().charAt(0);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(((gender=='F'|| gender=='f') && age>=21) || ((gender=='M'||gender=='m') && age>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Not Eligible for marriage");
		}
	}
}