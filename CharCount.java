package practice;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Welcome";
		
		for(int i=0;i<name.length();i++)
		{
			     char[] word = name.toCharArray();
			     for(char newChar:word)
			     {
			    	 System.out.println(newChar+"");
			    	 
			     }
		}

	}

}
