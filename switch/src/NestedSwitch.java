import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        int empID = in.nextInt();
        System.out.print("Enter the department : ");
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Shruti");
            case 2 -> System.out.println("Raik");
            case 3 -> {
                System.out.println("Rahul");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("From Management");
                    default -> System.out.println("Not a department in our organization");
                }
            }
            default -> System.out.println("Enter a valid employee number.");
        }
    }
}
