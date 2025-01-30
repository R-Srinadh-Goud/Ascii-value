import java.util.Scanner;

public class Ascii_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        /*in.next() which reads the input as a string.
               .charAt(0) is extracts the first character from the string and stores it in ch which is used to convert as ascii value */
        System.out.println("ASCII Value: " + (int) ch);//(int) ch, is converts the character to a ASCII value.
        
        in.close();
    }
}
