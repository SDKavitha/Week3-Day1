package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] arr=text.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count=count+1;
				}
			}
			
			if(count>1)
			{
			text=text.replace(arr[i],"");	
			break;
			}
		}
		System.out.println("After removing duplicates:"+text);
		
		
	}

}
