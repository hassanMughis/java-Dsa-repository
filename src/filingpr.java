import java.io.*;

public class filingpr {
    public static void main(String[] args) {
        // Define file paths
        String sourceFilePath = "C:\\Users\\Tech Link\\IdeaProjects\\main\\src\\f1.txt";
        String destinationFilePath = "C:\\Users\\Tech Link\\IdeaProjects\\main\\src\\f1_copy.txt";

        // Create and write to the source file
        try {
            File f1 = new File(sourceFilePath);
            if (f1.exists()){

                System.out.println("File exist " + f1.getName());
            }else {
                if (f1.createNewFile()) {
                    System.out.println("File created: " + f1.getName());
                } else {
                    System.out.println("File creating error");
                }
            }

            // Write to the file
            try (FileWriter fileWriter = new FileWriter(f1)) {
                fileWriter.write("this is the first line\n");
                System.out.println("Written to file: " + f1.getAbsolutePath());
            }

            // Print file information
            System.out.println("Source File Absolute Path: " + f1.getAbsolutePath());
            System.out.println("Source File Path: " + sourceFilePath);
            System.out.println("Source File Name: " + f1.getName());

            // Copy content from the source file to the destination file
            try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFilePath))) {

                int data;
                while ((data = br.read()) != -1) {
                    bw.write(data);
                    System.out.print((char)data);
                }
                System.out.println("File content copied successfully to " + destinationFilePath);
            } catch (IOException e) {
                System.err.println("An error occurred during file copy: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Unable to create or write to file: " + e.getMessage());
        }
    }
}
