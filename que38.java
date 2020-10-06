import java.util.*;
import java.lang.Math; 
class Employee38{
	static private int empNo=0;
	private double salary;
	private double totalSalary;
	Employee38(double salary){
		this.salary=salary;
		this.totalSalary=salary;
		empNo++;
	}

	void Display(){
		System.out.println("empNo="+empNo+" TotalSalary="+totalSalary);
	}
}
//que38=EmployeeDemo
class que38{
	public static void main(String args[]){
		Employee38 p=new Employee38(40000);
		p.Display();
		Employee38 p1=new Employee38(50000);
		p1.Display();
	}
}





