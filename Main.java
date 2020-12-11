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

    public void addNodeAtEnd(int data){
        if(size==0){
            addNodeAtStart(data);
        }else{
            Node n = new Node(data);
            tail.next =n;
            tail=n;
            tail.next = head;
            size++;
        }
        System.out.println("\nNode " + data + " is added at the end of the list");
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

    public void deleteNodeFromStart(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting node " + head.data + " from start");
            head = head.next;
            tail.next=head;
            size--;
        }
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
        circle.addNodeAtEnd(4);
        circle.print();
        circle.deleteNodeFromStart();
        circle.print();
        
    }

}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}