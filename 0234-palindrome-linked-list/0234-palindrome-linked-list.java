class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
		ArrayList<Integer> arr=new ArrayList<>();
		while(temp!=null) {
			arr.add(temp.val);
			temp=temp.next;
		}
		int i=0,j=arr.size()-1;
		while(i<=j) {
			int a=arr.get(i),b=arr.get(j);
            if(a!=b)return false;
            i++;
            j--;
		}
        return true;
    }
}