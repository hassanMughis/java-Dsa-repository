import java.util.Scanner;

public class Rectangle {
    private float length;
    private float breadth;
    private static int count = 0;

    // Parameterized constructor
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        count++;
    }

    // Non-parameterized constructor
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
        count++;
    }

    // Accessors
    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }

    public static int getCount() {
        return count;
    }

    // Mutators
    public void setLength(float length) {
        this.length = length;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    // Static method to calculate area
    public static float calculateArea(Rectangle rect) {
        return rect.length * rect.breadth;
    }

    // Non-static method to calculate perimeter
    public float calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Display method
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea(this));
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the rectangle:");
        float length1 = scanner.nextFloat();
        System.out.println("Enter breadth of the rectangle:");
        float breadth1 = scanner.nextFloat();

        Rectangle rect1 = new Rectangle(length1, breadth1);
        System.out.println("Enter length of another rectangle:");
        float length2 = scanner.nextFloat();
        System.out.println("Enter breadth of another rectangle:");
        float breadth2 = scanner.nextFloat();

        Rectangle rect2 = new Rectangle();
        rect2.setLength(length2);
        rect2.setBreadth(breadth2);
        rect1.display();
        rect2.display();

        System.out.println("Total number of rectangles: " + Rectangle.getCount());
    }
}
