import java.util.Scanner;
class Circle{
	private int radius;
	private double area;
	void init(int radius){
		this.radius=radius;
	}
	void calculateArea(){
		area=2*3.14*radius;
		
	}
	void Display(){
		System.out.println("radius = "+radius+" area = "+area);
	}
}
//que34=CircleDemo
class que34{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		Circle c=new Circle();
		int a=sc.nextInt();
		c.init(a);
		c.calculateArea();
		c.Display();
	}
}





