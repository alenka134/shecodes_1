package DemoPack.Lesson15.ThreadTest.ProduceTread;

public class ThreadsExample implements Runnable {
    static int counter = 1; // a global counter

    static synchronized  void incrementCounter(){
        System.out.println(Thread.currentThread().getName() + ": " + counter);
        counter++;
    }

    @Override
    public void run() {
        while (counter < 1000){
            incrementCounter();
        }
    }

}
