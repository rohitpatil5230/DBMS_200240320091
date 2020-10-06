import java.util.*;
class que26{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int a[]={1,2,3};
		int b[]={4,5,6,7};
		int c[]={8,9,10};
		int d[]={11,12,13,14};
		int e[]={15,16,17};
		int arr[][]=new int [5][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
		}
		
		System.out.println("sum = "+sum);
		
		
	}
}