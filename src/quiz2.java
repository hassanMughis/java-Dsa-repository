class node {
    String name;
    String date;
    node next;
    node prev;

    public node(String name, String date) {
        this.name = name;
        this.date = date;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    private node head;
    private node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void add(String name, String date) {
        node newnode = new node(name, date);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        System.out.println("Add Appointment: " + '"' + name + '"' + " on " + '"' + date + '"');
    }

    public void cancel(String name) {
        node curr = head;
        while (curr != null) {
            if (curr.name.equals(name)) {
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                } else {
                    head = curr.next;
                }
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                } else {
                    tail = curr.prev;
                }
                System.out.println("Cancel Appointment: " + '"' + name + '"');
                return;
            }
            curr = curr.next;
        }
        System.out.println("appointment not found for a patient named: " + name);
    }

    public void view() {
        node curr = head;
        if (curr == null) {
            System.out.println("no appointments scheduled.");
            return;
        }
        while (curr != null) {
            System.out.println("patient: " + curr.name + ", Date: " + curr.date);
            curr = curr.next;
        }
    }
}

public class quiz2 {
    public static void main(String[] args) {
        DLL appointments = new DLL();
        appointments.add("john doe", "2024-12-24");
        appointments.add("jane smith", "2024-12-25");
        appointments.cancel("john doe");
        appointments.view();
    }
}
