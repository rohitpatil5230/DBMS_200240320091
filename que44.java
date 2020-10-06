class Faculty44{
	private int facltyId;
	private double salary;
	void input(int facltyId){
		this.facltyId=facltyId;
	}
	protected double getsalary(){
		return salary;
	}
	protected void setsalary(double salary){
			this.salary=salary;
	}
	void printSalary(){
		System.out.println("FacltyId= "+facltyId+" Salary="+salary);
	}
}
class FullTimeFaculty44 extends Faculty44{
	private double basicSalary;
	private double allowance;
	FullTimeFaculty44(){
		super();
		basicSalary=0;
		allowance=0;
	}
	void input(int facltyId,double basicSalary,double allowance){
		input(facltyId);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		setsalary(basicSalary+allowance);
	}
}
class partTimeFaculty44 extends Faculty44{
	private double workingHours;
	private double ratePerHours;
	
	partTimeFaculty44(){
		super();
		workingHours=0;
		ratePerHours=0;
	}
	void input(int facltyId,double workingHours,double ratePerHours){
		input(facltyId);
		this.workingHours=workingHours;
		this.ratePerHours=ratePerHours;
		setsalary(workingHours*ratePerHours);
	}
}

class que44{
	public static void main(String args[]){
		FullTimeFaculty44 f=new FullTimeFaculty44();
		partTimeFaculty44 p=new partTimeFaculty44();
		f.input(100,5000,20000);
		p.input(200,8,500);
		f.printSalary();
		p.printSalary();
	}
}