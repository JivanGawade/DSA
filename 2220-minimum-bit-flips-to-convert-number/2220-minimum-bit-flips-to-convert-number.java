class Solution {
    public int minBitFlips(int start, int goal) {
        int diff = start ^ goal;
        int flips = 0;
        while (diff != 0) {
            diff = diff & (diff - 1);
            flips++;
        }
        return flips;
    }
}