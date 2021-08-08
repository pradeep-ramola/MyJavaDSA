class Solution {
    public boolean isPalindrome(ListNode head) {
      
        ArrayList<Integer> nodes=new ArrayList<Integer>();
        int i=0;
        ListNode dummy=head;
        while(dummy !=null){
            nodes.add(i,dummy.val);
            dummy=dummy.next;
        }
        int start=0,end=nodes.size()-1;
    while(start<end){
     if(nodes.get(start) != nodes.get(end)){
         return false;
     }
        start++;
        end--;
    }
        return true;
    }
}
