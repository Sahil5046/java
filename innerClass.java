class A
{
    public void show()
    {
        System.out.println("this is show..");
    }

    //inner class 
    //static class is only used in inner class.
    static class B
    {
        public void inner()
        {
            System.out.println("this is inner class....");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // obj.inner();

        A.B obj1 = new A.B();
        obj1.inner();
    }
}
