abstract class car
{
    public abstract void driver();
    public void playMusic()
    {
        System.out.println("Play Music.");
    }
    public abstract void fly();
}

abstract class BMW extends car{
    public void driver()
    {
        System.out.println("Driver ....");
    }
    // public abstract void fly();
}

class updatedBMW extends BMW{ //concret class
    public void fly()
    {
        System.out.println("Flying..");
    }
}


public class Abstract {
    public static void main(String[] args) {
        car obj = new updatedBMW();
        obj.driver();
        obj.playMusic();
        obj.fly();
    }
}
