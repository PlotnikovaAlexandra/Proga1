package starts;

import points.Vector3D;
import points.Vector3DProcessor;


/**
 * Created by Student on 25.09.17.
 */
public class test1 {
    public static  void main(String[] args) {
        double sc;
        boolean pos;
        Vector3D a=new Vector3D(1,2,3);
        Vector3D b=new Vector3D(1,0,3);
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

        if (Vector3DProcessor.collinearVector(a,b)){
            System.out.println("vectors are collinear");
        }else{
            System.out.println("vectors are not collinear");
        }


    }
}
