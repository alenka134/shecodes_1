package DemoPack.Lesson15.ThreadTest;

public class Rabbit implements Runnable {
    private String name;

public Rabbit(){
    this("Generic rabbit");
}
    public Rabbit(String name){
        this.name = name;
        System.out.println("Rabbit constructed: " + name);
    }

    @Override
    public void run() {
for(int i = 0; i < 5; i++){
    System.out.println(name + " is jumping...");
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }
}
