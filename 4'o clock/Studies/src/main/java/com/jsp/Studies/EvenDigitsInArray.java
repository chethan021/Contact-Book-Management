package com.jsp.Studies;

public class EvenDigitsInArray {
	public static void main(String[] args) {
		int[] arr= {12,345,5678,90,56,787,123};
		int count=evenDigitsInArray(arr);
		System.out.println("Count of even digit in Array: "+ count);


	}

	private static int evenDigitsInArray(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(count(arr[i]))
				count++;
		}
		return count;
	}
	static boolean count(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		
		if(count%2==0)
			return true;

		return false;
	}
}
