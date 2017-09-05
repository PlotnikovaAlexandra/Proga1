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

        d=(float)(b*b-4*a*c);
       if (d>0)
        System.out.print ("2 корня");
        else
       if (d==0)
        System.out.print ("1 корень");
        else
        System.out.print ("нет корней");

    }

}
