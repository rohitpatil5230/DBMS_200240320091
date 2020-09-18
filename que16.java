import java.util.Scanner;
class que16{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num= sc.nextInt();
		for(int i=1;i<=10;i++){
			int mul=num*i;
			System.out.println(num+" * "+i+" = "+mul);
		}
		
	}
}