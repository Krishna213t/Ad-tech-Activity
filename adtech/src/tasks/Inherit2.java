package tasks;
import java.util.*;
public class Inherit2 {
	public static void main(String args[])
    {
     Scanner s = new Scanner(System.in);
     System.out.println("Hotel Tariff Calculator");
     System.out.println("1.Deluxe Room");
     System.out.println("2.Deluxe AC Room");
     System.out.println("3.Suite AC Room");
     System.out.println("Select Room Type:");
     int roomType=s.nextInt();
     if(roomType==1)
     {
   	  DeluxeRoom d = new DeluxeRoom(10);
   	  System.out.println("Hotel Name:");
   	  String hn=s.next();
   	  System.out.println("Room Square Feet Area:");
   	  int sqrft=s.nextInt();
   	  System.out.println("Room has Tv?");
   	  boolean tv=s.nextBoolean();
   	  System.out.println("Room has Wifi");
   	  boolean wifi=s.nextBoolean();
   	  d.setHotelName(hn);
   	  d.setNumberOfSqrft(sqrft);
   	  d.setHasTv(tv);
   	  d.setHasWifi(wifi);
   	  System.out.println("Room Tariff Per day is:"+d.claculateTriff());
     }
     else if(roomType==2)
     {
   	  DeluxAcRoom d= new DeluxAcRoom(12);
   	  System.out.println("Hotel Name:");
   	  String hn=s.next();
   	  System.out.println("Room Square Feet Area:");
   	  int sqrft=s.nextInt();
   	  System.out.println("Room has Tv?");
   	  boolean tv=s.nextBoolean();
   	  System.out.println("Room has Wifi");
   	  boolean wifi=s.nextBoolean();
   	  d.setHotelName(hn);
   	  d.setNumberOfSqrft(sqrft);
   	  d.setHasTv(tv);
   	  d.setHasWifi(wifi);
   	  System.out.println("Room Tariff Per day is:"+d.claculateTriff());
     }
     else if(roomType==3)
     {
   	  SuiteAcRoom d= new SuiteAcRoom(15);
   	  System.out.println("Hotel Name:");
   	  String hn=s.next();
   	  System.out.println("Room Square Feet Area:");
   	  int sqrft=s.nextInt();
   	  System.out.println("Room has Tv?");
   	  boolean tv=s.nextBoolean();
   	  System.out.println("Room has Wifi");
   	  boolean wifi=s.nextBoolean();
   	  d.setHotelName(hn);
   	  d.setNumberOfSqrft(sqrft);
   	  d.setHasTv(tv);
   	  d.setHasWifi(wifi);
   	  System.out.println("Room Tariff Per day is:"+d.claculateTriff());
     }
    }
}
class HotelRoom
{
	private String  hotelName;
	private int numberOfSqrft;
	private boolean hasTv;
	private boolean hasWifi;
	public HotelRoom()
	{
		
	}
	public HotelRoom(String hn,int sqrft,boolean tv,boolean wifi)
	{
		this.hotelName=hn;
		this.numberOfSqrft=sqrft;
		this.hasTv=tv;
		this.hasWifi=wifi;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqrft() {
		return numberOfSqrft;
	}
	public void setNumberOfSqrft(int numberOfSqrft) {
		this.numberOfSqrft = numberOfSqrft;
	}
	public boolean isHasTv() {
		return hasTv;
	}
	public void setHasTv(boolean hasTv) {
		this.hasTv = hasTv;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public int getRatePerSqFeet()
	{
		return 0;
	}
	public int claculateTriff()
	{
		return getNumberOfSqrft()*getRatePerSqFeet();
	}
}
class DeluxeRoom extends HotelRoom
{
	private int ratePerSqfeet;
	
	DeluxeRoom()
	{
		
	}
	DeluxeRoom(int rate)
	{
		setRatePerSqfeet(rate);
	}
	
	public int getRatePerSqfeet() {
		return ratePerSqfeet;
	}

	public void setRatePerSqfeet(int ratePerSqfeet) {
		this.ratePerSqfeet = ratePerSqfeet;
	}

	public int getRatePerSqFeet()
	{
		if(isHasWifi())
		{
			return getRatePerSqfeet()+2;
		}
		else
			return getRatePerSqfeet();
	}
	
}
class DeluxAcRoom extends DeluxeRoom{
	
	DeluxAcRoom(int rate)
	{
		
		setRatePerSqfeet(rate);
	}
}
class SuiteAcRoom extends HotelRoom
{
	private int ratePerSqfeet;
	SuiteAcRoom(int rate)
	{
		setRatePerSqfeet(rate);
	}
	
	public int getRatePerSqfeet() {
		return ratePerSqfeet;
	}

	public void setRatePerSqfeet(int ratePerSqfeet) {
		this.ratePerSqfeet = ratePerSqfeet;
	}

	public int getRatePerSqFeet()
	{
		if(isHasWifi())
		{
			return getRatePerSqfeet()*2;
		}
		else
			return getRatePerSqfeet();
	}
}
