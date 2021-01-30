
public class Double {

public  Node head = null;
public Node tail =null;
 public   Node ail = null;


class Node{

    Node prev;
    int data;
    Node next;

Node(int datya)

{
    this.prev = null;
    this.data = datya;
    this.next = null;
}





}

void Addatbegin(int parameter)

{

    tail = head;
    Node node = new Node(parameter);
    if(head == null)
    {
        head= node;
        tail = node;
    }


    else
{
   tail.prev = node;
   node.next = tail;
   head = node;
  tail = tail.prev;
}


}

void Addatpos(int parameter){

    Node node = new Node(parameter);
    if(head == null)
    {
        head= node;
        tail = node;
    }



}

void Addatend(int parameter){

    Node node = new Node(parameter);
    if(head == null)
    {
     head= node;
     ail = node;
    }
    else {
        ail.next    =  node;

        node.prev  =  ail;

        ail = ail.next;




    }



}

void Deleteatbegin(){

}

void Deleteatpos(){

}



void Deleteatend(){

}






void display()
{

Node current = head;
    if(current== null){
        System.out.println("No elements to display");
    }

while(current!=null)
{

 System.out.println(current.data + "  ");

 current = current.next;

}

}













    public static void main(String[] args) {
        Double doubl = new Double();

doubl.Addatend(1);
        doubl.Addatend(2);
        doubl.Addatend(3);
        doubl.Addatend(4);
System.out.println();
        doubl.Addatbegin(8);
        doubl.Addatbegin(9);
        doubl.Addatbegin(10);
        doubl.Addatend(11);
        doubl.display();

    }







}
