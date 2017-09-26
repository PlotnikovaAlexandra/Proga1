package points;

 import points.*;
class Vector3D {
    public double x;
    public  double y;
    public  double z;

    public void printVector() {

        System.out.print("vector"  + "(" + x + ", " + y + ", " + z + ")");
        System.out.println();
    }

    public Vector3D() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public Vector3D(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }
    public Vector3D(Point3D a,Point3D b) {
        x = (b.getFirst()-a.getFirst());
        y = (b.getSecond()-a.getSecond());
        z = (b.getThird()-a.getThird());
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
    public double lengthVector(Vector3D a){
        double x=a.getFirst();
        double y=a.getSecond();
        double z=a.getThird();
        double l=Math.sqrt(x*x+y*y+z*z);
        return(l);

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3D)) return false;

        Vector3D vector3D = (Vector3D) o;

        if (Double.compare(vector3D.x, x) != 0) return false;
        if (Double.compare(vector3D.y, y) != 0) return false;
        if (Double.compare(vector3D.z, z) != 0) return false;

        return true;
    }


}




