import java.io.*;
import java.util.*;
public class Files
{
    public static void main (String[] args) throws IOException{
        File myFile = new File("myFile.txt");
        if (myFile.createNewFile())
            System.out.println("File Created");
        else
        System.out.println("File already exists");
        
        FileWriter myWriter = new FileWriter(myFile);
        myWriter.write("This is a test file");
        myWriter.close();
        
        Scanner  myScanner = new Scanner(myFile);
        while (myScanner.hasNextLine()){
            String line = myScanner.nextLine();
            System.out.println(line);
        }
        myScanner.close();
    }
}
