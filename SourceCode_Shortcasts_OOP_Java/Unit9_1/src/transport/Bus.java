package transport;

import interfaces.Vehicle;

public class Bus implements Vehicle {
	/*This class must provide an imeplementation
	 * for the method honk(),
	 * because the interface only says:
	 * what should be done,
	 * but does not say how to do it*/

	@Override
	public void honk() {
		/*In the method here
		 * the class Bus is defining 
		 * how to do the honk*/
		System.out.println("I am a Bus, and I HONK HONK HONK");	
	}//honk

}//class
