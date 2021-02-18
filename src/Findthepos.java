import java.util.Scanner;

public class Findthepos {

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
    Node current;

    int pos;
    public  Node trav = null;

    public void addNode(int data)
    {

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
        pos++;
    }

    void AddnodeatBegin(int data)
    {

        Node newNode = new Node(data);
        if (head == null)

        {

            head = newNode;
            tail = newNode;

        }

        else {

            newNode.next = head;
            head = newNode;

        }
        pos++;
    }



    public void deleteNode()
    {

        System.out.println("The deleted node is "+head.data );


        head = head.next;



        pos--;




    }

    public void DeleteatEnd() {

        tail = head;
        if (head == null) {

            System.out.println("No elements to be deleted ");

        } else if (head.next == null) {
            System.out.print("The deleted element " + head.data);
            head = null;
        } else {
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
        pos--;
    }

    public void DeleteAtpos(int number)
    {
        int j= 1;
        tail = head;
        if(head == null){
            System.out.println("No elements to be deleted ");

        }
        else if (number <= 1 && tail.next == null) {
            head = null;
        } else if (number <= 1) {
            head = tail.next;
        } else {
            while (j < number) {
                prev = tail;
                tail = tail.next;
                j++;
            }
            System.out.println("The deleted Node is " + tail.data);
            prev.next = tail.next;

        }
        pos--;
    }

    void AddnewnodeAtpos(int eleemnt, int pso) {
        int i =0;
        tail = head;
        Node newNode = new Node(eleemnt);
        if (head == null) {
            AddnodeatBegin(eleemnt);
            tail = head;
        } else if (pso <= 1) {

            AddnodeatBegin(eleemnt);
        } else {
            while (i+1 < pso) {
                prev = tail;
                tail = tail.next;
                i++;

            }

            prev.next = newNode;
            newNode.next = tail;
            display();

        }
        pos++;
    }



    public void display(){

        current = head;
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


    public void FindAtpos(int data)

    {

        current = head;
        for(int i=0; i<(pos-data+1)-1;i++)

        {

            current= current.next;

        }
        System.out.println("The element is at "+data+"is"+current.data);


    }


    public static void main(String[] args) {

        int value;
        int posi;
        Scanner sc = new Scanner(System.in);

        Findthepos sList = new Findthepos();

        do
        {


            System.out.println();
            System.out.println("1) add at begin \n 2) add at end \n 3) add at pos\n 4) del at begin \n 5) del at end \n 6) del at pos \n 7) Display \n\n 8)Find Atpos");

            int opu = sc.nextInt();
            switch (opu) {
                case 1 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    sList.AddnodeatBegin(value);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    sList.addNode(value);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    System.out.println("enter the position to be added\n");
                    posi = sc.nextInt();
                    sList.AddnewnodeAtpos(value,posi);
                    System.out.println();
                }
                case 4 -> {
                    sList.deleteNode();
                    System.out.println();
                }
                case 5 -> {
                    sList.DeleteatEnd();
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("enter the position to be deleted\n");
                    posi = sc.nextInt();
                    sList.DeleteAtpos(posi);
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("The elements present are\n");
                    sList.display();
                    System.out.println();
                }
                case 8->{
                    int valuer = sc.nextInt();
                    sList.FindAtpos(valuer);
                }
            }


        }
        while (true);



    }


}