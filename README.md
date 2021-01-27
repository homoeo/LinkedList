# LinkedList
Linked List
	 Algorithum delete at end
	
	1) Add a method named deleteatEnd ()
	2) Create a new variable named prev(Type: Node)  and assign it as null.
	3) Inside the method assign head value to trav variable.
	4) Create a while loop with condition trav!=null
 
	1) Inside the while loop 
Check the condition  if trav.next !=null 
Assign trav value to prev value. 
-> prev = trav;
-> trav = trav.next;
Else
Prev.next = null;
Trav = null;

Close the loop 
	End of method///
