package DemoPack.Lesson10.Overriding.ObjectEqual;

public class PointObject {
   public double x;
   private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x1) {
        this.x = x1;
    }

    public void setY(double y1) {
        this.y = y1;
    }

    public PointObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {         //Method equals

        if (obj instanceof PointObject) {       //Verify that var obj is relevant to class PointObject
            if ((((PointObject) obj).x == this.x) && (((PointObject) obj).y == this.y)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

