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

public void deleteNode(){
    trav = head;
  head = trav.next;

  System.out.println("The deleted node is "+trav.data );
    trav = null;




}

public void DeleteatEnd(){
trav = head;

while(trav!= null)
{

 if(trav.next!= null)

 {
 prev = trav;
 trav = trav.next;


 }

   else
{

System.out.println("The deleted Node is "+trav.data);
prev.next =null;
trav = null;

 }

}







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
 sList.DeleteatEnd();
 sList.display();

    }


}

