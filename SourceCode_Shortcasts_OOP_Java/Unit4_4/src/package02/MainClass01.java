package package02;

public class MainClass01 {

	public static void main(String[] args) {
		/*Control structures
		 * The while-loop
		 * This is a loop with precondition, (pre-checked loop)
		 * which means that the loop condition is tested first,
		 * and then if the loop condition is evaluated to be TRUE,
		 * the statements in the loop are executed.
		 * 
		 * After the statements in the loop are executed, 
		 * the condition is tested again.
		 * If it is evaluated to FALSE, 
		 * the statements are not executed anymore,
		 * and the loop ends
		 * */
		int counter1 = 1;//Element 1: initializing a loop control variable
		while(counter1 < 1){//Element 2: checking the stop-condition (also: running condition, exit condition)
			//Exchange the '<=' with '<' and watch the results
			
			
			//Let's see the value of the counter on every step of the execution 
			System.out.println("The counter1 is:" + counter1);
			
			//Now we can make some calculations
			int square = counter1 * counter1;
			System.out.println("The result of the calculation is square=" + square);
			counter1++;//Element 3: incrementing the control variable
		}
		
		
		System.out.println("#####################################################################");
		
		/*The do-while-loop
		 * This is a loop with postcondition, (post-checked loop)
		 * which means that the statements inside the loop 
		 * are executed at least once, 
		 * before the condition is checked.
		 * 
		 * If the condition is evaluated to TRUE,
		 * the statements are executed again.
		 * 
		 * If the condition is evaluated to FALSE, 
		 * the statements are not executed anymore 
		 * */
		int counter2 = 1;//Element 1: initializing a loop control variable
		do{
			//Let's see the value of the counter on every step of the execution 
			System.out.println("The counter2 is:" + counter2);
			
			//Now we can make some calculations
			int square = counter2 * counter2;
			System.out.println("The result of the calculation is square=" + square);
			counter2++;//Element 3: incrementing the control variable
		}while(counter2 < 1);//Element 2: checking the stop-condition (also: running condition, exit condition)
		//Exchange the '<=' with '<' and watch the results
		
	}//main

}//class
