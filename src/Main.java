/**
 * Created by Student on 04.09.17.
 */
import java.util.Scanner;
public class Main {
    public static void main (String [] args){


System.out.println("Hello world");
int sum, d;
        float srd;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
sum=a+b+c;
        srd=(float) sum/3;
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
