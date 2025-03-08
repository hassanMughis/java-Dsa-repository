import java.io.File;

public class Filing {
    public static void main(String[] args) {
        // Create a File object pointing to "C:\\Java\\Hello.txt"
        File f1 = new File("C:\\Java\\hassan.txt");

        // Print the absolute path of the file
        System.out.println("Absolute path of file is " + f1.getAbsolutePath());

        // Print the path of the file
        System.out.println("Path of file is " + f1.getPath());

        // Print the name of the file
        System.out.println("Name of file is " + f1.getName());
    }
}
