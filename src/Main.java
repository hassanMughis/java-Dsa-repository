/*TASKS
Perform the following tasks using singly linked list(SLL), create separate function for each
        task
1. Find the length of a given SLL.
2. Print the middle node of a given SLL.
        3. Reverse a given SLL. (A copy of original SLL should be retained).
        4. Remove duplicates from a sorted SLL .
        5. Merge two sorted SLL .
        6. Delete complete SLL.*//*

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist{
    Node head,tail;
    Linkedlist(){
        this.head = null;
        this.tail = null;
    }
    public void display(){
        Node currunt = head;
        int size = 0;
        while (currunt != null){
            System.out.print(currunt.data+" --> ");
            currunt= currunt.next;
            size++;
        }
        System.out.println("null");
        System.out.println("Size = " + size);
    }
    public void displaymid(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("middle value ="+slow.data);
    }
    public void reverse(){
        Node front = null;
        Node currunt = head;
        Node prev = null;
        while (currunt != null){
            front = currunt.next;
            currunt.next = prev;
            prev = currunt;
            currunt = front;
        }
        head = prev;
    }
    public void sort(){
        boolean swapped;
        do {
            Node currunt = head;
            swapped = false;
            while (currunt != null && currunt.next != null){
                if (currunt.data > currunt.next.data) {
                    int temp;
                    temp = currunt.data;
                    currunt.data = currunt.next.data;
                    currunt.next.data = temp;
                    swapped = true;
                }
                currunt = currunt.next;
            }

        }while (swapped);
    }
    public void removeduplicate(){
        Node currunt = head;
        while (currunt != null && currunt.next != null){
            if (currunt.data == currunt.next.data) {
                currunt.next = currunt .next.next;
            }
            else {
                currunt = currunt.next;
            }
        }
    }
    public void deletefull(){
        head = null;
        System.out.println("The Singly Linked List has been deleted.");
    }
}
public class Main {
    public static void main(String[] args) {
        Linkedlist LL = new Linkedlist();
        LL.head = new Node(10);
        LL.head.next = new Node(80);
        LL.head.next.next = new Node(80);
        LL.head.next.next.next = new Node(40);
        LL.head.next.next.next.next = new Node(50);
        LL.head.next.next.next.next.next = new Node(60);
        LL.head.next.next.next.next.next.next = new Node(70);
        LL.tail =LL.head.next.next.next.next.next.next.next;
        LL.sort();
        LL.removeduplicate();
        LL.display();
        LL.displaymid();
        LL.reverse();
        LL.display();
        LL.deletefull();
    }
}
*/
