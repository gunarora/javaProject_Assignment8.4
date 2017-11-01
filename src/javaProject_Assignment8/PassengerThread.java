package javaProject_Assignment8; //Package declaration is mandatory

//// PassengerThread Class Declared					
public class PassengerThread extends Thread{
	//declare variable
	private int seatsNeeded;
	//parameterized constructor
	public PassengerThread(int seats, Runnable target, String name) {	
		super(target,name);												
		this.seatsNeeded = seats;}		
	// get input as required number of seat							
	public int getSeatsNeeded() {										
		return seatsNeeded;}
}
