package codevita;

import java.util.Scanner;

public class gauri1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s="ashish";
       String s3="ASHISH";
        s=s.replace('6','2');
        System.out.println(s.equals(s3));
    }
    static String fun(String s){
        return s+"asd";
    }
}
