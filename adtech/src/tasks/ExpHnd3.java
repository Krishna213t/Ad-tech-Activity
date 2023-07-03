package tasks;
import java.util.*;
public class ExpHnd3 {
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Player Name:");
     String name = s.next();
     System.out.println("Enter Age:");
     int age =s.nextInt();
    
     if(age>19)
     {
    	 System.out.println("Playe Name:"+name);
    	 System.out.println("Age:"+age);
     }else
     {
    	 throw new InvalidAgeException();
     }
	}

}
class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		System.out.println("Custom Exception:"+"InvalidAgeException");
	}
}

