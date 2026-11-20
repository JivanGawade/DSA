class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] freq = new int[101];
        int count = 0;
        
        for (int num : nums) {
            if (num - k >= 1) {
                count += freq[num - k];
            }
            if (num + k <= 100) {
                count += freq[num + k];
            }
            freq[num]++;
        }
        return count;
    }
}