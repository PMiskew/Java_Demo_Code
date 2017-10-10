
public class LoopDemo {

	public static void main(String[] args) {

		/*
		 * What is a loop structure:
		 * 
		 * A loop structure is a structure that repeats a section of code. All
		 * programming languages have them in some form. 
		 * 
		 * There two classifications of loops you want to know:
		 * 
		 * COUNTED LOOP:
		 * 
		 *		A counted loop is typically used when you know in advance how
		 *		many times the loop should run. 
		 *
		 *
		 *		for (<count>; <check>; <change>) {
		 *			//LOOP CODE
		 *		}
		 *
		 * 
		 */
		
		/*
		 * 		1. Declare and initialize count
		 * 			i = 0 
		 * 		2. Check count i < 5 --> 0 < 5 True
		 * 		
		 * 		3. If true we enter the loop other wise we skip
		 * 
		 * 		4. (true) Run loop code
		 * 
		 * 		5. At bottom of loop apply change and check again. 
		 */
		for (int i = 0; i < 5; i = i + 1) {
			
			//LOOP BLOCK
			System.out.println("i = "+i);
			
		}
		
		//Write a counted loop that will print out 0 (inclusive) to 100 (inclusive)
		//Write a counted loop that will print out 0 (inclusive) to 50 (inclusive) only even numbers 
		//Write a counted loop that will print 50 (inc) to -50 (exc)
		for (int i = 50; i >= -50; i = i - 1) {
			
			System.out.println(i);
			
		}
		
		//Counted loops are perfect for working with Strings or arrays. 
		// length arr = 7
		// index of arr = 0 - 6
		int[] arr = {12,14,67,2,-11,56,99,900,22};
		
		
		//What if I wanted to print every element to the screen?
		//IMPORTANT: NEVER WRITE IN THE LENGTH MANUALLY.  ALWAYS CALCULATE IT
		for (int i = 0; i < arr.length; i = i + 1) {
			System.out.println(arr[i]);
		}
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i = i + 1) {
			
			if (arr[i] < 0) {
				count = count + 1;
			}
			
		}
		
		System.out.println("Count: "+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
