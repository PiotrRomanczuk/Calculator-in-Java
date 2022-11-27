package main;

import interfaces.Vehicle;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class MainClass01 {

	public static void main(String[] args) {
		/*Use case- vehicle park
		 * In the beginning my vehicle park 
		 * contains only two vehicles
		 * */
		//Vehicle vehicle01 = new Car();
		Car vehicle01 = new Car();
		Vehicle vehicle02 = new Bus();
		Vehicle vehicle03 = new Truck();//let's add another Vehicle
		
		System.out.println("Testing the honk of each Vehicle");
		vehicle01.honk();
		vehicle02.honk();
		vehicle03.honk();
		
		
		vehicle01.moveForward();
	}//main

}//class
