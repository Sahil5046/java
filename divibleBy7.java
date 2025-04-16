import java.util.Scanner;



//without using % opretare
public class divibleBy7 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        // int temp = num;

        int last_digit = num - (num / 10) * 10;
        num /= 10;
        int mul = last_digit * 2;
        int sub = Math.abs(num - mul);

        int div = sub / 7;
        if(div * 7 == sub)
        {
            System.out.println("Divisible by 7");
        }
        else
        {
            System.out.println("Not divisible by 7");
        }
        in.close();
    }
}
