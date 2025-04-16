import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    public void intsertEndNode(Node node) {
        Node temp = head;
        if (head == null) {
            head = node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("null");
        }
    }
}

public class LinkedList_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        LinkedList s = new LinkedList();
        // LinkedList t = new LinkedList();
        while (flag) {
            int data = sc.nextInt();
            if (data == -1) {
                flag = false;
            } 
            else {
                Node node = new Node(data);

                s.intsertEndNode(node);
            }
        }
        s.display();
        sc.close();
    }
}
