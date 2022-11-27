package interfaces;

/*An interface is a reference data type.
 *
 *It is a collection of methods, 
 *without implementation
 *
 *Every class which implements the interface, 
 *must provide an implementation 
 *for the methods of the interface
 *
 *Interface is another instrument
 *for implementing polymorphism*/

public interface Vehicle {
	public void honk();
	
	/*Using interface for programming
	 * helps us to separate 
	 * the specification
	 * and the implementation
	 * 
	 * In other words,
	 * in the interface we only say:
	 * what should be done
	 * in the class which implements it
	 * we say:
	 * how to do it*/
}//interface
