class Solution {
	public int search(int[] arr, int target) {
		int start=0;
		int end=peakElement(arr);
		int ans=binarySearch(arr,target,start,end);
		if(ans!=-1)
			return ans;
		else
			return binarySearch(arr,target,end+1,arr.length-1);
	}
	int peakElement(int[] arr){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else
				start=mid+1;
		}
		return start;
	}
	int binarySearch(int[] arr, int target, int start, int end){
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[mid]<target)
				start=mid+1;
			if(arr[mid]>target)
				end=mid-1;  
		}
		return -1;
	}
}
