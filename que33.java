class Student{
	private int rno;
	private String name;
	void setData(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	void showData(){
		System.out.println("rno = "+rno+" name = "+name);
	}
}
//que33=StudentDemo
class que33{
	public static void main(String args[]){
		Student s=new Student();
		s.setData(91,"Rohit");
		s.showData();
	}
}





