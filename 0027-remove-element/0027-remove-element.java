class Solution {
    public int removeElement(int[] nums, int val) {
        int validIndex = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[validIndex] = nums[i];
                validIndex++;
            }
        }
        return validIndex;
    }
}