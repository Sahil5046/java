
// import java.net.SocketPermission;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num");
        n = input.nextInt();

        int sum = 0;
        int num = n;

        while (n > 0) {
            int rem = n % 10;
            sum = rem + (sum * 10);
            n = n / 10;
        }

        if (num == sum) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        input.close();
    }
}
