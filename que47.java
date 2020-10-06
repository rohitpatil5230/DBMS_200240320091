import java.util.*;
class Person47{
	Person47(){
		System.out.println("super 0 parameter constructor");
	}
	Person47(String name,String surname, int roolno){
		this();
		System.out.println("super 3 parameter constructor");
	}

}
class Employee47 extends Person47{
	Employee47(){
		System.out.println("sub 0 parameter constructor");
	}
	Employee47(String name,String surname, int roolno){
		
		this("as","sa");
		System.out.println("sub 3 parameter constructor");
		
	}
	Employee47(String name,String surname){
		this();
		super("ro","pa",9);
				
		System.out.println("sub 2 parameter constructor");
	}
}



class que47{
	public static void main(String args[]){
		Employee47 e=new Employee47("rohit","patil",91);
	}
}