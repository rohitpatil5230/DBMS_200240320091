import java.util.*;
class que30{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int a[]={1,2,3};
		int b[]={4,5,6};
		int c[]={7,8,9};
		int arr[][]=new int [3][3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==j){
					sum+=arr[i][j];
				}	
			}
		}
		
		System.out.println("sum = "+sum);
		
		
	}
}