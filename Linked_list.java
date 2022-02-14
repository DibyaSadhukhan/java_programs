import java.util.Scanner;
public class Linked_list {    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
    public Node head = null;    
    public Node tail = null;    
    public void addNode(int data) {    
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
    public void display() {    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        Linked_list sList = new Linked_list();    
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Y to enter data into the linked list");
        char c=sc.next().charAt(0);
        while(c=='Y'||c=='Y'){
            sc.nextLine();
            System.out.println("Enter data:");
            sList.addNode(sc.nextInt());    
            System.out.println("Enter more numbers? [Y/N]");
            c=sc.next().charAt(0); 
        }
        System.out.println("Do you want to display y/n ");
        c=sc.next().charAt(0);
        if(c=='Y'||c=='y'){ 
            sList.display();   
        } 
        sc.close();
    }    
}    