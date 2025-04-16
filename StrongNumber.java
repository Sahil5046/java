import java.util.Scanner;

public class StrongNumber {

    public static int fac(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * fac(n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;
        int temp = num;

        while(num > 0)
        {
            int rem = num % 10;
            sum += fac(rem);
            num /= 10;
        }

        if(sum == temp)
        {
            System.out.println("This is a strong number.");
        }
        else
        {
            System.out.println("Not a strong number.");
        }

        in.close();
    }
}
