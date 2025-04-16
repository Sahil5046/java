// class MyThread1 extends Thread
// {
//     public void run()
//     {
//         int i = 1;
//         while(i <= 5)
//         {
//             System.out.println("Thread1..");
//             i++;
//         }
//     }
// }

// class MyThread2 extends Thread
// {
//     public void run()
//     {
//         int i = 1;
//         while(i <= 5)
//         {
//             System.out.println("Thread2..");
//             i++;
//         }
//     }
// }

class MyThread1 implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is a thread1....");
        }
    }
}

class MyThread2 implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is a thread2....");
        }
    }
}


class demothread
{
    public static void main(String[] args) {
        // MyThread1 t1 = new MyThread1();
        // MyThread2 t2 = new MyThread2();
        // t1.run();
        // t2.run();


        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}