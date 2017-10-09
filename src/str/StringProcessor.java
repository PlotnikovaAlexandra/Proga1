package str;

/**
 * Created by Student on 02.10.17.
 */
public class StringProcessor {


public static String CopyOfStr(int n,String str) throws IllegalArgumentException {
    String str1 =" ";
    if(n==0){
     return (str1);
    }else
    {  if(n>0){
        for(int i=0;i<n;i++){
        str1=str1+str;
    }
     return(str1);
              }
     else {
        throw new IllegalArgumentException();
    }
}

}
}
