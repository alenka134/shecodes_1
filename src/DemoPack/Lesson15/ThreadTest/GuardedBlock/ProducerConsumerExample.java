package DemoPack.Lesson15.ThreadTest.GuardedBlock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ProducerConsumerExample {
    public static void main(String[] args) {

        BlockingQueue<String> drop = new SynchronousQueue<>();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
