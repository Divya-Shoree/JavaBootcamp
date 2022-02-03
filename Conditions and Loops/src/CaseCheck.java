import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        //System.out.println(in.next());
        // Check if the character entered is uppercase or lowercase
        if(ch >= 'a' && ch <= 'z')
            System.out.println("Character entered is lowercase.");
        else if(ch >= 'A' && ch <= 'Z')
            System.out.println("Character entered is uppercase.");
        else
            System.out.println("Character entered is not an alphabet.");
    }
}
