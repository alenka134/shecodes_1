package DemoPack.LearnJavaonline.bankdoor;

public class Door {
    private String name;

    public Door(String name){
        this.name = name;
    }

    public Door() {

    }

    public String getName() {
        return name;
   }



    public void open() {
        push();
    }

    private void push() {
        System.out.println("Push and open this door");
    }

    public void close() {
        lock();
    }

    private void lock() {
        System.out.println("This door closed for you");
    }

}
