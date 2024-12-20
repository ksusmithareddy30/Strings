package strings;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Hello good morning";
         System.out.println(reversestring(str));
	}
	     public static String reversestring(String str) {
	    	 String reversedStr="";
	    	 for(int i=str.length()-1;i>=0;i--) {
	    		 reversedStr+=str.charAt(i);
	    	 }
	    	 return reversedStr;
	}

}
