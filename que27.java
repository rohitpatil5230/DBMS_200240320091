import java.util.*;
class que27{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int arr[]={3,40,11,12,1,13,14};
		
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		
		System.out.println("min = "+min+" max = "+max);
		
		
	}
}