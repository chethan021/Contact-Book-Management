package com.jsp.Studies;

import java.util.Arrays;

public class ArraysBasics {
	static int[] arr;
	/*
	 * Array: Array is a container which is used to store group of same type of data 
	 * Array is index baesd
	 * Array is of fixed length variable 
	 * we have a final variable called length in array class which defined length of array
	 * 
	 * Array Creation
	 * declaring array
	 *  int[] arr;
	 *  initializing array 
	 *  new int[5] 5 representing size of the container
	 */

	public static void main(String[] args) {
		
		//int[] arr = null;//since it is not global variable we need to initialize it
		System.out.println(arr);
		arr=new int[5];
		System.out.println("*********************");
		System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0] default initialization
		System.out.println("*********************");
		arr[0]=100; //reinitialization of array
		arr[4]=900;//shows mutable nature in array
		System.out.println(Arrays.toString(arr));//[100, 0, 0, 0, 900] 
		System.out.println("*********************");
		System.out.println(arr.length);//discrides lenght of an array //5
		System.out.println("*********************");
		//	System.out.println(arr[5]);//gives us exception ----------ArrayIndexOutOfBoundException
		//System.out.println("*********************");

		/*
		 * lets dis now how can we iterate array using for loop , for each loop, and inbuilt methods
		 */
		int[] nums= {1,2,3,4,5};//we can initialize and declare array like this
		System.out.println(Arrays.toString(nums));//[1,2,3,4,5]
		System.out.println("*********************");
		//using for loop
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+", ");//1,2,3,4,5,
		}
		System.out.println();
		System.out.println("*********************");
		//using for each 
		for(int num:nums) {
			System.out.print(num+", ");//1,2,3,4,5,
		}
		System.out.println("*********************");
		String arr1="Chethan";
		System.out.println(Arrays.toString(arr1.toCharArray()));//[C,h,e,t,h,a,n]
		/*
		 * Lets see multi dimensional array 
		 * we can declare and initialize array in this way
		 * int[][] arr=new int[6][]; it is not mandatory to mention size in second array 
		 * two dimensional array simply repersent row and column
		 * 
		 */
		System.out.println("*********************");
		int[][] arrs=new int[3][];
		System.out.println(Arrays.toString(arrs));//[null,null,null]
		int[][] arr3= {
				{1,2,3},
				{4,5},
				{7,8,9,0}
		};
		System.out.println("*********************");
		System.out.println(Arrays.toString(arr3));//[[I@cac736f, [I@5e265ba4, [I@156643d4]
		System.out.println("*********************");
		System.out.println(arr3[1][1]); //5
		
		/*
		 * for iterating two dimensional array
		 */
		System.out.println("*********************");
		for(int[] a: arr3) {
			System.out.print(Arrays.toString(a));//[1, 2, 3][4, 5][7, 8, 9, 0]
		}
		System.out.println();
		System.out.println("*********************");
	  for(int row=0;row<arr3.length;row++) {
		  for(int col=0;col<arr3[row].length;col++) {
			  System.out.print(arr3[row][col]+", ");
		  }
	  }
	}
}
