import java.util.Scanner;

public class numericpatterna {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input range: ");
            int range = scanner.nextInt();
            int space = range;
            for (int j = 1; j <= range; j++) {
                int use = space;
                for (int i = 1; i <= j; i++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= space; k++){
                    System.out.print(use);
                    use--;
                }
                use=+1;
                for (int l = 1; l <= space-1; l++){
                    use++;
                    System.out.print(use);

                }
                space--;
                System.out.print("\n");
            }

        }
    }
