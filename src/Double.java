import java.util.Scanner;

public class Double {

    public Node head = null;
    public Node tail = null;
    public Node ail = null;


    class Node {

        Node prev;
        int data;
        Node next;

        Node(int datya) {
            this.prev = null;
            this.data = datya;
            this.next = null;
        }


    }

    void Addatbegin(int parameter) {

        tail = head;
        Node node = new Node(parameter);
        if (head == null) {
            head = node;
            tail = node;
            ail = node;
        } else {

            tail.prev = node;
            node.next = tail;
            head = node;
            tail = tail.prev;
        }


    }

    public Node prev = null;


    void Addatpos(int parameter, int pso) {


        int i = 0;
        Node count = head;

        Node node = new Node(parameter);

        if (head == null) {

            head = node;
            count = node;
            ail = node;

        }

        else if (pso <= 1) {

            Addatbegin(parameter);

        }

        else {

         while (i + 1 < pso) {

             prev = count;
             count = count.next;
             i++;

            }

            node.next = count;
            count.prev = node;
            prev.next = node;
            node.prev = prev;


        }
    }
    void Addatend(int parameter) {

        Node node = new Node(parameter);
        if (head == null) {
            head = node;
            ail = node;
        } else {
            ail.next = node;

            node.prev = ail;

            ail = ail.next;


        }


    }

    public Node delete = null;

    void Deleteatbegin() {

        if (head == null) {
            System.out.println(" As No new eleemnts are there to be deleeted ");
        } else {

            delete = head;
            head = delete.next;

            System.out.println("The deleted node is " + delete.data);


        }


    }

    void Deleteatpos(int number) {

        int j = 1;

        delete = head;



   if(number<=1 && delete.next==null){
            head = null;
        }

   else if(number<=1)
   {
       head = delete.next;
   }

        while (j <= number) {

            if (j <=1) {

                prev = delete;

            }

            else
                {
                prev = delete;

                delete = delete.next;
            }



            j++;

   }



    if(delete.next!=null){
    delete = delete.next;
    System.out.println("delete"+delete.data);
    prev.next = delete;
    delete.prev = prev;
    System.out.println("prev"+prev.data);
}

else{
    prev.next = null;




}



    }


    void Deleteatend() {


        if (head == null) {

            System.out.println("No elements to be deleted ");

        } else if (head.next == null) {
            System.out.print("The deleted element " + head.data);
            head = null;
        } else {
            ail = ail.prev;
            ail.next = null;


        }


    }


    void display() {

        Node current = head;
        if (current == null) {
            System.out.println("No elements to display");
        }

        while (current != null) {

            System.out.print(current.data + " , ");

            current = current.next;

        }

    }


    public static void main(String[] args) {


        int value;
        int posi;
        Scanner sc = new Scanner(System.in);
        Double doubl = new Double();
        do {
            System.out.println();
            System.out.println("1) add at begin \n 2) add at end \n 3) add at pos\n 4) del at begin \n 5) del at end \n 6) del at pos \n 7) Display");

            int opu = sc.nextInt();
            switch (opu) {
                case 1 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    doubl.Addatbegin(value);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    doubl.Addatend(value);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Enter the value to be added");
                    value = sc.nextInt();
                    System.out.println("enter the position to be added\n");
                    posi = sc.nextInt();
                    doubl.Addatpos(value,posi);
                    System.out.println();
                }
                case 4 -> {
                    doubl.Deleteatbegin();
                    System.out.println();
                }
                case 5 -> {
                    doubl.Deleteatend();
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("enter the position to be deleted\n");
                    posi = sc.nextInt();
                    doubl.Deleteatpos(posi);
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("The elements present are\n");
                    doubl.display();
                    System.out.println();
                }
            }


        }
        while (true);


    }
}
