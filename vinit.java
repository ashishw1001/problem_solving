package codevita;

import java.util.*;
public class vinit {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> lx = new ArrayList<>();
        List<Integer> ly = new ArrayList<>();
        int cou=0;
        for (int i = 0; i < n; i++) lx.add(sc.nextInt());
        for (int i = 0; i < n; i++) ly.add(sc.nextInt());

        Collections.sort(ly);
        Collections.sort(lx);
        Collections.reverse(lx);
        for(int i=0;i<x;i++){
            cou+=lx.get(i);
        }
        Collections.reverse(lx);
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cou-=lx.get(i);
            cou+=ly.get(i);
            mx=Math.max(mx,cou);
        }
        System.out.println(mx);
    }
}
