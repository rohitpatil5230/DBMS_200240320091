import java.util.*;
import java.lang.Math; 
class Studen40{
	protected String name;
	protected int rollno;
	protected int age;
	protected double score;  
	Studen40(String name,int rollno,int age,double score){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.score=score;
	}
	

}
//que39=ProductDemo
class que40{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Studen40 arr[]=new Studen40[2];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter rollno");
			int rollno=sc.nextInt();
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println("Enter score");
			double score=sc.nextDouble();
			Studen40 p=new Studen40(name,rollno,age,score);
			arr[i]=p;
		}
		for(Studen40 i:arr){
			System.out.println("Score below 50");
			if(50<=i.score){
				System.out.println("name "+i.name+" Roll No "+i.rollno+" Age "+i.age+" Score "+i.score);
			}
		}
		for(Studen40 i:arr){
			System.out.println("Score between 51 to 65");
			if(50<i.score&&65>=i.score){
				System.out.println("name "+i.name+" Roll No "+i.rollno+" Age "+i.age+" Score "+i.score);
			}
		}
		for(Studen40 i:arr){
			System.out.println("Score between 66 to 80");
			if(65<i.score && 80>=i.score){
				System.out.println("name "+i.name+" Roll No "+i.rollno+" Age "+i.age+" Score "+i.score);
			}
		}
		for(Studen40 i:arr){
			System.out.println("Score between 81 to 100");
			if(80<i.score && 100>=i.score){
				System.out.println("name "+i.name+" Roll No "+i.rollno+" Age "+i.age+" Score "+i.score);
			}
		}
	}
}





