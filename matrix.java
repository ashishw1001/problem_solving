package codevita;

import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String [][]matrix=new String[r][c];
        List<String>list=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.next();
            }
        }
        for(int i=0;i<r;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    list.add(matrix[i][j]);
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    list.add(matrix[i][j]);
                }
            }
        }
        int rotattion=sc.nextInt();
        String tofind=sc.next();
        Collections.rotate(list,rotattion);
        List<Integer>ans=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        int p=0;
        for(int i=0;i<r;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                   matrix[i][j]=list.get(p++);
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    matrix[i][j]=list.get(p++);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
                if(matrix[i][j].equals(tofind)){
                    ans.add(i);
                    ans.add(j);
                }
            }
            System.out.println();
        }
        System.out.println(ans);
    }
}
