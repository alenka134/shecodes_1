package DemoPack.Lesson15.ThreadTest.ProduceTread;

public class Main {
    public static void main(String[] args) {
        ThreadsExample te = new ThreadsExample();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);

        thread1.start();
        thread2.start();
    }
}
