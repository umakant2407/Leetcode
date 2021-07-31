// Rotate ArrayList

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        k%=count;
        if(k==0)
            return head;
        head=reverseBet(head,1,count);
        head=reverseBet(head,1,k);
        head=reverseBet(head,k+1,count);
        return head;
    }
    
    private ListNode reverseBet(ListNode head, int left, int right) {
        if(head==null || left==right)
            return head;
        ListNode root=head,prev=head;
        int count=1;
        while(count!=left){
            prev=root;
            root=root.next;
            count++;
        }
        if(left==
        if(left==1)
            head=reverse(root,right-left+1);
        else
            prev.next=reverse(root,right-left+1);
        return head;
    }
    
    
    private ListNode reverse(ListNode head,int right) {
        ListNode prev,nextt=null,start=null;
        start=prev=head;
        if(prev==null)
            return null;
        head=head.next;
        prev.next=null;
        right--;
        while(right!=0){
            nextt=head.next;
            head.next=prev;
            prev=head;
            head=nextt;
            right--;
        }
        start.next=nextt;
        return prev;
    }
    
}