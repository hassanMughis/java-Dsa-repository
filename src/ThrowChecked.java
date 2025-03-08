// Author : hassan mughis
import java.util.Scanner;
class ThrowChecked {
    public static void validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("Person is not eligible to vote");
            } else {
                System.out.println("Person is eligible to vote!!");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException: " +e.getMessage());
        }
    }
    //main method
    public static void main(String args[]){
        //calling the function
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = input.nextInt();
        validate(age);
        System.out.println("rest of the code...");
    }
}