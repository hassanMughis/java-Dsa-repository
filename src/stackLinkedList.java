/*
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class stackLinkedList {
    Node top;

    stackLinkedList() {
        this.top = null;
    }

    public boolean isempty() {
        return top == null;
    }

    public void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        System.out.println("Pushed: " + data);
    }

    public void pop() {
        if (isempty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    public int peek() {
        if (isempty()) {
            System.out.println("Stack is empty!");
        }
        return top.data;
    }

    public void display() {
        if (isempty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        stackLinkedList stack = new stackLinkedList();

        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.display();
    }
}
*/
