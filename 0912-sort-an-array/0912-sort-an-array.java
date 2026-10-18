class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temp);
        return nums;
    }
    
    private void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        
        mergeSort(nums, left, mid, temp);
        mergeSort(nums, mid + 1, right, temp);
        merge(nums, left, mid, right, temp);
    }
    
    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;     
        int j = mid + 1;  
        int k = left;     
        
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (int p = left; p <= right; p++) {
            nums[p] = temp[p];
        }
    }
}