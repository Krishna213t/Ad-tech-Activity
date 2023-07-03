package tasks;
import java.util.*;
import java.io.*;
public class ExpHnd1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	InputStreamReader r= new InputStreamReader(System.in);
        	BufferedReader b = new BufferedReader(r);
        	System.out.println("Enter total Number of Runs Scored: ");
        	int totalRuns=Integer.parseInt(b.readLine());
        	System.out.println("Enter total number of Overs Played");
        	int totalOvers=Integer.parseInt(b.readLine());
        	if(totalOvers!=0)
        	{
        		double result=(double)totalRuns/totalOvers;
        		System.out.println("Current Run Rate:"+String.format("%.2f",result));
        	}
        	else
        	{
        		int result=totalRuns/totalOvers;
        		System.out.println("Current Run Rate:"+result);
        	}
        	
        }
        catch(Exception e)
        {
        	System.out.print(e);
        }
	}

}
