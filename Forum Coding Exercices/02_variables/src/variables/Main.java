package variables;

public class Main {
	public static void main(String[] args) {
		// Variables:
		// x, y, z
		
		// Position 1
		// not initialized, not initialized, not initialized
		System.out.println("Position 1");
	    short x, y;
	    
	    // Position 2
	    // 1234, not initialized, not initialized
	    System.out.println("\nPosition 2");
	    x = 1234;
	    System.out.println(x);
	    
	    // Position 3
	    // 1234, 99, not initialized
	    System.out.println("\nPosition 3");
	    y = 99;
	    System.out.println(x + " " + y);
	    
	    // Position 4
	    // 1234, 99, 1234
	    System.out.println("\nPosition 4");
	    short z = x;
	    System.out.println(x + " " + y + " " + z);
	    
	    // Position 5
	    // 1234, 1234, 1234
	    System.out.println("\nPosition 5");
	    y = x;
	    System.out.println(x + " " + y + " " + z);
	}
}
