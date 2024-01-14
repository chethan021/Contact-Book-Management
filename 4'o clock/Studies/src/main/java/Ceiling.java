// Ceilind of a number using binary search
public class Ceiling {
public static void main(String[] args) {
	int[] arr= {2,3,4,5,9,13,15,45,46};
	int target=8;
	int ans=ceilingNumber(arr,target);
	System.out.println(ans);
}

private static int ceilingNumber(int[] arr, int target) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=(end-(start-end))/2;
		if(arr[mid]==target)
			return arr[mid];
		if(arr[mid]<=target)
			start=mid+1;
		if(arr[mid]>=target)
			end=mid-1;
			
	}
	return arr[start];
}
}
