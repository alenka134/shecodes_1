package DemoPack;

public class StartingPoint {
    public static void main(String[] args) {

        Cat bandit = new Cat("Bandit");
        Cat beauty = new Cat("Beauty");

        bandit.printName();
        beauty.printName();
        bandit.meow();
        beauty.meow();
    }
}
