package Exception;
import java.util.Scanner;
public class que58 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a[]= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		System.out.println("Enter day index");
		int index=sc.nextInt();
		
		if(index<7) {
			System.out.println(a[index]);
		}else {
			throw new ArrayIndexOutOfBoundsException("Enter day index range (0-6)");
		}
		

	}

}