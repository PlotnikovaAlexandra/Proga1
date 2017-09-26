package points;

/**
 * Created by Student on 25.09.17.
 */

public class Vector3DArray {

    private Vector3D [] ar;

    public Vector3DArray(int t) throws BadArraySizeException {
        //    n=t;
        if(t<1){
            throw new BadArraySizeException();
        }
        ar = new Vector3D[t];
        for (int i = 0; i < ar.length; i++) {
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
        for (Vector3D anAr : ar) {/*
            buf=ar[i];
            System.out.print("ar["+i+"]=");
            buf.printVector();*/
            anAr.printVector();
        }
    }
    public int lengthArray(){
        return(ar.length);
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
        for(int i=1; i < ar.length; i++){
            Vector3D w=ar[i];
            double size=w.lengthVector(w);
            if(size>max){
                max=size;
            }
        }
        return(max);
    }
    public int searchElem(Vector3D vect){

        for(int i=0; i < ar.length; i++){

            if(vect.equals(ar[i])){
                return(i);
            }
        }
        return(-1);
    }
    public Vector3D sumVect(){
        Vector3D sumV=new Vector3D();
        for (Vector3D anAr : ar) {
            sumV = Vector3DProcessor.addition(sumV, anAr);
        }
        return(sumV);
    }
    public Vector3D linComb(double [] b){
        Vector3D linVect =new Vector3D();


        if (!(ar.length == b.length)) {
            return(new Vector3D());
        }else{
            // int size=b.length;

            for(int i=0;i<ar.length;i++){
                Vector3D temp=new Vector3D();
                temp=ar[i];
                Vector3D vect1=new Vector3D(b[i]*temp.getFirst(),b[i]*temp.getSecond(),b[i]*temp.getThird());
                linVect=Vector3DProcessor.addition(vect1,linVect);

            }
        }
        return(linVect);
    }
    public Point3D[] movPoint (Point3D dot){

        Point3D points[]=new Point3D[ar.length];
        for(int i=0;i<ar.length;i++){
            points[i] = dot.move(ar[i]);
        }
        return points;
    }
}
