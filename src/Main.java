/**
 * Created by Student on 04.09.17.
 */
import java.util.Scanner;
public class Main {
    public static void main (String [] args){


System.out.println("Hello world");

        float  d;
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float x1, x2;
        d=(float)(b*b-4*a*c);
        if (a==b && a==c && a==0){
            System.out.print ("Бесконечное множество");}
            else {
       if (d>0) {
        System.out.print ("2 корня   ");
       x1=(-b+(float)Math.sqrt (d))/2/a;
           x2=(-b-(float)Math.sqrt (d))/2/a;
           System.out.print (x1 +"    "+ x2);
       }
        else
       if (d==0) {
        System.out.print ("1 корень   ");
       x1=-b/2/a;
           System.out.print (x1);
       }
        else
        System.out.print ("нет корней");

        }
        in.close();//рассмотреть случай, когда не квадратное
    }

}
