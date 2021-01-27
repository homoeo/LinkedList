public class Single {

class Node{
    int data;
    Node next;
    public  Node(int data)
    {
this.data = data;
this.next = null;
    }
}

public Node head = null;

public Node tail = null;

public Node prev = null;



  public  Node trav = null;

public void addNode(int data){

Node newNode = new Node(data);

if(head == null)
{
    head = newNode;
    tail = newNode;
}
else {
    tail.next = newNode;
    tail = newNode;



}
}

void AddnodeatBegin(int data){
    Node newNode = new Node(data);
    if (head == null){
     System.out.println("The linked list is empty");

    }
    else {
     newNode.next = head;
     head = newNode;

    }
}



public void deleteNode(){



        tail = head;
        head = tail.next;

        System.out.println("The deleted node is "+tail.data );







}

public void DeleteatEnd(){
tail = head;

while(tail!= null)
{

 if(tail.next!= null)

 {
 prev = tail;
 tail = tail.next;


 }

   else
{

System.out.println("The deleted Node is "+tail.data);
prev.next =null;
tail = null;

 }

}







}
int i =1;
public void DeleteAtpos(int number){
tail=head;

while(i< number){
prev =  tail;
tail = tail.next;
        i++;
 }
    System.out.println("The deleted Node is "+tail.data);
prev.next = tail.next;

}

void AddnewnodeAtpos(int eleemnt, int pso){

  Node newNode = new Node(eleemnt);
  tail=head;

  while(i< pso){
 prev =  tail;
 tail = tail.next;
 i++;

   }

    prev.next = newNode;
  newNode.next = tail;


}





public void display(){
  Node current = head;
  if(head== null)
  {

      System.out.println("linked list is empty");
      return;
  }
    System.out.println("The list of linked List");
  while(current!= null)
  {
   System.out.println(current.data +" ");
   current = current.next;

  }
 System.out.println();


}

    public static void main(String[] args) {

    Single sList = new Single();

  sList.addNode(1);
  sList.addNode(2);
  sList.addNode(3);
  sList.addNode(4);

 sList.AddnewnodeAtpos(6,2);


 sList.display();



 }


}

