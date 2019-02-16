package DemoPack.Lesson12.Abstract.Anonymous.ExampleAnonymous;

public abstract class Runnable {

    public void run(){
        System.out.println("Method 1 from abstract class: DON't run");
    }

    public void stop(){
        System.out.println("Method 2 from abstract class: RUN!!! ");
    }
}
