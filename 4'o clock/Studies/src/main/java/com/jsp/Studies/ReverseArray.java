package com.jsp.Studies;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(arr));
	int[] rev=reverse(arr);
	System.out.println(Arrays.toString(rev));
}

 static int[] reverse(int[] arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		swap(arr,start,end);
		start++;
		end--;
	}
	return arr;
}
  static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
}
