
public class Double {

public  Node head = null;
public Node tail =null;



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

void Addatbegin(int parameter){

}

void Addatpos(int parameter){

}

void Addatend(int parameter){

    Node node = new Node(parameter);
    if(head == null)
    {
     head= node;
     tail = node;
    }
    else {
        tail.next    =  node;

        node.prev  =  tail;

        tail = tail.next;




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
        doubl.Addatend(5);

        doubl.display();

    }







}
