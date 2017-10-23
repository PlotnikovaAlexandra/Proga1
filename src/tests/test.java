package tests;


import check.StringProcessor;

/**
 * Created by Сандра on 24.10.2017.
 */
public class test {
public static void main (String [] args){
    StringBuilder str1=new StringBuilder("Васе 0x00000010 лет");
    StringBuilder str2=new StringBuilder();
    str2=StringProcessor.translateFrom16(str1);
    System.out.println(str2);
}
}
