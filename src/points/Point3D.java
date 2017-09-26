package points;

/**
 * Created by Student on 25.09.17.
 */



public class Point3D {
    private double x;
    private double y;
    private double z;

    @Override
    public String toString(){
        return "(" + x + ", " + y + ", " + z + ")" ;
    }

    public void printDot() {
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        System.out.print("dot"  + "(" + x + " " + y + " " + z + ")");
    }

    public Point3D() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public Point3D(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }



    public double getX() {
        return (x);
    }

    public double getY() {
        return (y);
    }

    public double getZ() {
        return (z);
    }

    public void setX(double a) {
        x = a;
    }

    public void setY(double b) {
        y = b;
    }

    public void setZ(double c) {
        z = c;
    }


    public boolean equalsDots(Point3D one) {
        return (this.getX() == one.getX() && this.getY() == one.getY() && this.getZ() == one.getZ());
    }

    public Point3D move(Vector3D d) {
        return new Point3D(this.getX()+ d.getFirst(),this.getY()+d.getSecond(),this.getZ()+d.getThird());
    }
}



