package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="madam";
		String rev="";
		for(int i=value.length()-1;i>=0;i--)
		{
			rev=rev+value.charAt(i);
					
		}
		if(value.equals(rev))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
