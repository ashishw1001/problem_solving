package codevita;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []strarr=s.split(" ");
        int []arr=new int[strarr.length];
        for(int i=0;i<strarr.length;i++){
            arr[i]=Integer.parseInt(strarr[i]);
        }
        Arrays.sort(arr);
        int num=LCM(arr,1);
        if(isPrime(num + arr[0])) {
            System.out.println(num + arr[0]);
        }
        else{
            System.out.println("None");
        }


    }
    static int gcd(int a, int b)
    {
        return b == 0? a:gcd(b, a % b);
    }
    public  static int LCM(int[] arr, int idx)
    {
        if (idx == arr.length - 1){
            return arr[idx];
        }
        int a = arr[idx];
        int b = LCM(arr, idx+1);
        return (a*b/gcd(a,b));
    }
    public  static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

}
