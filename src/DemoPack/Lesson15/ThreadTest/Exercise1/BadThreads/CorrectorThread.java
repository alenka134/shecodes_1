package DemoPack.Lesson15.ThreadTest.Exercise1.BadThreads;

public class CorrectorThread extends  Thread{
    public void start() {
        String message = "Mares do not eat oats.";
        try {
            Thread.sleep(1000);
            throw new InterruptedException();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(message);
        }
    }

}
