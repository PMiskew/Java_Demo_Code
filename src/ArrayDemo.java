

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
		/*
		 * An ARRAY is a DATA STRUCTURE. There are lots of different types of data structures out there. We are interested in arrays since they 
		 * are useful and easy to implement.  Often people who use python will use lists, which are very, similar but do have some fundamental 
		 * differences which are good to be aware of.  
		 * 
		 * An ARRAY is a STATIC DATA STRUCTURE.
		 * A LIST is a DYNAMIC DATA STRCUTURE.
		 * 
		 * An ARRAY is a REFERENCE variable.  
		 * 
		 * DEFININTIONS:
		 * 
		 *  - REFERENCE VARIABLE:	A reference variable is one which stores the location of the information in the variable location.  Objects are 
		 *  						  	reference variables.  What you have to watch with reference variables is that if you pass a reference variable 
		 *  							to a method and make any changes, those changes will remain once the function is done regardless if you return 
		 *  							the variable.  Primitive variables, such as integers, doubles and booleans do not act like this.  When a copy of a 
		 *  							primitive variable is passed to a method any changes made to the parameter do not impact the value passed in. 
		 *   
		 *
		 * 	- STATIC DATA STRUCUTRE:	A STATIC DATA STRUCTURE has a fixed size that must be established before using it. An ARRAY is a STATIC DATA STRUCTURE.
		 * 
		 *  - DYNAMIC DATA STRUCTURE:	A DYNAMIC DATA STRUCTURE is a data structure can have a variable size.  As new elements are added the structures 
		 *  								length grows to satisfy. A LIST is a DYNAMIC DATA STRUCTURE.  
		 *  
		 */
		
		 /*
		  * **************************************************CREATING AN ARRAY*************************************************************
		  */
			
		int[] nums;	//creates an array of integer reference called nums.  The size has not yet been set. 
		nums = new int[3];	//Creates three integer ELEMENTS in the array nums.  We say nums has 3 elements (length = 3) and indexes 0-2
		
		//We often combine the two above lines. 
		int[] ages = new int[20];	//creates an array of integers called ages with 20 elements (length = 20) that have indexes 0-19
		
		String[] names = new String[20]; //creates an array of Strings called names with 20 elements (length = 20) that hav indexes 0-19
		
		/*
		 ***************************************************ACCESSING ARRAYS*************************************************************
		 * 
		 * When an array is created something has to be put into the "spaces".  Java defaults values as follows numeric types default to 0,
		 * booleans default to false, Strings and reference types defaul to null. 
		 * 
		 * So our array nums, which has three elements can be pictures as follows
		 * 			0	1	2 (Indexes)
		 * nums ->  0	0	0 (VALUES)
		 *
		 * When we want to modify one or more values in an array we need the name of the array and an index.  This tells us where to store the 
		 * information
		 * 
		 */
		
		nums[0] = 99; //sets the first element of nums to 0
		
		
		 // 			0	1	2 (Indexes)
		 // nums -> 99	0	0 (VALUES)
		
		nums[1] = 22;
		
		 // 			0	1	2 (Indexes)
		 // nums -> 99	22	0 (VALUES)
		
		
		nums [2] = 66;
		
		 // 			0	1	2 (Indexes)
		 // nums -> 99	22	66 (VALUES)
		
		/*
		 * INDEX OUT OF BOUNDS EXCEPTION:  The most common type of error you will encounter is a RUN TIME ERROR called an INDEX OUT OF BOUNDS EXCEPTION.
		 * This occurs when you try to access an index that does not exist. 
		 * 
		 * nums[3] = 100; 	//This is an INDEX OUT OF BOUND EXCEPTION
		 * nums[-1] = 100; 	//This is an INDEX OUT OF BOUND EXCEPTION
		 * 
		 * It is called a RUN TIME ERROR since the computer will catch this until your program is running in which case it will crash.  If your computer 
		 * randomly stops and an error message comes up (like the classic blue screen in windows) this is a RUN TIME ERROR
		 * 
		 */
		
		//We can access elements of an array just like any vairable.
		
		int sum = nums[0] + nums[1] + nums[2]; //creates a new variable called sum and puts the sum of the elements of nums in it.  The array nums doesn't change
		
		nums[0] = nums[0] + nums[1] + nums[2]; //Finds the sum of nums and stores the result in the first element, which has an index of 0
		
		 // 			0	1	2 (Indexes)
		 // nums -> 187	22	66 (VALUES)
		
		 /*
		  * ***************************************************PRINTING AN ARRAYS*************************************************************
		  */
			
		
		//An array is a collection of variables.  It is a reference variable.  A REFERENCE VARIABLE is a variable that stores the location of the 
		//information, not the information itself.  This means if you try to print it out it simply prints out the memory reference, which is a
		//represented as a hexadecimal value
		
		System.out.println(nums); //This will print out something
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
