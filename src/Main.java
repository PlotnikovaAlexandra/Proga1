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
        float h = in.nextFloat();
if (a<=b)
{
for (float i=a; i<=b; i+=h )
{
    d=(float) Math.sin (i);

        System.out.println ("sin ("+i+")="+d );
}
    }//дописать вывод
    }
}
