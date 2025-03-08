class Faculty {
    private String name;
    private String email;

    Faculty(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
}

class Department {
    // Declaring instance variables
    private int id;
    private String name;
    private Faculty fname;

    // Declaring member function
    Department(int id, String name, Faculty fname) {
        this.id = id;
        this.name = name;
        this.fname = fname;
    }

    public void showInfo() {
        System.out.println("Department id: " + this.id);
        System.out.println("Department Name: " + this.name);
        System.out.println("Faculty name: " + this.fname.getName());
        System.out.println("Faculty email: " + this.fname.getEmail());
    }
}

public class Driver {
    public static void main(String[] args) {
        Faculty t1 = new Faculty("Mr.bilawal feroz", "phsyco@dsu.edu.pk");
        Department d1 = new Department(1, "Computer Science", t1);
        d1.showInfo();
    }
}
