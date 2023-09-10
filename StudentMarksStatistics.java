import java.util.*;

public class StudentMarksStatistics
{

    public static void main(String[] args){
        
        
        
        // F1: Allows the user to input the assessment name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the assignment name");
        String assessmentName = input.nextLine();
        
        
        
        
        //F2: Add student marks for 30 students.
        //F3: Use try catch block to find out the invalid input and display user the error message.
        double[] marks = new double[5];
        for(int i=0; i<marks.length; i++){
            double mark;
            do {
                try {
                    System.out.println("You are required to enter the marks of 30 students");
                    System.out.println("Enter the student marks from 0 to 30");
                    mark = input.nextDouble(); // Asking user to input the marks of students. 
                    if (mark < 0 || mark > 30) {
                        System.out.println("Please input a number between 0 and 30 only");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please Enter a number between 0 and 30 only");
                    System.out.println(e);
                    input.nextLine(); // Clear the invalid input from the scanner buffer
                    mark = -1; // Assign a value that will trigger the do-while loop to repeat
                }
            } while (mark < 0 || mark > 30);
            marks[i] = mark;
        }
        
        
        
        //F4: Prints out the assessment marks with the name of the assignment. 
        System.out.println("Marks of 30 students for the assessment of "+assessmentName);
        // For displaying the marks inputted by the user
        for(int i=0; i<marks.length; i++){
            System.out.printf("Student %2d: %.2f\n", (i + 1), marks[i]);

        }
        
        
        
        
        
    
    }
    
}
