package com.jsp.Studies;

public class BinarySearch {
	
public static void main(String[] args) {
  int target=188;
  int[] arr= {12,34,45,67,89,90};
  int search = binarySearch(arr, target);
  System.out.println("At index of: "+search);
  System.out.println("!@#$%^&*()_");

	
}
//return the index
static int binarySearch(int []arr,int target) {
	int start=0;
	int end=arr.length;
	while(start<=end) {
		int mid=(start+(end-start))/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(target<arr[mid]) {
			end=mid-1;
		}
		if(target>arr[mid]) {
			start=mid+1;
		}
			
	}
	return -1;
}
}
