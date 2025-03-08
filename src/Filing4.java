import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filing4 {
    public static void main(String[] args) {
        String sourceFilePath = "F:\\File1.txt";
        String destinationFilePath = "F:\\File2.txt";

        try (FileReader fr = new FileReader(sourceFilePath);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(destinationFilePath);
             BufferedWriter bw = new BufferedWriter(fw)) {

            int data;
            while ((data = br.read()) != -1) {
                bw.write(data);
            }

            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

