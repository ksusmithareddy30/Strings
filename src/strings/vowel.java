package strings;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count=0;
         String str="Hello good morning";
         for(int i=0;i<str.length();i++)
         {
        	 if(str.charAt(i)=='A'||str.charAt(i)=='E'|| str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        	 {
        		 count++;
        	 }
         }
         System.out.println("vowels:"+ count);
         }
	
	}
                               

