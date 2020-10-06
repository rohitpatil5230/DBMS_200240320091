import java.util.*;
class Tile42{
	private double tileLength; 
	private double tileArea; 	
	Tile42(){
		this.tileLength=10;
		tileArea=tileLength*tileLength;
	}
	void totalTiles(double floorLength,double floorWidth){
		double floorArea=floorLength*floorWidth;
		int tiles=(int)(floorArea/tileArea);
		System.out.println("number of tiles needed to cover the floor completely "+tiles);
	}
}
//que42=Floor

class que42{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter floor length");
		double floorLength=sc.nextDouble();
		System.out.println("Enter floor length");
		double floorWidth=sc.nextDouble();
		Tile42 s=new Tile42();
		s.totalTiles(floorLength,floorWidth);
	}
}





