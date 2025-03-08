class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // Method to modify the current object using another object
    public void modifyValue(MyClass Object) {
        this.value += Object.value;
    }

    // Method to display the value of the current object
    public void displayValue() {
        System.out.println("Value: " + this.value);
    }
}

public class Se231018_THIS_method {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(5);
        MyClass obj2 = new MyClass(10);

        System.out.println("Before modification:");
        obj1.displayValue(); // Output: Value: 5
        obj2.displayValue(); // Output: Value: 10

        // Pass obj2 (this) as an argument to modifyValue method of obj1
        obj1.modifyValue(obj2);

        System.out.println("After modification:");
        obj1.displayValue(); // Output: Value: 15 (5 + 10)
        obj2.displayValue(); // Output: Value: 10 (Same as before)
    }
}
