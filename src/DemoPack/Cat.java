package DemoPack;

public class Cat {

    String name;

    Cat(String n) {
        name = n;
    }

    void printName() {
        System.out.println(name);
    }

    void meow() {
        System.out.println(String.format("%s: Meow-meow ", name));
    }

}

