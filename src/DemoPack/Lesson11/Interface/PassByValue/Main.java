package DemoPack.Lesson11.Interface.PassByValue;

public class Main {
    public static void main(String[] args) {

        int iceCreamBalls = 2;
        IceCream myIceCream = new IceCream("Vanilla");
        System.out.println("#1 main >> " + iceCreamBalls + " " + myIceCream);
        addIceCreamBall(iceCreamBalls);
        changeFlavor(myIceCream);
        System.out.println("#2 main >> " + iceCreamBalls);
    }

    public static void addIceCreamBall(int iceCreamBalls){
        System.out.println("#1 method >> " + iceCreamBalls);

        iceCreamBalls = iceCreamBalls + 1;
        System.out.println("#2 method >> " + iceCreamBalls);
    }
    public static void changeFlavor(IceCream iceCream){
        System.out.println("#1 method >> " + iceCream);
        iceCream = new IceCream("Passion fruit");
        System.out.println("#2 method >> " + iceCream);
    }
}
