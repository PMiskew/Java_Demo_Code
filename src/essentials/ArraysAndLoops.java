package essentials;

import java.util.Arrays;

public class ArraysAndLoops {

	public static void main(String[] args) {
		
		//An array is a REFERENCE VARIABLE
		//An array is a STATIC DATA STRUCTURE
		//
		//		- Dynamic Data Struture: Is a structure for storing information
		//								 that changes size based on need. 
		//		Python: A list is a Dynamic Data Structure
		//		Java: ArrayList
		//
		//		- Static Data Structure: The size of teh structure is set before
		//								 using it.  You cannot change the size 
		//								 once it is constructed. 
		//
		
		int[] nums = new int[3]; //lenght 3 index 0 - 2 uses 32*3 = 96 bits
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		//IndexOutOfBoundsError is called a RUNTIME ERROR
		
		String[] words = {"Cat","Dog","fish"};
		
		//Q: Why does printing out words look funny?
		System.out.println(words);
		
		//A: Because arrays are reference variables when we print them
		//	 we get the memory reference of where the data lives. 
		//SHORTCUT:
		System.out.println(Arrays.toString(words));
		
		//We want to be able to loop through each element in an array
		
		//Bread and Butter Algorithm: LOOP FORWARD
		// For loop that will loop at each element
		for (int i = 0; i < nums.length; i = i + 1) {
			System.out.println(nums[i]);
		}
		
		/*
		 * 		i | i < nums.length (3)
		 * 		0 | 0 < 3 True Run the loop System.out.println(nums[0]);
		 *		1 | 1 < 3 True Run the loop System.out.println(nums[1]);
		 *      2 | 2 < 3 True Run the loop System.out.println(nums[2]);
		 * 		3 | 3 < 3 FALSE
		 */
		
		//Bread and Butter Algorithm: Loop Backwards
		for (int i = nums.length - 1; i >= 0; i = i - 1) {
			
			System.out.println(nums[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
