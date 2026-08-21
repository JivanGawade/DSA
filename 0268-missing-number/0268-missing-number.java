class Solution {
    public int missingNumber(int[] arr) {
    int n=arr.length;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==i || arr[i]==n)i++;
			else {
				int idx=arr[i];
				swap(arr,idx,i);
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=j) return j;
		}
		return n;
	}

	private static void swap(int[] arr, int idx, int i) {
		int temp =arr[i];
		arr[i]=arr[idx];
		arr[idx]=temp;
		
	}
}