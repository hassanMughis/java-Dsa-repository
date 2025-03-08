import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Filing2
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f1=new FileWriter("F:\\File1.txt");
        f1.write("Hello World");
        f1.close();
    }
}