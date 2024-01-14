package com.jsp.Studies;

public class LinearSreach {
public static void main(String[] args) {
	int[]arr= {10,29,38,47,56,99};
	int index=search(arr,56);
	System.out.println("At Index: " +index);
}

private static int search(int[] arr, int num) {
	if(arr.length==0)
		return -1;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==num)
			return i;
	}
	return -1;
}
}
