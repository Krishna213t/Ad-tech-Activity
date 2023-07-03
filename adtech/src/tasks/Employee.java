package tasks;
import java.util.*;
public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EmployeeData e = new EmployeeData();
      Scanner s= new Scanner(System.in);
      System.out.println("Enter Name:");
      String name=s.next();
      System.out.println("Enter Adress:");
      String adress=s.next();
      System.out.println("Enter Mobile Number:");
      String phoneNumber=s.next();
      e.setName(name);
      e.setAdress(adress);
      e.setPhoneNumber(phoneNumber);
      System.out.println("Employee Details");
      System.out.println("Name: "+e.getName());
      System.out.println("Adress: "+e.getAdress());
      System.out.println("Mobile: "+e.getPhoneNumber());
      
	}

}
class EmployeeData
{
	private String name;
	private String adress;
	private String mobile;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getPhoneNumber() {
		return mobile;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.mobile = phoneNumber;
	}
}
