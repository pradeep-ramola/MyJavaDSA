class Solution {
public boolean isPalindrome(ListNode head) {
    // base condition only one node 
    if(head.next== null) return true;
    // we are calculating mid because if we can get to the mid we can reverse the list before mid (or after mid any) and compare both of them to find whether they are same or not
		int totalnumberofnodes = 0;
    // traversing the whole list
		for (ListNode node = head; node != null; node = node.next)
			totalnumberofnodes++; // this mid is the whole length 
		ListNode traverse = head;
		ListNode reverse = null;
    // reversing 1 half
		for (int i = 0; i < totalnumberofnodes / 2; i++) {
		    ListNode next = traverse.next;
			traverse.next = reverse ;
			reverse = traverse;
			traverse = next;
		}
    // traverse is pointing to the node after mid
    // handling the odd case what if list is 1-2-1 
		if (totalnumberofnodes % 2 == 1)
			traverse = traverse.next;
    // finally comparison  of reverse list and traversed one 
		while (reverse != null && traverse != null) {
            if (reverse.val != traverse.val)
                return false;
			reverse = reverse.next;
			traverse=traverse.next;
		}
		return true;
    }
}
