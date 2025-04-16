class A
{
    public void show()
    {
        System.out.println("This is A show");
    }
}

class B extends A{
    public void show()
    {
        System.out.println("This is B show.");
    }
}


public class upcasting {
    // private static String[] args;

    public static void main(String[] args) {
        //upcasting
        // double a = 5.4;
        // int b = (int) a;
        // System.out.println(b);

        // upcasting.args = args;
        A obj = new A();
        obj.show();

        
        obj = (A) new B();
        obj.show();
    }
}
