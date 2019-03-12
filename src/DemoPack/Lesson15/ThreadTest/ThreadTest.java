package DemoPack.Lesson15.ThreadTest;

public class ThreadTest {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();
        Rabbit r2 = new Rabbit("Peter");
        Rabbit r3 = new Rabbit("Bunny rabbit");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        r1.run();
        r2.run();
        r3.run();
        System.out.println("*********\n");
        t1.start();
        t2.start();
        t3.start();

    }
}
