package Exception;

import java.util.Scanner;
import java.lang.Exception;

interface StudentsFee{
	void getFee() throws InvalidFeeException;
}

class InvalidFeeException extends Exception{
	   InvalidFeeException(){
		 
	   }
}
class SalaryException extends InvalidFeeException implements StudentsFee{
	   private String name;
	   private int sal;
	   SalaryException(){}
	   SalaryException(String name,int sal){
		   this.name=name;
		   this.sal=sal;
	   }

	@Override
	public void getFee() throws InvalidFeeException{
		if(sal>5000) {
			System.out.println(name+" "+sal);
		}else {
			throw new InvalidFeeException();
		}
		
	}
	 
}
public class que60  {

	public static void main(String[] args) throws InvalidFeeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the salary");
		int sal=sc.nextInt();
	    SalaryException s= new SalaryException(name,sal);
	    s.getFee();
	 
	}

}
