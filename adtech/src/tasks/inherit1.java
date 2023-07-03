package tasks;
import java.util.*;
public class inherit1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		System.out.println("1.FOUR WHEELER");
		System.out.println("2.TWO WHEELER");
		System.out.println("Enter Vehicle Type :");
		int vehicleType=s.nextInt();
		
		if(vehicleType==2) {
	     TwoWheeler t = new TwoWheeler();
	     System.out.println("Enter Vehicle Make : ");
	     String make=s.next();
	     System.out.println("Enter Fuel Capacity : ");
	     int fc=s.nextInt();
	     System.out.println("Enter Fuel Type : ");
	     System.out.println("1.Petrol");
	     System.out.println("2.Diesel");
	     String FT=s.next();
	     System.out.println("Enter CC : ");
	     int cc=s.nextInt();
	     System.out.println("Enter Vehicle Number : ");
	     String vn=s.next();
	     
	   
	     t.setMake(make);
	     t.setFuelCapacity(fc);
	     t.setFuelType(FT);
	     t.setCc(cc);
	     t.setVehicleNumber(vn);
	     System.out.println("Kick Start Availability : ");
	     boolean ks = s.nextBoolean();
	     t.setKickStartAvailable(ks);
	     t.displayMake();
         t.basciInformation();
         t.detailInfo();
		}
		else if(vehicleType==1)
		{
			FourWheeler f = new FourWheeler();
			System.out.println("Enter Vehicle Make : ");
			String make=s.next();
			System.out.println("Enter Fuel Capacity : ");
		     int fc=s.nextInt();
		     System.out.println("Enter Fuel Type : ");
		     System.out.println("1.Petrol");
		     System.out.println("2.Diesel");
		     String FT=s.next();
		     System.out.println("Enter CC : ");
		     int cc=s.nextInt();
		     System.out.println("Enter Vehicle Number : ");
		     String vn=s.next();
		     f.setMake(make);
		     f.setFuelCapacity(fc);
		     f.setFuelType(FT);
		     f.setCc(cc);
		     f.setVehicleNumber(vn);
		     System.out.println("is Audio System Available?");
		     String audio=s.next();
		     f.setAudioSystem(audio);
		     System.out.println("Enter Number of Doors : ");
		     int doors=s.nextInt();
		     f.setNoofDoors(doors);
		     f.displayMake();
	         f.basciInformation();
	         f.detailInfO();
					
		}
		else
		{
			System.out.println("Please Select either 1 or 2 we  have only Two types");
		}
	}

}
class Vehicle
{
	private String make;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	private String vehicleNumber;
	public Vehicle()
	{
		
	}
    public  Vehicle(String make,String fuelType,int fuelCapacity,int cc,String vn)
	{
		this.make=make;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
		this.vehicleNumber=vn;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public void displayMake()
	{
		System.out.println("**"+getMake()+"***");
	}
	public void basciInformation()
	{
		System.out.println("----Basic Information-----");
		System.out.println("Vehicle Number : "+getVehicleNumber());
		System.out.println("Fuel Capacity : "+getFuelCapacity());
		System.out.print("Fuel Type : ");
		if(getFuelType()=="1")
		{
			System.out.print("Petrol");
		}
		else
		{
			System.out.print("Diesel");
		}
		System.out.println();
		System.out.println("CC : "+getCc());
	}
	public void detailInfo()
	{
		
	}
}
class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;
	public TwoWheeler()
	{
		
	}
	public TwoWheeler(boolean kstart)
	{
		this.kickStartAvailable=kstart;
	}
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void detailInfo()
	{
		System.out.println("------DetailInfo-------");
		if(isKickStartAvailable())
		{
			System.out.println("Kick Start Available : "+"yes");
		}
		else
		{
			System.out.println("Kick start Available : "+"No");
		}
	}
}
class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int noofDoors;
	public FourWheeler()
	{
		
	}
	public FourWheeler(String audio,int doors)
	{
		this.audioSystem=audio;
		this.noofDoors=doors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNoofDoors() {
		return noofDoors;
	}
	public void setNoofDoors(int noofDoors) {
		this.noofDoors = noofDoors;
	}
	
	public void detailInfO()
	{
		System.out.println("-----DetailInfo-----");
		System.out.println("Audio System : "+getAudioSystem());
		System.out.print("No of Doors : "+getNoofDoors());
	}
}
