import java.util.*;
class que29{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("How many element enter in one-D array");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		int arr1[][]=new int[2][];
		int k=0;
		int l=0;
		for(int i=0;i<num;i++){
			if(num%2==0){
				//arr1[0][0]=arr[i];
				k++;
			}
			else{
				//arr1[1][0]=arr[i];
				l++;
			}
		}
		int a[]=new int[k];
		int b[]=new int[l];
		int m=0;
		int n=0;
		for(int i=0;i<num;i++){
			if(num%2==0){
				a[m]=arr[i];
				m++;
			}
			else{
				b[n]=arr[i];
				n++;
			}
		}
		int arr1[0]=a;
		int arr1[1]=b;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		
	}
}