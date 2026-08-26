class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        temp=head;
        for(int i =1;i<=length/2;i++){
            temp=temp.next;
        }return temp;
    }
}