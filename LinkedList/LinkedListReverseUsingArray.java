

public classLinkedListReverseUsingArray {
	  //  Node
	static class Node  
	{ 
	    int data; 
	    Node next; 
	}
	//head of LinkedList
	static Node head;  
	  
	// Function to insert node 
	static Node insert(Node head, int arrayElement) 
	{ 
	    Node newNode = new Node(); 
	    newNode.data = arrayElement; 
	    newNode.next = head; 
	    head = newNode; 
	    return head; 
	} 
	  
	static void displayList(Node head) 
	{ 
	    while (head != null)  
	    { 
	        System.out.print(head.data + " "); 
	        head = head.next; 
	    } 
	} 
	  
	static Node arrayToLinkedList(int arr[], int n) 
	{ 
	    head = null; 
	    for (int i = 0; i <= n-1 ; i++) 
	        head = insert(head, arr[i]); 
	    return head; 
	} 
	  
	 
	public static void main(String[] args) 
	{ 
	    int arr[] = { 1, 2, 3, 6, 8, 9}; 
	    int n = arr.length; 
	    Node head = arrayToLinkedList(arr, n); 
	    displayList(head); 
	} 
	} 
