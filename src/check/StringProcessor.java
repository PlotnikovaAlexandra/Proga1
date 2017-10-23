


package check;
public class StringProcessor {


    public static String copyOfStr(int n,String str) throws IllegalArgumentException {
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
    public static int countOfRepeat (String str1, String str2) throws Exception {
        /*На входе две строки. Результат — количество вхождений второй строки в первую.*/
        int len1=str1.length();
        int len2=str2.length();
        if (len1<len2) {
            throw new Exception ();
        }
        int j=0, count=0;
        boolean flag;
        for (int i=0; i<len1; i++){
            if (j<len2 && str1.charAt(i)==str2.charAt(j)) {
                flag=true;
                j++;
            } else {
                flag=false;
                j=0;
            }
            if (j==len2 && flag==true) {
                count++;
                j=0;
            }
        }
        return  count;
    }
    public static String changeStr (String str1){
        String str2="";
        for (int i=0;i<str1.length();i++)
        {

            if (str1.charAt(i)=='1'){
                str2=str2+"один";
            } else
            if (str1.charAt(i)=='2'){
                str2=str2+"два";
            } else
            if (str1.charAt(i)=='3'){
                str2=str2+"три";
            } else {
                str2+=str1.charAt(i);
            }
        }
        return(str2);
    }
    public static StringBuilder change(StringBuilder str1){
        for (int i=1;i<str1.length();i=i+2){
            str1.deleteCharAt(i);
            i--;
        }
        return(str1);
    }
    public static StringBuilder replace(StringBuilder str1 ){
        String first="",last="";
        int indFirst=0,indLast=0;
        boolean flag=true;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' ')
            { flag=false;}else
            {
                first+=str1.charAt(i);
                str1.deleteCharAt(i);
                i--;//проверить это
            }
            if(flag==false&& first!=""){
                // indFirst=i+1;//проверить!!!
                break;
            }

        }
        for(int i=str1.length()-1;i>=0;i--){
            if(str1.charAt(i)!=' ')
            { flag=false;}else
            {
                last+=str1.charAt(i)+last;
                str1.deleteCharAt(i);
                i++;//проверить это
            }
            if(flag==false&& first!=""){
                // indLast=i+2;//проверить!!!
                break;
            }

        }
        str1.append(first);
        str1.insert(indLast,last);
        return(str1);
    }
    public static StringBuilder translateFrom16(StringBuilder str1){
        boolean flag=true;
        int s=0;
        long n=0;
        for(int i=0;i<str1.length()&& flag;i++){
            System.out.println(str1.charAt(i));
            if(str1.charAt(i)=='0'&& str1.charAt(i+1)=='x'){
                s=i;//запоминаем i
                System.out.println(str1.charAt(i+2));
                StringBuilder subStr=new StringBuilder();
                for(int j=i+2;j<i+10;j++){
                    subStr.append(str1.charAt(j));
                    System.out.println(subStr);
                }
                n=Integer.parseInt(subStr.toString(),16);
                str1.delete(s,s+10);
                str1.insert(s,n);
                //str1.append(n);
               flag=false;

            }
           // String g=Integer.toString(n);
           // str1.insert(s,g);
        }

        return(str1);
    }
}



