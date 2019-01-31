package DemoPack.Lesson10.Overriding;

public class Cat extends Animal {
    @Override
    public void info(int number) {
       super.info(number);
        number = 2;

        System.out.println("I have " + number + " cats");
    }
}
