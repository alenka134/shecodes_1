package DemoPack.Lesson10.Overriding.ObjectEqual;

public class AppPoint {
    public static void main(String[] args) {
        PointObject p1 = new PointObject(3.0,4.0);
        PointObject p2 = new PointObject(1.0,2.0);
        p1.equals(p2);
       // p1.x = 3.0;     //"y" we can not enter here because this variable is PRIVATE
        p1.setX(5.0);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getY());
    }
}
