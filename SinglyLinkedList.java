public class SinglyLinkedList {

    Node head;
    private int size;

    SinglyLinkedList() {
        size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
            size++;
        }
    }

    // add first

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ---> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    // delete Last

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;

        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    // count element

    public int getSize() {
        return size;
    }

    // reverse linked list

    public void reverseLL() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node curreNode = head.next;
        while (curreNode != null) {
            Node nextNode = curreNode.next;
            curreNode.next = prevNode;

            prevNode = curreNode;
            curreNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // delete nth position element

    public void deleteNthPos(int n) {
        if (head.next == null) {
            System.out.println("List is empty.");
            return;
        }
        // int size=getSize();

        // find the size of linked list

        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // delete for 1st node

        if (n == size) {
            head = head.next;
        }

        int indexToSearch = size - n;
        Node prev = head;
        int i = 0;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    // delete data using data

    public void deleteUsingData(int value) {
        if (head.next == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;

        if (head.data == value) {
            head = head.next;
            return;
        }
        while (currNode.next.data != value) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
    }

    public int getMiddle() {
        // Your code here.
        // int size = 0;
        // Node curr = head;
        // while (curr != null) {
        //     size++;
        // }
        int size=getSize();
        Node prev = head;
        int i = 0;

        while (i < (size / 2)) {
            prev = prev.next;
            i++;
        }

        return prev.data;
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();

        sl.addFirst(1);
        sl.addFirst(2);
        // sl.addFirst(3);

        sl.addLast(6);
        sl.addLast(12);

        sl.addFirst(45);
        sl.addFirst(25);
        sl.addFirst(41);

        sl.addLast(26);
        sl.addLast(75);

        sl.display();

        // sl.deleteUsingData(41);
        // sl.display();

        System.out.println(sl.getSize());

        System.out.println(sl.getMiddle());

        // sl.deleteFirst();
        // sl.display();

        // sl.deleteLast();
        // sl.display();

        // sl.reverseLL();
        // sl.display();

        // System.out.println(sl.getSize());

        // sl.deleteNthPos(2);
        // sl.display();
    }
}
