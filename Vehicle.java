package week3.day1;

public class Vehicle {

	public void driveVehicle() {
System.out.println(" driverVehicle");
	}
	public void accelerate() {
System.out.println(" accelerate the car");
	}
	public void applyBreak() {
System.out.println("applyBreak a car");
	}
	public void fillFual() {
System.out.println("fillFual is car ");
	}
	public void shiftGear() {
		System.out.println("manual");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.driveVehicle();
		b.accelerate();
		b.applyBreak();
		b.applyBreak();
		b.fillFual();	
		b.shiftGear();
		b.enableAirbag();
		System.out.println("wheel car"  +b.car);
	}
		

	


}
