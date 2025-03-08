class Shape {
    void printArea(int side) {
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }
    void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.printArea(5);
        shape.printArea(4, 6);
    }
}
