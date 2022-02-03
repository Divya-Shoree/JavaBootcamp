import java.util.Scanner;

public class OccurrencesOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num;
        int find_num, count, rem ; //in.nextInt();
        int ch = 0;

        while(ch == 0){
            System.out.print("Enter a number of your choice : ");
            num = in.nextLong();
            System.out.print("Enter the number whose occurrence you want to find : ");
            find_num = in.nextInt();
            count = 0;
            rem = 0;

            while(num > 0)
            {
                rem = (int)(num % 10);
                //System.out.println("Number = " + num + "(int)num = " + (int)num + " remainder = " + rem);
                num = num/10;
                if(rem == find_num)
                    count++;
            }
            System.out.println(find_num + " has appeared " + count + " times");
            System.out.println("Enter 0 to continue and 1 to quit");
            ch = in.nextInt();
        }

    }
}
