public class que57 {

	public static void main(String[] args) {
       String str= "rohit patil"; 
       String ch[]=str.split(" ");
       for(int i=0;i<ch.length;i++) {
          String str1=(String)ch[i];
          for(int j=(str1.length()-1);j>=0;j--) {
        	  System.out.print(str1.charAt(j));
          }
          System.out.print(" ");
       }
	}
}
