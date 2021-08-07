<h1>My JAVA DSA </h1>

<h1>1. Linked List</h1>
<ol>
<li><h4>Creation Using Array</h4></li>https://github.com/pradeep-ramola/MyJavaDSA/tree/main/LinkedList/UsingArray/Create
 <ol><h4> Visualisation link</h4> </ol>:https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Solution++%0A%7B++%0A++//++Node%0Astatic+class+Node++%0A%7B+%0A++++int+data%3B+%0A++++Node+next%3B+%0A%7D%0A//head+of+LinkedList%0Astatic+Node+head%3B++%0A++%0A//+Function+to+insert+node+%0Astatic+Node+insert(Node+head,+int+arrayElement)+%0A%7B+%0A++++Node+newNode+%3D+new+Node()%3B+%0A++++newNode.data+%3D+arrayElement%3B+%0A++++newNode.next+%3D+head%3B+%0A++++head+%3D+newNode%3B+%0A++++return+head%3B+%0A%7D+%0A++%0Astatic+void+displayList(Node+head)+%0A%7B+%0A++++while+(head+!%3D+null)++%0A++++%7B+%0A++++++++System.out.print(head.data+%2B+%22+%22)%3B+%0A++++++++head+%3D+head.next%3B+%0A++++%7D+%0A%7D+%0A++%0Astatic+Node+arrayToLinkedList(int+arr%5B%5D,+int+n)+%0A%7B+%0A++++head+%3D+null%3B+%0A++++for+(int+i+%3D+n+-+1%3B+i+%3E%3D+0+%3B+i--)+%0A++++++++head+%3D+insert(head,+arr%5Bi%5D)%3B+%0A++++return+head%3B+%0A%7D+%0A++%0A+%0Apublic+static+void+main(String%5B%5D+args)+%0A%7B+%0A++++int+arr%5B%5D+%3D+%7B+1,+2,+3,+6,+8,+9%7D%3B+%0A++++int+n+%3D+arr.length%3B+%0A++++Node+head+%3D+arrayToLinkedList(arr,+n)%3B+%0A++++displayList(head)%3B+%0A%7D+%0A%7D+%0A&mode=display&curInstr=0
<li><h4>Reverse Using Array</h4> </li>https://github.com/pradeep-ramola/MyJavaDSA/tree/main/LinkedList/Reverse
<li></li>
<li></li>
</ol>
 
