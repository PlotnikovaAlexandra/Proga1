package points;
import points.*;

/**
 * Created by Сандра on 24.09.2017.
 */
import java.util.Scanner;
 class Vector3DArray {
    private int n;
    private Vector3D [] ar;

    public Vector3DArray(int t){
         n=t;
        ar = new Vector3D[t];
        for (int i = 0; i < t; i++) {
            ar[i] = new Vector3D();
        }

    }
   /* public Vector3DArray(Vector3DArray  a){

        for (int i = 0; i < n; i++) {
           this.ar[i] =a.ar[i];
            System.out.println("be");
        }
    }*/
    public void printAr(){
        Vector3D buf=new Vector3D();
        for(int i=0;i<n;i++)
        {


            buf=ar[i];
            System.out.print("ar["+i+"]=");
            buf.printVector();


        }
    }
    public int lengthArray(){
        return(n);
    }
    public Vector3D getAr(int i){return ar[i];}
    public void rePlace(int i,Vector3D vect){
        ar[i]=vect;
    }
    public void move(int i,Vector3D a ){
        ar[i]=a;

   }
    public double maxLengthVector(){

        Vector3D e=ar[0];
        double max=e.lengthVector(e);
         for(int i=1;i<n;i++){
            Vector3D w=ar[i];
            double size=w.lengthVector(w);
            if(size>max){
                max=size;
            }
        }
        return(max);
    }
    public int searchElem(Vector3D vect){
        boolean test;
        for(int i=0;i<n;i++){
            test=vect.equals(ar[i]);
            if(test==true){
                return(i);
            }
        }
        return(-1);
    }
    public Vector3D sumVect(){
        Vector3D sumV=new Vector3D();
        for(int i=0;i<n;i++){
            sumV=Vector3DProcessor.addition(sumV,ar[i]);
        }
        return(sumV);
    }
    public Vector3D linComb(double [] b){
        Vector3D linVect =new Vector3D();


        if(n> b.length || n<b.length){
            Vector3D vect =new Vector3D();
        return(vect);
        }else{
           // int size=b.length;

            for(int i=0;i<n;i++){
               Vector3D temp=new Vector3D();
               temp=ar[i];
                Vector3D vect1=new Vector3D(b[i]*temp.getFirst(),b[i]*temp.getSecond(),b[i]*temp.getThird());
                linVect=Vector3DProcessor.addition(vect1,linVect);

            }
        }
        return(linVect);
    }
    public void movPoint (Point3D dot){

        for(int i=0;i<n;i++){
            Vector3D temp=new Vector3D();
            temp=this.ar[i];
            Vector3D point=new Vector3D(dot.getFirst()+temp.getFirst(),dot.getSecond()+temp.getSecond(),dot.getThird()+temp.getThird());
            this.move(i,point);
        }
    }
}
public class vect {
    public static void main(String[] args) {
     int lengthAr,n,numEl;
     double max;
do{ Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array");
    n=in.nextInt();
}while(n<=0);
        Vector3DArray t1=new Vector3DArray(n);
        lengthAr=t1.lengthArray();
        System.out.println("length of array "+lengthAr);
        t1.printAr();
        Vector3D v1=new Vector3D(1.0,1.0,1.0);
        t1.rePlace(2,v1);
        t1.printAr();
        max=t1.maxLengthVector();
        System.out.println("length of max element "+max);
        Vector3D v2=new Vector3D(2.0,1.0,1.0);
        numEl=t1.searchElem(v2);
        if(numEl==-1){
            System.out.println("this vector is not found");
        }else{
            System.out.println("number this vector is"+numEl );
        }
        v2=t1.sumVect();
        v2.printVector();
       double [] b=new double [5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {

            b[i] = in.nextInt();
        }
        Vector3D v3=new Vector3D(1.0,1.0,1.0);
        v3=t1.linComb(b);
        v3.printVector();
      // Vector3DArray t2=new Vector3DArray(t1);
        //System.out.println("be");
        //t2.printAr();
Point3D dot=new Point3D(1,1,1);
        t1.movPoint(dot);
        System.out.println("Array of dots ");
        t1.printAr();






       }
   }
