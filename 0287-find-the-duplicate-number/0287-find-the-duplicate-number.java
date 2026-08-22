class Solution {
    public int findDuplicate(int[] arr) {
    	int n=arr.length +1;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==i+1 || arr[i]==n)i++;
			else {
				int idx=arr[i]-1;
				int temp =arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				if(arr[i]==arr[idx])return arr[i];
			}
		}	return -1;
	}
}