import java.util.Scanner;

public class numericpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input range: ");
        int range = scanner.nextInt();
        int space = range;
      for (int j = 1; j <= range; j++) {
          for (int k = 1; k <= space; k++){
              System.out.print(" ");
          }
        for (int i = 1; i <= j; i++) {
System.out.print(space+" ");
        }
        space--;
      System.out.print("\n");
      }

    }
}