import java.util.*;
import java.lang.Math; 
class Person37{
	private int age=18;
	private String name;
	Person37(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person37(String name){
		this.name=name;
	}
	void Display(){
		System.out.println("Nmae="+name+" Age="+age);
	}
}
//que37=PersonDemo
class que37{
	public static void main(String args[]){
		Person37 p=new Person37("Tushar");
		p.Display();
		Person37 p1=new Person37("Rohit",23);
		p1.Display();
	}
}





