class Pair implements Comparable<Pair> {
    int ele;
    int diff;
    
    Pair(int ele, int diff) {
        this.ele = ele;
        this.diff = diff;
    }
    @Override
    public int compareTo(Pair p) {
        if (this.diff == p.diff) {
            return p.ele - this.ele;
        }
        return p.diff - this.diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for (int ele : arr) {
            int diff = Math.abs(x - ele);
            pq.add(new Pair(ele, diff));
            
            if (pq.size() > k) {
                pq.remove();
            }
        }
        while (pq.size() > 0) {
            Pair top = pq.remove();
            ans.add(top.ele);
           
        }
        Collections.sort(ans);
        return ans;

    }
}