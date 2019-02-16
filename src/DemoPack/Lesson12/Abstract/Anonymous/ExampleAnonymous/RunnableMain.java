package DemoPack.Lesson12.Abstract.Anonymous.ExampleAnonymous;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run");
            }
        };

        runnable.run();
        runnable.stop();

        System.out.println(runnable.getClass().toString()); //
    }

}
