import java.util.Scanner;
class que17{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n= sc.nextInt();
		int re=0;
		while(n>0){
			int num=n%10;
			re=re*10+num;
			n=n/10;
		}
		System.out.println("Reverse "+re);
		
	}
}