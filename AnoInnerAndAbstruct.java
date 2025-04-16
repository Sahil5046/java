abstract class car
{
    public abstract void show();
    public abstract void config();
}

public class AnoInnerAndAbstruct {
    public static void main(String[] args) {
        car obj = new car() {
            public void show()
            {
                System.out.println("in main show");
            }
            public void config()
            {
                System.out.println("in main config.");
            }
        };

        obj.show();
        obj.config();
    }
}
