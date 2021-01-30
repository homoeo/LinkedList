 Algorithum for doubly linked list class
	1) Create a class named double and inside the class create another class named Node.
	2) Inside Node class, initialize 3 variables named data(Int ) and prev, next(Type : Node).
	3) Create Node class constructor with parameter. Inside the constructor, assign parameter value to data variable.
	4) Create a variable named head and initlialize it to null.
	5) The operations of dll are add(begin, pos, end), delete(begin, pos, end).
	6) Create these methods.

Algorithum for Add at end()

	1) Initialize the node class object
	2) Node node = new Node(parameter);
	3)  check if head equal to null if satisfied then
	4) Assign the new node to head
	5) // if(head == null)
	6)
	7) {
	8)
	9) Head = node;
	10)
	11) }
	12) If condition is false then,
	13) Else{

 tail.next    =  node;

 node.prev  =  tail;

tail = tail.next;

}
Close the method and return nothing (void).

Algorithum for Add at begin()
Head = tail;
	1) Create a new node 
	2) Check if head is null. 
	if(head==null)
	{
	head=node;
	tail=node;
	}
	
	3) If not  
