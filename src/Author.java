public class Author {
     String name;
     String email;
     String gender;
     String[] books1;
     static int authorCount = 0;

    // Static block to initialize the author count as author count is a static variable it can be called  in a static method and a block
    static {
        System.out.println("Initializing author count...");
        authorCount = 0;
    }

    // Constructor to initialize attributes
    public Author(String name, String email, String gender, String[] books) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.books1 = books;
        authorCount++; // Incrementing author count on creation of each author
    }

    // Static method to get author count
    public static int getAuthorCount() {
        return authorCount;
    }

    // Method to display author information
    public void displayInfo() {
        System.out.println("Author Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Books: ");
        for (int i = 0; i < books1.length; i++) {
            System.out.println("- " + books1[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating instances of three authors
        Author author1 = new Author("John Doe", "john@example.com", "Male", new String[]{"Book1", "Book2"});
        Author author2 = new Author("Jane Smith", "jane@example.com", "Female", new String[]{"Book3", "Book4"});
        Author author3 = new Author("Alice Johnson", "alice@example.com", "Female", new String[]{"Book5", "Book6", "Book7"});

        // Displaying information related to each author
        author1.displayInfo();
        author2.displayInfo();
        author3.displayInfo();

        // Displaying the total count of authors
        System.out.println("Total Authors: " + getAuthorCount());
    }
}

