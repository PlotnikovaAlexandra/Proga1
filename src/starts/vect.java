package starts;

/**
 * Created by Student on 25.09.17.
 */

import points.*;
import java.util.Scanner;

public class vect {
    public static void main(String[] args) throws BadArraySizeException {
        int n;
         do{ Scanner in = new Scanner(System.in);
            System.out.println("Enter size of array");
            n=in.nextInt();
        }while(n<=0);
        Vector3DArray t1=new Vector3DArray(n);
       System.out.println("length of array "+t1.lengthArray());
        t1.printAr();
        t1.rePlace(0, new Vector3D(1,5,6));
        t1.rePlace(1, new Vector3D(-2,0,0.5));

        t1.rePlace(2,new Vector3D(1.0,1.0,1.0));
        t1.printAr();
        System.out.println("length of max element "+t1.maxLengthVector());
        Vector3D v2=new Vector3D(2.0,1.0,1.0);
        if(t1.searchElem(v2)==-1){
            System.out.println("this vector is not found");
        }else{
            System.out.println("number this vector is"+t1.searchElem(v2) );
        }
        v2=t1.sumVect();
        v2.printVector();
        double [] b=new double [5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coefficients ");
        for (int i = 0; i < b.length; i++) {

            b[i] = in.nextInt();
        }
        in.close();
        Vector3D v3=new Vector3D();
        v3=t1.linComb(b);
        v3.printVector();
        Point3D points[]=t1.movPoint(new Point3D(1,1,1));
        System.out.println("Array of dots ");
        for(Point3D p:points) {
            System.out.println(p);
        }






    }
}
