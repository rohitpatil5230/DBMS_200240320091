class Person41{
	private String name;
	private int rollno;  
	Person41(String name,int rollno){
		this();
		this.name=name;
		this.rollno=rollno;
		System.out.println("parameter const person");
	}
	Person41(){
		System.out.println("no parameter const person");
	}
	void show(){
		System.out.println("name "+name+" Roll No "+rollno);
	}
}
class Student41 extends Person41 {
	private int std;
	private char div;  
	Student41(String name,int rollno,int std,char div){
		super(name,rollno);
		this.std=std;
		this.div=div;
		System.out.println("parameter const student");
	}
	void show(){
		super.show();
		System.out.println("std "+std+" div "+div);
	}
}
//que39=ProductDemo
class que41{
	public static void main(String args[]){
		Student41 s=new Student41("Rohit",101,18,'a');
		s.show();
	}
}





