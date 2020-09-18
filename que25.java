import java.util.*;
class que25{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		int evensum=0;
		int oddsum=0;
		System.out.println("Enter how many Number add in array");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j]%2==0){
				evensum+=arr[j];
			}
			else{
				oddsum+=arr[j];
			}
	
		}
		System.out.println("sum of event number "+evensum+" & sum of event number "+oddsum);
		
		
	}
}