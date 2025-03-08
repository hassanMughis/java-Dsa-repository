import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filing3
{
    public static void main(String[] args) throws IOException
    {
        FileReader f1=new FileReader("C:\\Users\\Tech Link\\IdeaProjects\\main\\src\\f1.txt");
        int data;
        while((data=f1.read())!=-1)
        {
            System.out.print((char)data);
        }
        System.out.println("");
        f1.close();
    }
}