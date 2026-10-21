class Triplet implements Comparable<Triplet>{
    int dist;
    int x;
    int y;
    
    Triplet(int dist, int x, int y){
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Triplet t){
        return t.dist - this.dist; 
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        
        for (int[] point : points) {
            int x = point[0], y = point[1];
            int dist = x * x + y * y;
            pq.add(new Triplet(dist, x, y));
            if (pq.size() > k) {
                pq.remove(); 
            }
        }
        
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
        }
        
        return ans;
    }
}