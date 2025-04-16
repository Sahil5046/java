import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        StringBuilder s = new StringBuilder();
        String ss = "";

        // int ind = 0;
        int length = str.length();

        
        for(int i = 0; i < length; i++)
        {
            // StringBuilder st = new StringBuilder();
            Character ch = str.charAt(i);
            int count = 1;

            int sum = 0;

            while(i + 1 < length && Character.isDigit(str.charAt(i + 1)))
            {
                int digit = str.charAt(i + 1) - '0';
                sum = (sum * 10) + digit;
                i++;
            }

            if(sum > 1)
            {
                count = sum;
            }
            

            while(count > 0)
            {
                s.append(ch);
                count--;
            }

        }
        ss = s.toString();           
        
        System.out.println(ss);
        in.close();
    }
}
