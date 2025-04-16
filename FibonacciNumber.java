import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = input.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++)
        {
            int c = a + b;
            a = b; 
            b = c;
        }
        System.out.println(b);
        input.close();
    }
}
