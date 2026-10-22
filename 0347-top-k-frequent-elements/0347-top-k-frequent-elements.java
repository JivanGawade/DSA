class Pair implements Comparable<Pair> {
    int ele;
    int freq;
    
    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
    @Override
    public int compareTo(Pair p) {
        if (this.freq == p.freq) {
            return this.ele - p.ele; 
        }
        return this.freq - p.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
            
            if (pq.size() > k) {
                pq.remove();
            }
        }
        
        int[] ans = new int[k];
        int i = 0;
        while (pq.size() > 0) {
            Pair top = pq.remove();
            ans[i] = top.ele;
            i++;
        }
        
        return ans;
    }
}