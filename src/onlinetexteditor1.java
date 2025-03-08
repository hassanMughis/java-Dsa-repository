import java.util.Scanner;

class charnode {
    char data;
    charnode prev;
    charnode next;

    charnode(char data) {
        this.data = data;
    }
}

class onlinetexteditor1 {
    charnode head;
    charnode tail;
    charnode cursor;

    onlinetexteditor1() {
        head = null;
        tail = null;
        cursor = null;
    }

    void addtext(char ch) {
        charnode newnode = new charnode(ch);
        if (cursor == null) {
            head = tail = cursor = newnode;
        } else {
            newnode.prev = cursor;
            newnode.next = cursor.next;
            if (cursor.next != null) {
                cursor.next.prev = newnode;
            } else {
                tail = newnode;
            }
            cursor.next = newnode;
            cursor = newnode;
        }
    }

    void deletetext() {
        if (cursor != null) {
            if (cursor.prev != null) {
                cursor.prev.next = cursor.next;
            } else {
                head = cursor.next;
            }
            if (cursor.next != null) {
                cursor.next.prev = cursor.prev;
            } else {
                tail = cursor.prev;
            }
            cursor = cursor.prev;
        }
    }

    void modify(char ch) {
        if (cursor != null) {
            cursor.data = ch;
        }
    }

    void goleft() {
        if (cursor != null && cursor.prev != null) {
            cursor = cursor.prev;
        }
        else {
            System.out.println("Cannot move left. Already at the beginning of the text.");
        }
    }

    void goright() {
        if (cursor != null && cursor.next != null) {
            cursor = cursor.next;
        }
        else {
            System.out.println("Cannot move right. Already at the end of the text.");
        }
    }

    void displaytext() {
        charnode current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        onlinetexteditor1 editor = new onlinetexteditor1();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add text");
            System.out.println("2. Delete text");
            System.out.println("3. Modify text");
            System.out.println("4. Move left");
            System.out.println("5. Move right");
            System.out.println("6. Display text");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter character to add: ");
                    char ch = scanner.nextLine().charAt(0);
                    editor.addtext(ch);
                    break;
                case 2:
                    editor.deletetext();
                    break;
                case 3:
                    System.out.print("Enter new character: ");
                    char newch = scanner.nextLine().charAt(0);
                    editor.modify(newch);
                    break;
                case 4:
                    editor.goleft();
                    break;
                case 5:
                    editor.goright();
                    break;
                case 6:
                    editor.displaytext();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
