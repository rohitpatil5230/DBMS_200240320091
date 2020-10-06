import java.util.*;
abstract class Processor48{
	int data;
	abstract void process();
	void showData(){
		System.out.println("Data=>"+data);	
	}
}
class Factorial48 extends Processor48{
	void Process(){
		int num=5;
		data=1;
		for(int i=1;i<=num;i++){
			data*=i;
		}
	}
}
class Circle48 extends Processor48{
	void Process(){
		int rad=2;
		data=(int)(3.14*rad*rad);
	}
}
class que48{
	public static void main(String ards[]){
		Processor48 f=new Factorial48();
		Processor48 c=new Circle48();
		f.Process();
		f.showData();
		c.Process();
		c.showData();
	}
		
}