interface Taxable49{
    double salesTax=0.07;
    double incomeTax=0.105;
   void calcTax();
}

class Employee49 implements Taxable49{
    private int empId;
    private String name;
    private double salary;
     
    Employee49(){

    }

    Employee49(int empId,String name,double salary){
          this.empId=empId;
          this.name=name;
          this.salary=salary;
    }
   public void calcTax(){
        double Tax=salary*incomeTax;
        System.out.println("Incometax is "+Tax);
   }
}

class Product49 implements Taxable49{
    private int pid;
    private int price;
    private int quantity;

    Product49(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public void calcTax(){
        double ProductTax=price*quantity*salesTax;
       System.out.println("product tax "+ProductTax);
    }
}

class que49{
    public static void main(String args[]) {
       Taxable49 s=new Employee49(11,"Rohit",40000);
        s.calcTax();
        

       Taxable49 t=new Product49(12,20000,2);
       t.calcTax();

    }
}