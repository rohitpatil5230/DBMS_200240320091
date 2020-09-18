import java.util.Scanner;
class que21{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 Number");
		int arr[]=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("sum="+sum+" avg="+avg);
	}
}