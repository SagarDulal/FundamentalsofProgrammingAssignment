import java.io.*;
import java.util.*;
import java.lang.*;

public class BubbleSort
{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        String inputFile = "numbers.txt";
        String outFile = "numbers_sorted.txt";
        // Create file
        File myFile = new File("numbers.txt");
        Scanner myScanner = new Scanner(myFile);
        int[] numbers = new int[100];
        
        int count = 0;
        while(myScanner.hasNextInt()){
            numbers[count++] = myScanner.nextInt();
        }
        myScanner.close();
        bubbleSort(numbers, count);
        FileWriter myWriter = new FileWriter(outFile);
        for(int i= 0; i<count; i++){
            myWriter.write(Integer.toString(numbers[i]));
        }
        myWriter.close();
        System.out.println("Number has been sorted and saved to the file");
    }
    
    public static void bubbleSort(int arr[], int n){
        boolean swapped;
        for (int j= 0; j<n-1; j++){
            swapped = false;
            for(int i =0; i<n-j-1; i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true; 
                    
                }
            }
            if(!swapped){
                break;
            }
        
        }
    }
}
