import java.util.*;
class que24{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter search Number");
		int num=sc.nextInt();
		int flage=0;
		for(int j=0;j<arr.length;j++){
			if(num==arr[j]){
				System.out.println(num+" this element is available in index of "+j);
				flage=1;
				break;
				
			}
	
		}
		if(flage==0){
			System.out.println("Element is not available");
		}
		
	}
}