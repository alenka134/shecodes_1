package DemoPack.Lesson10.Overriding;

public class AppAnimals {
    public static void main(String[] args) {

        Animal cat = new Cat();
        printInfo(cat);

        Animal dog = new Dog();
        printInfo(dog);
    }

    public static void printInfo(Animal pet) {
        pet.info(5);
    }
}

