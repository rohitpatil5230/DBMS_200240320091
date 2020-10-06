public class que55 {

	public static void main(String[] args) {
       String str= "Rohit Patil"; 
       int len=str.length();
       int count=0;
       for(int j=0;j<len;j++) {
    	   if(str.charAt(j)!=' ' ) {
    		     count++;
    	   }
       }
       System.out.println(" words is "+count);
	}

}