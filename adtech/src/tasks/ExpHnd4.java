package tasks;
import java.util.*;
public class ExpHnd4 {
	public static void main(String[] args)throws TeamNotFoundException {
		// TODO Auto-generated method stub
       String arr[]= {"CSK","MI","KKr","RCB","DC","RR","PBKS","SRH"};
       List<String> li=Arrays.asList(arr);
       
       Scanner s = new Scanner(System.in);
       System.out.println("Enter Expexcted Winners :");
       String expected=s.next();
       System.out.println("Enter Expected Runner up : ");
       String expectedRunnerup=s.next();
        if(!li.contains(expected) && !li.contains(expectedRunnerup))
    	   {
    		  
    		   throw new TeamNotFoundException();
    	   }
    	   else
    	   {
    		   System.out.println("Expected Winners :"+expected);
    		   System.out.println("Expected Runner ups :"+expectedRunnerup);
    	   }
       
	}

}
class TeamNotFoundException extends Exception{
	TeamNotFoundException()
	{
		System.out.println("TeamNotFoundException");
	}

}
