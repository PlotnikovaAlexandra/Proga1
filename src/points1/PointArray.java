package points;

/**
 * Created by Сандра on 25.09.2017.
 */
public class PointArray{
 private int n;
 private Point3D []arr;
    public PointArray (int num){
        n=num;
        arr=new Point3D[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point3D();
        }
    }
    public  void setAr(int i ,Point3D p){
        arr[i]=p;

    }
}
