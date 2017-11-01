package javaProject_Assignment8;  //Package declaration is mandatory

/*Write a Program to reserve tickets in an online bus reservation system using
synchronization. Program must have option for single thread to book multiple seats.
For each seat, the program must take a passenger name. Program should print
number of seats booked at the end as report.*/

public class RedbusService {
	//Main started
	public static void main(String[] args){		
		// new object initialized 
		BusReservation busReservation = new BusReservation();		
		// passengerThread1 object initialized and parameters are passed
		PassengerThread passengerThread1 = new PassengerThread(6,busReservation,"Gunjan");
		// passengerThread2 object initialized and parameters are passed
		PassengerThread passengerThread2 = new PassengerThread(4, busReservation, "Mridul");	
		
		// passengerThread3 object initialized and parameters are passed
		PassengerThread passengerThread3 = new PassengerThread(5, busReservation, "Bharat");	
		// Call start() method to start executing the thread object.
		passengerThread1.start();																 
		passengerThread2.start();																// Call start() method to start executing the thread object.
		passengerThread3.start();																// Call start() method to start executing the thread object.
	}
}



																																					

