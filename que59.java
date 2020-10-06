class Voter extends Exception{
	private int voterId;
	private String name;
	private int age;
	
	Voter(int voterId,String name,int age) throws Exception{
		this.voterId=voterId;
		this.name=name;
		if(age>18) {
			this.age=age;
		}else {
			throw new Exception("invalid age for voter");
		}
	}
    void Display() {
    	System.out.println(" voterId = "+voterId+" : Name = "+name+" : Age = "+age);
    }
}

public class que59 {

	public static void main(String[] args) throws Exception {
		Voter v = new Voter(5269451,"rohit",24);
		v.Display();

	}

}