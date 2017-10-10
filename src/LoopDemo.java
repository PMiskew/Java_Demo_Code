
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
		/*
		 * Why do we declare i in for loop header?
		 * 
		 * 		Because it only exists for then loop then
		 */
		for (int i = 0; i < 5; i = i + 1) {
			
			//LOOP BLOCK
			System.out.println("i = "+i);
			
		}
		
		//Write a counted loop that will print out 0 (inclusive) to 100 (inclusive)
		//Write a counted loop that will print out 0 (inclusive) to 50 (inclusive) only even numbers 
		//Write a counted loop that will print out 50 (inc) to -50 (exc)
		
		System.out.println("*****************");
		for (int i = 50; i > -51; i = i - 1) {
			System.out.println(i);
		}

		System.out.println("*****************");
		
		//Write a counted loop that will find the sum of all numbers from 6(inc) to 17(inc)
		
		int sum = 0;
		
		for (int i = 6; i < 18; i = i + 1) {
		
			sum = sum + i;
			
		}
		
		
		
		
		
		//Counted loops are perfect for working with Strings or arrays. 
		// length arr = 7
		// index of arr = 0 - 6
		int[] arr = {12,14,67,2,-11,56};
		
		//The loop goes through each index of the array. 
		//IMPORTANT: YOU SHOULD NEVER NEVER NEVER NEVER WRITE THE ACTUAL LENGTH OF THE ARRAY IN
		//			 ALWAYS HAVE THE PROGRAM CALCULATE IT!
		for (int i = 0; i < arr.length; i = i + 1) {
			
			System.out.println(arr[i]);
			
			
		}
		System.out.println("***********************");
		
		//Write a loop that will print out all elements of arr in reverse
		for (int i = arr.length - 1; i >= 0; i = i - 1) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("************************");
		//Find the sum of all even elements in arr
		//Big Idea: A counted loop is perfect when you have to look at each element in ar array
		//Big Idea: A number % 2 == 0 when even
		//Big Idea: To keep track of something you need to decalre a variable
		
		int total = 0;
		
		for (int i = 0; i < arr.length; i = i + 1) {
			
			if (arr[i] % 2 == 0) {
				total = total + arr[i];
			}
		}

		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
