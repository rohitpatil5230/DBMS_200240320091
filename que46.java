class Array{
    private int []a;
    Array(int []a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

class que46{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4};
 
          for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                new Array(a);
            }
               
          }
    }
}