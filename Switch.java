import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // String n;

        int n;

        Scanner i = new Scanner(System.in);

        n = i.nextInt();

        // switch (n) {
        // case "mango":
        // System.out.println("This is a king.");
        // break;

        // case "orange":
        // System.out.println("Round shape.");
        // break;

        // default:
        // System.out.println("Enter a valid fruit.");
        // }

        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        i.close();
    }
}
