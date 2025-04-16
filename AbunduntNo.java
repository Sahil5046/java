import java.util.Scanner;

public class AbunduntNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }

        if(sum > n)
        {
            System.out.println("This number is abundunt number");
        }
        else
        {
            System.out.println("This number is not abundunt number");
        }
        in.close();
    }
}
