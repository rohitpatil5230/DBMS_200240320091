class que3{
	public static void main(String args[]){
		int x=5;
		int y = (x*x) + (3*x) - 7;
		System.out.println("y="+y);
		y=x++ + ++x ;  //5+7
		System.out.println("y="+y);
		int z = x++ - --y - --x  +  x++;//7-11-7+7(right to left)
		System.out.println("x="+x+" y="+y+" z="+z);
		boolean x1=true;
		boolean y1=false;
		boolean z1 = x1 && y1 || !x1 || y1;
		System.out.println("x1="+x1+" y1="+y1+" z1="+z1);
		
		
	}
}