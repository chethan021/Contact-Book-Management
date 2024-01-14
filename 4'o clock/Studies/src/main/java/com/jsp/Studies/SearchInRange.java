package com.jsp.Studies;

public class SearchInRange {
public static void main(String[] args) {
	int[]arr= {12,34,56,78,90,45,87,67,43,76};
	int index=search(arr,2,8,67);
	System.out.println("At Index: "+index);
}

 static int search(int[] arr, int start, int end, int num) {
	for (int i = start; i <= end; i++) {
		if(arr[i]==num)
			return i;
		
	}
	return -1;
}
}
