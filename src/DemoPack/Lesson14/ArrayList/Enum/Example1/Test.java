package DemoPack.Lesson14.ArrayList.Enum.Example1;

public class Test {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.FALL);

        //Optimization of print of enum with loop and method - values()
        for (Seasons s: Seasons.values()){

            System.out.println("\n" + s);
        }

        //use switch-case "If the season is FALL , print case Fall"
        System.out.println("\n********");
        Seasons arg = Seasons.FALL;

        switch (arg){
            case WINTER:
                System.out.println("It's winter! Christmas time!");
            case SPRING:
                System.out.println("It's spring! Vacation time!");
            case SUMMER:
                System.out.println("It's summer! Hot time");
            case FALL:
                System.out.println("It's fall! Halloween time");
        }
    }
}
