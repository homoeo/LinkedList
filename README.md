# LinkedList
Linked List
1) Add a method named deleteatEnd ()
2) Create a new variable named prev(Type: Node)  and assign it as null.
3) Inside the method assign head value to trav variable.
4) Create a while loop with condition trav!=null

1) Inside the while loop 
Check the condition if trav.next !=null Assign trav value to prev value. -> prev = trav; -> trav = trav.next; Else Prev.next = null; Trav = null;

Close the loop End of method///




Algorithum for delete at a postion.

	1) Create a method named Delete at pos 
	2) From main method send a parameter(no) to Delete at pos.
	3) At this method,  create a while loop with I = 0 initilaizing 
	4) While( I > pos)
	5) {
	6) Prev  = count;
	7) Count = count.next;
	8) I ++;
	9) }
	10) Prev.next = tail.next;

