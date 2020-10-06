import java.util.Scanner;
class OneBHK43{
	private double roomArea;
	private double hallArea;
	private double price;
	private static double totalprice=0;
	OneBHK43(){
		roomArea=100;
		hallArea=150;
		price=500000;
		
	}
	OneBHK43(double roomArea,double hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
		this.totalprice=totalprice+price;
	}
	void show(){
		totalprice=totalprice+price;
		System.out.println("roomArea "+roomArea+" hallArea "+hallArea+" price "+price+" totalprice "+totalprice);
	}
}
class TwoBHK43 extends OneBHK43{
	private double room2Area;
	TwoBHK43(){
		this.room2Area=110;
	}
	TwoBHK43(double roomArea,double hallArea,double price,double room2Area){
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}
	void show(){
		super.show();
		System.out.println("room2Area "+room2Area);
	}
}
//que43=Demo
class que43{
	public static void main(String args[]){
		TwoBHK43 arr[]=new TwoBHK43[3];
		for(int i=0;i<arr.length;i++){
			TwoBHK43 t=new TwoBHK43();
			arr[i]=t;
			t.show();
		}
		//TwoBHK43 t=new TwoBHK43();
		//TwoBHK43 t1=new TwoBHK43(100,150,50000,110);
		//t.show();
	}
}