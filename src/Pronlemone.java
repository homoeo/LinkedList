import java.util.Scanner;

public class Pronlemone {

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





    public void DeleteatEnd() {

        tail = head;
        if (head == null) {

            System.out.println("No elements to be deleted ");

        }
        else if (head.next == null) {
            System.out.print("The deleted element " + head.data);
            head = null;
        }
        else {
            while (tail != null) {


                if (tail.next != null) {

                    prev = tail;
                    tail = tail.next;


                } else {

                    System.out.println("The deleted Node is " + tail.data);
                    prev.next = null;
                    break;

                }

            }


        }

    }

    public void stacktop()
    {
        System.out.println("the stack top is "+tail.data+"\n");

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
            System.out.print(current.data +" ,");
            current = current.next;

        }

        System.out.println();


    }

    public static void main(String[] args) {

        int value;
        int posi;
        Scanner sc = new Scanner(System.in);
        Pronlemone sList = new Pronlemone();

        do {

            System.out.println();
            System.out.println("2) add at end \n  \n 5) del at end \n  \n 7) Display\n \n 8) stackTop");

            int opu = sc.nextInt();
            switch (opu) {

                case 2 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    sList.addNode(value);
                    System.out.println();
                }

                case 5 -> {
                    sList.DeleteatEnd();
                    System.out.println();
                }

                case 7 -> {
                    System.out.println("The elements present are\n");
                    sList.display();
                    System.out.println();
                }
                case 8->{
                    sList.stacktop();
                }
            }


        }
        while (true);



    }


}