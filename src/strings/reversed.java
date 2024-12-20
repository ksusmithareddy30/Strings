package strings;

public class reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Hello good morning";
         String[] words=str.split(" ");
         for(String word:words) {
        	 System.out.print(new StringBuilder(word).reverse().toString()+" ");
        	 
         }
	}

}
