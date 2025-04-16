class name
{
    public void show()
    {
        System.out.println("in name show.");
    }
}

public class AnonymasInner {
    public static void main(String[] args) {
        name obj = new name(){
            public void show()
            {
                System.out.println("in main show...");
            }
        };
        obj.show();
    }
}
