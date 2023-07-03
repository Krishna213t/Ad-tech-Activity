package tasks;
import java.util.*;
public class ExpHnd2 {
	public static void main(String args[])
	{
		try {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number Of Overs :");
		int overs=s.nextInt();
		int arr[]= new int[overs];
		System.out.println("Enter number of runs scored for each over : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Enter Over Number");
		int selectedOver=s.nextInt();
		System.out.println("Rubs Scored in this Over:"+arr[selectedOver-1]);
		
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
}
