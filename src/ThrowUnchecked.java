// Author: hassan mughis
import java.util.Scanner;
class ThrowUnchecked {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = input.nextInt();
        validate(age);
        System.out.println("rest of the code...");
    }
}