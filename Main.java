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
            System.out.println("\nDeleting node " + head.data + " from start");
            head = head.next;
            tail.next=head;
            size--;
        }
    }

    public void deleteNode(int valueToDelete) {
    Node currentNode = head;

    if (head != null) {
        if (currentNode.data == valueToDelete) {
            head = head.next;
            tail.next = head;
        } else {
            do {
                Node next = currentNode.next;
                if (next.data == valueToDelete) {
                    currentNode.next = next.next;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != head);
        }
    }
}

    public int elementAt(int index){
        if(index>size){
            return -1;
        }
        Node n = head;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n.data;
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
        System.out.println("Size of linked list: "+ circle.getSize());
        System.out.println("Element at 2nd position: "+ circle.elementAt(2));
        circle.deleteNode(2);
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