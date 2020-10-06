import java.util.*;
import java.lang.Math; 
class Product39{
	protected int pid;
	protected double price;
	protected int quantity;
	private static int arr1[];
	Product39(int pid,double price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	static double totalproduct(Product39 a[]){
		double sum=0;
		for(Product39 i: a){
			double single=i.price*i.quantity;
			sum+=single;
			System.out.println(sum);
		}
		return sum;
	}

}
//que39=ProductDemo
class que39{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Product39 arr[]=new Product39[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Pid");
			int pid=sc.nextInt();
			System.out.println("Enter price");
			double price=sc.nextDouble();
			System.out.println("Enter quantity");
			int quantity=sc.nextInt();
			Product39 p=new Product39(pid,price,quantity);
			arr[i]=p;
		}
		double maxpice=arr[0].price;
		int maxpid=arr[0].pid;
		for(Product39 i:arr){
			if(maxpice<i.price){
				maxpid=i.pid;
			}
		}
		System.out.println("pid of product with highest price.  "+maxpid);
		double totalsum=Product39.totalproduct(arr);
		System.out.println("amount spent on all products "+totalsum);
		
	}
}





