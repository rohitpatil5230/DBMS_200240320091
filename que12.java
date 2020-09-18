import java.util.Scanner;
class que12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
  		double hra;
		double da;
		if(salary<10000){
			hra=0.1*salary;
			da=0.9*salary;
		}
		else{
		hra=2000;
		da=0.98*salary;
		}
		double total_salary=salary+hra+da;
		System.out.println("Total Salary "+total_salary);
		
	}
}