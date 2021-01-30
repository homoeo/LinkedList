
public class Double {

public  Node head = null;
public Node tail =null;
 public   Node ail = null;


class Node
{

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

  public  Node prev = null;
    int i=1;
void Addatpos(int parameter, int pso)

{


    Node count = head;

    Node node = new Node(parameter);

    if(head == null)

    {

        head= node;
        count = node;

    }




    while(i< pso){

        prev =  count;
        count = count.next;
        i++;

    }
node.next = count;
    count.prev = node;
    prev.next = node;
      node.prev = prev;






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

public Node delete = null;
void Deleteatbegin()

{

if(head == null){
    System.out.println(" As No new eleemnts are there to be deleeted ");
}
    else {

    delete = head;
    head = delete.next;

    System.out.println("The deleted node is "+delete.data );



}



}

void Deleteatpos(int number)

{

    int j =1;

    delete=head;

    while(j<=number)
    {
        if(j< number){

            prev =  delete;
        }
        else {
            System.out.println("The deleted Node is "+delete.data);
        }


        delete = delete.next;
        j++;

    }


    prev.next = delete;
    delete.prev = prev;






}



void Deleteatend() {


    delete = head;

    while (delete != null) {

        if (delete.next != null) {
            prev = delete;
            delete = delete.next;


        } else {

            System.out.println("The deleted Node is " +delete.data);
            prev.next = null;
            delete = null;

        }

    }

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


        doubl.Deleteatpos(2);

        doubl.display();


    }







}
