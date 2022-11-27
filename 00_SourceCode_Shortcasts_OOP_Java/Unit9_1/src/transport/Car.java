package transport;


import interfaces.Move;
import interfaces.Vehicle;

public class Car implements Vehicle,Move{

	/*This class must provide an implementation
	 * for the method honk(),
	 * because the interface only says:
	 * what should be done,
	 * but does not say how to do it*/

	@Override
	public void honk() {
		/*In the method here
		 * the class Car is defining 
		 * how to do the honk*/
		System.out.println("I am a Car, and I honk honk honk");
	}//honk

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("I am a Car, and I am moving forward");
	}

	
	//System.out.println("I am a Car, and I am moving forward");
}//class
