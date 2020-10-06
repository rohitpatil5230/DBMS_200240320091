import java.util.*;
class Student45{
	private int rollNo;
	private double percentage;
	Student45(){
		rollNo=1;
		percentage=0;
	}
	Student45(int rollNo,double percentage){
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
	protected double getrollNo(){
		return rollNo;
	}
	double getPercentage() {
        return percentage;
    }
	void show(){
		System.out.println("rollno= "+rollNo+" percentage="+percentage);
	}
}
class CollegeStudent45 extends Student45{
	private int semester;
	private double allowance;
	CollegeStudent45(){
		semester=0;
	}
	CollegeStudent45(int rollNo,double percentage, int semester){
		super(rollNo,percentage);
		this.semester=semester;
	}
	void show(){
		super.show();
		System.out.println("semester= "+semester);
	}
}

class SchoolStudent45 extends Student45{
	private int classname;
	SchoolStudent45(){
		classname=0;
	}
	SchoolStudent45(int rollNo,double percentage, int classname){
		super(rollNo,percentage);
		this.classname=classname;
	}
	void show(){
		super.show();
		System.out.println("classname= "+classname);
	}
}


class que45{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student45 Arr[]={
			new CollegeStudent45(10,60,1),
			new CollegeStudent45(12,80,2),
			new SchoolStudent45(15,90,10),
			new SchoolStudent45(16,90,8),
			new SchoolStudent45(18,75,7),
		};
		for(Student45 s:Arr){
			s.show();
		}
		
		System.out.println("enter roll no ");
		 int count = 0;
		 for (Student45  s1 : Arr) {
            if (s1.getPercentage() >= 75) {
                System.out.print("Grade = A  ");
                s1.show();
                count++;
            }
        }
		 System.out.println("No of students with A grade: " + count);
		 System.out.println("enter roll no: ");
		 int rolll=sc.nextInt();
		 for(Student45 s:Arr){
			 if(rolll==s.getrollNo()){
					
					if(s instanceof SchoolStudent45 ){
						System.out.println(rolll+" is School Student");
					}
					else{
						System.out.println(rolll+" is college Student");
					}
			 }
			 
		 }
	}
}
