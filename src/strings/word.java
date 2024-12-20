package strings;

public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        String words="Hello good morning";
        for(int i=0;i<words.length();i++)
        {
        	if(words.charAt(1)==' ')
        	{
        		count++;
        	}
        }
        System.out.println("Hello good morning");
	}

}
