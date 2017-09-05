/**
 * Created by Student on 04.09.17.
 */
import java.util.Scanner;
public class Main {
    public static void main (String [] args){


System.out.println("Hello world");
float sum, srd, d;
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
sum=a+b+c;
        srd=sum/3;
        while (b>a || c>a ||c>b) {
        if (b>a) {
            d=a;
            a=b;
            b=d;
        }
            if (c>a) {
                d=a;
                a=c;
                c=d;
            }
            if (c>b) {
                d=b;
                b=c;
                c=d;
            }
        }
        System.out.println ("Sum");
        System.out.println (sum );
        System.out.println ("Sre" );
        System.out.println (srd );
        System.out.println ("Chis" );
        System.out.print (c);
        System.out.print ("   ");
        System.out.print (b);
        System.out.print ("   ");
        System.out.print (a);
    }

}
