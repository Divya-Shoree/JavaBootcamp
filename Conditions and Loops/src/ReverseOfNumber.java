import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = 0;
        long reverse_num = 0;
        int ch = 0;
        while(ch == 0)
        {
            System.out.print("Enter a number to be reversed : ");
            num = in.nextLong();
            reverse_num = 0;
            while (num > 0) {
                reverse_num = (reverse_num * 10) + num % 10;
                num = num / 10;
            }
            System.out.println("Reversed number = " + reverse_num);
            System.out.print("Enter 0 to continue and 1 to quit : ");
            ch = in.nextInt();
        }
    }
}
