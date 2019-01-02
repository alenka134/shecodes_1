package DemoPack;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Point Scala() {

        return new Point(x = x / 2, y = y / 2);
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}




