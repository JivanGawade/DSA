class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int top = -1; 
        
        for (int i = 0; i < arr.length; i++) {
            if (top >= 0 && arr[top] == arr[i]) {
                top--; 
            } else {
                top++;
                arr[top] = arr[i]; 
            }
        }
        return new String(arr, 0, top + 1);
    }
}