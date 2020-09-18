import java.util.Scanner;
class que19{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n= sc.nextInt();
		int num=2;
		int sum=0;
		for(int i=0;i<n;i++){
			num+=10;
			sum+=num;
			System.out.print(num+"+");
			
		}
		System.out.println(" ");
		System.out.println("sum= "+sum);
		
	}
}