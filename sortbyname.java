package codevita;
import cp.ArraysList;
import java.util.*;
public class sortbyname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.  of customer :");
        int n=sc.nextInt();
        String [][] matrix =new String[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.next();
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(matrix[i][1]);
        }
        Collections.sort(list);
        for(String i:list){
            for(int j=0;j<n;j++){
                if(matrix[j][1].equals(i)){
                    System.out.println(matrix[j][0]+" "+matrix[j][1]+" "+matrix[j][2]);
                    break;
                }
            }
        }

    }
}
