import java.util.Scanner;

public class Circular {

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


public  int counter = 0;
    public  Node trav = null;
    public Node rav = null;

    public void addNode(int data)

    {

    Node newNode = new Node(data);

    if(head == null)
    {
            head = newNode;
            tail = newNode;
            prev = tail;
            newNode.next = head;
     }


     else {


  tail.next = newNode;

  prev = tail;

  tail= tail.next;

  tail.next = head;
        counter++;

  }


   }

  void AddnodeatBegin(int data)

 {

        Node newNode = new Node(data);
        if (head == null)

        {

            head = newNode;
            tail = newNode;
            prev = newNode;
             newNode.next = head;
            counter++;

        }

        else
       {

           newNode.next = head;
           head = newNode;
           tail.next = head;
           counter++;

      }



    }



    public void deleteNode() {
        if (counter == 1) {
            head = null;
        }

      else   if(head == null){
            System.out.println("No elements to be deleted ");

        }
        else {
            System.out.println("The deleted node is " + head.data);
            head = head.next;
            tail.next = head;


        }
        counter--;
    }

    public void DeleteatEnd() {
        if (counter == 1) {
            head = null;
        }
       else if(head == null){
            System.out.println("No elements to be deleted ");

        }
        else {
            tail = prev;
            tail.next = head;

        }
        counter--;

    }

    public void DeleteAtpos(int number)

    {

        int j= 1;
        trav = head;
        if(head == null){

        System.out.println("No elements to be deleted ");

        }

        else if (number <= 1 && trav.next == head) {
            head = null;
        }

        else if (number <= 1) {

        head = trav.next;

        }

        else {
            while (j < number) {
                rav = trav;
                trav = trav.next;
                j++;
            }

            System.out.println("The deleted Node is " + tail.data);
            rav.next = trav.next;

        }
        counter--;

    }
    void AddnewnodeAtpos(int eleemnt, int pso) {

        int i =0;
        trav = head;
        Node newNode = new Node(eleemnt);
        if (head == null) {
            AddnodeatBegin(eleemnt);

            trav = head;

        }
        else if (pso <= 1) {

            AddnodeatBegin(eleemnt);

        }
        else {

            while (i+1 < pso)
            {
                rav = trav;
                trav = trav.next;
                i++;

            }

            rav.next = newNode;
            newNode.next = trav;

            counter++;

        }

        display();
    }



    public void display(){

        int koop= 0;
        Node current = head;
        if(head== null)
        {

            System.out.println("linked list is empty");
            return;
        }
        System.out.println("The list of linked List");
        while(current!= null) {

            if (koop >= counter) {
               // System.out.println(counter);
                break;
            }
            else {
                System.out.print(current.data + " ,");
                current = current.next;

            }
            koop++;
        }

        System.out.println();


    }

    public static void main(String[] args) {

        int value;
        int posi;
        Scanner sc = new Scanner(System.in);
        Circular sList = new Circular();

        do {

            System.out.println();
            System.out.println("1) add at begin \n 2) add at end \n 3) add at pos\n 4) del at begin \n 5) del at end \n 6) del at pos \n 7) Display");

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
            }


        }
        while (true);



    }


}