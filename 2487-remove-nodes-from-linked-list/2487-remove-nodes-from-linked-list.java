class Solution {
    public ListNode removeNodes(ListNode head) {
     Stack<ListNode> st=new Stack<>();
     ListNode temp=head;
     while(temp!=null){
        while(st.size()>0 && st.peek().val<temp.val)
            st.pop();
        st.push(temp);

        temp=temp.next;
    }
    while(st.size()>0){
        ListNode top=st.pop();
        top.next=temp;
        temp=top;
    }
    return temp;
    }
}