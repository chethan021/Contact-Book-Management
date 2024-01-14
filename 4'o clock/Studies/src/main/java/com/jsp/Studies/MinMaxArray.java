package com.jsp.Studies;

public class MinMaxArray {
public static void main(String[] args) {
	int[] arr= {89,46,8,34,89,67};
	int min=minArray(arr);
	System.out.println("Minimum: "+min);
	int max=maxArray(arr);
	System.out.println("Maximum: "+max);
}

private static int maxArray(int[] arr) {
	int max= Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
	}
	return max;
}

private static int minArray(int[] arr) {
	int min= Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min)
			min=arr[i];
	}
	return min;
}
}
