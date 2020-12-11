public class Main {

    public int size =0;
    public Node head=null;
    public Node tail=null;

    //add a new node at the start of the linked list
    public void addNodeAtStart(int data){
        System.out.println("Adding node " + data + " at start");
        Node n = new Node(data);
        if(size==0){
            head = n;
            tail = n;
            n.next = head;
        }else{
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }

    //print the linked list
    public void print(){
        System.out.print("Circular Linked List:");
        Node temp = head;
        if(size<=0){
            System.out.print("List is empty");
        }else{
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
            while(temp!=head);
        }
        System.out.println();
    }

    //get Size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Main circle = new Main();
        circle.addNodeAtStart(3);
        circle.addNodeAtStart(2);
        circle.addNodeAtStart(1);
        circle.print();
        circle.deleteNodeFromStart();
        circle.print();
        circle.addNodeAtEnd(4);
        circle.print();
        System.out.println("Size of linked list: "+ circle.getSize());
        System.out.println("Element at 2nd position: "+ circle.elementAt(2));
    }

}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}