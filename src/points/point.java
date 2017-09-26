package points;

/**
 * Created by Student on 25.09.17.
 */



class Point3D {
    private double x;
    private double y;
    private double z;

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



    public double getFirst() {
        return (x);
    }

    public double getSecond() {
        return (y);
    }

    public double getThird() {
        return (z);
    }

    public void setFirst(double a) {
        x = a;
    }

    public void setSecond(double b) {
        y = b;
    }

    public void setThird(double c) {
        z = c;
    }


    public boolean equalsDots(Point3D one) {
        if (this.getFirst() == one.getFirst() && this.getSecond() == one.getSecond() && this.getThird() == one.getThird()) {
            return (true);
        } else {
            return (false);
        }
    }

}



