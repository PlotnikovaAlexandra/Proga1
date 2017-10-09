package starts;
import str.StringProcessor;
import java.util.Scanner;
/**
 * Created by Student on 02.10.17.
 */
public class check {
    public static  void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of repeat");
        n=in.nextInt();
        System.out.println("Enter text");
        String str= " ";
        in.nextLine();
        str=in.nextLine();
        String str1=StringProcessor.CopyOfStr(n,str);
        System.out.println(str1);


    }
}

