class a{
    public void show()
    {
        System.out.println("in a show.");
    }

    public void add(int n, int m)
    {
        System.out.println(n + m);
    }
}

class b extends a
{
    //if we use final keyward in parent class then we can not access the the function.
    // show() in b cannot override show() in a
//     public void show()
//                 ^
//   overridden method is final
    public void show()
    {
        System.out.println("in b show.");
    }

    public void sub(int n, int m)
    {
        System.out.println(n - m);
    }
}

public class final_keyword {
    public static void main(String[] args) {
        // final int n = 8;
        // n = 9; //cannot assign a value to final variable n
        // System.out.println(n);

        a obj = new a();
        obj.show();
        obj.add(5, 6);

        b obj1 = new b();
        obj1.show();
        obj1.sub(10, 6);
    }
}
