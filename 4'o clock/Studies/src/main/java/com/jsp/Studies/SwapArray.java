package com.jsp.Studies;

import java.util.Arrays;

public class SwapArray {
 public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	System.out.println(Arrays.toString(arr));
	int[] a=swap(arr,3,4);
	System.out.println("*********************");
	System.out.println(Arrays.toString(a));
}

private static int[] swap(int[] arr, int i, int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	return arr;
	
}
}
