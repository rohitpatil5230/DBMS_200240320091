import java.util.*;
class que22{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 Number");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int j=arr.length-1;j>=0;j--){
			System.out.println(arr[j]);
		}
		
	}
}