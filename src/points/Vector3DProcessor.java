package points;

/**
 * Created by Student on 25.09.17.
 */

import points.Vector3D;
public class Vector3DProcessor {

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
