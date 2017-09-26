package points;
/**  */
import points.Vector3D;
class Vector3DProcessor {

    public static  Vector3D difference(Vector3D v1, Vector3D v2) {
        double a = v1.getFirst() - v2.getFirst();
        double b = v1.getSecond() - v2.getSecond();
        double c = v1.getThird() - v2.getThird();
        Vector3D q1 = new Vector3D (a, b, c);
       // Vector3DProcessor q2=new Vector3DProcessor(q1);
        return (q1);

    }

    public static Vector3D addition (Vector3D v1, Vector3D v2) {
        double a = v1.getFirst() + v2.getFirst();
        double b = v1.getSecond() + v2.getSecond();
        double c = v1.getThird() + v2.getThird();
        Vector3D q1 = new Vector3D (a, b, c);

        return (q1);

    }

    public static double scalarProduct(Vector3D v1, Vector3D v2) {

        double a = (v1.getFirst() * v2.getFirst() + v1.getSecond() * v2.getSecond() + v1.getThird() * v2.getThird());
        return (a);

    }

    public static Vector3D vectorProduct(Vector3D v1,Vector3D v2) {
        double a = (v1.getSecond() * v2.getThird() - v1.getThird() * v2.getSecond());
        double b = - (v1.getFirst() * v2.getThird() - v2.getFirst() * v1.getThird());
        double c = (v1.getFirst() * v2.getSecond() - v2.getFirst() * v1.getSecond());
        Vector3D q1 = new Vector3D (a, b, c);

        return (q1);

    }

    public static boolean collinearVector(Vector3D v1,Vector3D v2) {
        double a1 = v1.getFirst();
        double a2 = v2.getFirst();
        double b1 = v1.getSecond();
        double b2 = v2.getSecond();
        double c1 = v1.getThird();
        double c2 = v2.getThird();

        if ((a1 * b2 == a2 * b1) && (b2 * c1 == b1 * c2) && (a1 * c2 == a2 * c1)) {
            return (true);
        } else {
            return (false);
        }

    }

    /*public static Vector3D multiNum(double num,Vector3D vect){
        Vector3D q1=new Vector3D();

    }*/
}

public class test1 {
    public static  void main(String[] args) {
        double sc;
        boolean pos;
        Vector3D a=new Vector3D(1,2,3);
        Vector3D b=new Vector3D(1,2,3);
        Vector3D c= new Vector3D();
        Vector3D d= new Vector3D();
        Vector3D e= new Vector3D();
       c= Vector3DProcessor.difference(a,b);
      c.printVector();
        d=Vector3DProcessor.addition(a,b);
        d.printVector();
        e=Vector3DProcessor.vectorProduct(a,b);
        e.printVector();
        sc=Vector3DProcessor.scalarProduct(a,b);
        System.out.println("scalar product is "+sc);
        pos=Vector3DProcessor.collinearVector(a,b);
        if (pos==true){
            System.out.println("vectors are collinear");
        }else{
            System.out.println("vectors are not collinear");
        }


    }
}