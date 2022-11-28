package package03;

public class MainClass01 {

	public static void main(String[] args) {
		/*Control structures
		 * The for-loop
		 * In the for-loop all three elements are part of the loop's head:
		 * Element 1: initializing a loop control variable
		 * Element 2: checking the stop condition
		 * Element 3: incrementing the control variable
		 * 
		 * The for loop is a loop with precondition (pre-checked loop)
		 * The stop condition is evaluated before the initial execution of the loop
		 * 
		 * The for-loop is executed as follows:
		 * 1.Initialization of the control variable
		 * 2.Test the stop condition
		 * 		-If the condition is TRUE ==> execute all statements in the loop
		 *  	-If the condition is FALSE ==> abort, and do not execute any statements
		 * 3.If the statements were executed (condition was TRUE),
		 * increment the control variable
		 * 4.Go to step 2*/
//		for(int counter1 = 1; counter1 <= 10; counter1++){
//			//Let's see the value of the counter on every step of the execution 
//			System.out.println("The counter1 is:" + counter1);
//			
//			//Now we can make some calculations
//			int square = counter1 * counter1;
//			System.out.println("The result of the calculation is square=" + square);
//		}
		
		System.out.println("#####################################################################");
		
		/*Nested control structures
		 * Control structures can themselves contain control structures in their statement block
		 * Therefore, loops can also be nested with each other */
		for(int outerCounter = 1; outerCounter <= 4; outerCounter ++){
			
			//here we can use another control structure,
			//for example another for-loop 
			for(int innerCounter = 1; innerCounter <= 3; innerCounter ++){
				
				//All variables declared in the outer for-loop 
				//are visible and accessible in the inner for-loop 
				//Let's calculate if the outerNumber is even number
				int remainder = outerCounter % 2;
				
				//here we can use another control structure,
				//for example an if-conditional branch
				if(remainder == 0){
					System.out.println("outerCounter is even number:" + outerCounter);
					System.out.println("innerCounter=" + innerCounter);
				}else{
					System.out.println("outerCounter is odd number:" + outerCounter);
				}
				
			}//inner for-loop
			
			System.out.println();
			System.out.println("One iteration of the outer for-loop was executed");
			System.out.println();
		}//outer for-loop
		
	}//main
	
}//class
