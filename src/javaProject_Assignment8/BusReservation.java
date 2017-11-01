package javaProject_Assignment8;  //Package declaration is mandatory

// BusReservation Class Declared																							
public class BusReservation implements Runnable{
	 //private variable declared
	private int totalSeatsAvailable=12;			
	//method run() to execute Runnable - logic
	public void run() {																																
		PassengerThread pt = (PassengerThread) Thread.currentThread();		//new object pt created 																		
		boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());																
		if(ticketsBooked==true){                                                     //checking condition for booked ticket
			System.out.println("Pasenger name: "+Thread.currentThread().getName()+" : The Number of Seats Requested "+pt.getSeatsNeeded()+" are booked ");
		}else{
			System.out.println("Pasenger name: "+Thread.currentThread().getName()+" : The number of seats requested "+pt.getSeatsNeeded()+" are not available");}
	}																																				
	
	//using synchronization to book tickets 
   public  synchronized boolean bookTickets(int seats, String name){																				
	  System.out.println("\n             Welcome to Redbus Service \n"+"===========####################################================");			
			  System.out.println("Pasenger name: "+Thread.currentThread().getName()+" : Number of Tickets Available are : "+this.getTotalSeatsAvailable());			
		if (seats>this.getTotalSeatsAvailable()) {																									
			return false;
		} else {
			totalSeatsAvailable = totalSeatsAvailable-seats;
			return true;}
	}
//total seats available
	private int getTotalSeatsAvailable() {																											
		return totalSeatsAvailable;}
}
