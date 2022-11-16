package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		System.out.println("Given string is :"+test);
		char[] ch = test.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i%2!=0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println("Change to uppercase:");
        System.out.println(ch);
	}

	

}
