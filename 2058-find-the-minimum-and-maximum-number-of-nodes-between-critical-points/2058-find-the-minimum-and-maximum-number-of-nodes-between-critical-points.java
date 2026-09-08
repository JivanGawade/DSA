/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] ans={-1,-1};
        int idx=1,Fidx=-1,Lidx=-1,minDist=Integer.MAX_VALUE;
        ListNode a=head;
        ListNode b=a.next;
        ListNode c=b.next;
        if(c==null)return ans;
        while(c!=null){
            if((b.val>a.val && b.val>c.val)||(b.val<a.val && b.val<c.val)){
                if(Fidx==-1)Fidx=idx;
                if(Lidx!=-1){
                    int dist=idx-Lidx;
                    minDist=Math.min(dist,minDist);
                }
                Lidx=idx;
            }
            idx++;
            a=a.next;
            b=b.next;
            c=c.next;
        }
       int maxDist=Lidx-Fidx;
        if(maxDist==0)maxDist=-1;
        if(minDist==Integer.MAX_VALUE)minDist=-1;
        ans[0]=minDist;
        ans[1]=maxDist;
        return ans;
    }
}