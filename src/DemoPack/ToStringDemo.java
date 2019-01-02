package DemoPack;

public class ToStringDemo {

    public static void main(String args[]) {
        PointCoordinates point = new PointCoordinates(10, 10);
        System.out.println(point);
        String s = point + " testing";
        System.out.println(s);
    }
}

