class add extends Thread
{
    int n1,n2;

    public add(int a, int b)
    {
        n1 = a;
        n2 = b;
    }

    public void run()
    {
        System.out.println((Thread.currentThread().getName()));
        System.out.println(n1 + n2);
    }
}

class sub extends Thread
{
    int n1,n2;

    public sub(int a, int b)
    {
        n1 = a;
        n2 = b;
    }

    public void run()
    {
        System.out.println((Thread.currentThread().getName()));
        System.out.println(n1 - n2);
    }
}

class mul extends Thread
{
    int n1,n2;

    public mul(int a, int b)
    {
        n1 = a;
        n2 = b;
    }

    public void run()
    {
        System.out.println((Thread.currentThread().getName()));
        System.out.println(n1 * n2);
    }
}

public class threaddemo {
    public static void main(String[] args) {
        add a = new add(5, 6);
        sub s = new sub(5, 2);
        mul m = new mul(4, 3);
        // a.start(); // start is able to the thread to run able mode
        // s.start();
        // m.start();
        a.run(); 
        s.run();
        m.run();
    }
}
