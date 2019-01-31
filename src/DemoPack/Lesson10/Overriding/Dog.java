package DemoPack.Lesson10.Overriding;

public class Dog extends Animal {

    @Override
    public void info(int number) {

        super.info(number);
        number = 0;

        System.out.println("Just now I have " + number + " dogs, but in our private house, we will have German Shepherd!!!");
    }
}
