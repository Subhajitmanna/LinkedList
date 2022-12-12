public class DoubleLL {
    Node head;

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int x){
            data=x;
            prev=null;
            next=null;
        }
    }

    //add First

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //add last

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        newNode.prev=currNode;
        currNode.next=newNode;
    }

    //delete First

    public void deleteFirst(){
        if(head==null){
            System.out.println("Delete is not possible.");
            return;
        }
        Node currNode=head;
        currNode=currNode.next;
        head.next=null;
        currNode.prev=null;
        head=currNode;
    }

    //delete Last

    public void deleteLast(){
        if(head==null){
            System.out.println("Delete is not possible.");
            return;
        }
        Node currNode=head;
        while(currNode.next.next!=null){
            currNode=currNode.next;
        }
        currNode.next.prev=null;
        currNode.next=null;
    }

    //display
    
    public void display(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // get size
    
    public int getSize(){
        int size=0;
        if(head==null){
            return 0;
        }
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        DoubleLL dl=new DoubleLL();

        dl.addFirst(45);
        dl.addFirst(5);
        dl.addFirst(71);
        dl.addFirst(21);
        dl.display();
        dl.addLast(82);
        dl.display();
        dl.deleteFirst();
        dl.display();
        dl.deleteLast();
        dl.display();

        System.out.println("size of the DLL is: "+dl.getSize());
    }
}
