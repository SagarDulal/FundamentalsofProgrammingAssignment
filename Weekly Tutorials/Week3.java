
import java.util.*; 
import java.lang.String;

public class Week3
{

    public static void main(String[] args){
    String message1 = "Hello how are you";
    String message2 = new String("330"); 
    String message3 = "Hello how are you";
    String message4 = new String("330");
    
    if(message1.equals(message3)){
        System.out.println("Message 1 and 2 are equal");
    }
    else{
        System.out.println("They are not equal");
    }
    
    if(message2.equals(message4)){
        System.out.println("Message 1 and 2 are equal");
    }
    else{
        System.out.println("They are not equal");
    }
    
    
    String[] m1 = message1.split(",");
    int num1 = Integer.parseInt(message2);
    double num2 = Double.parseDouble(message4);
    System.out.println(num1+num2);
    
    //System.out.println(message1);
    //System.out.println(message2);
    
    System.out.println("message1 length: "+message1.length());

    for (int i=0; i<m1.length; i++){
        System.out.println(m1[i]);
    }
    System.out.println("---------");
    for (String value:m1){
        System.out.println(value);
    }
    }
}
