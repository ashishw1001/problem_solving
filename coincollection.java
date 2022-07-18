package codevita;
import java.util.*;
public class coincollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=r;
        char [][]matrix=new char[r][c];
        for(int i=0;i<r;i++){
            String s=sc.next();
            char []carr=s.toCharArray();
            for(int j=0;j<carr.length;j++){
                matrix[i][j]=carr[j];
            }
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]=='C'){
                    list.add(countit(matrix,i,j));
                }
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        int grp1=0;
        int grp2=0;
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                grp1+=list.get(i);
            }
            else{
                grp2+=list.get(i);
            }
        }
        System.out.println(grp1+" "+grp2);

    }
    public static int countit(char [][] matrix,int st,int ed){
        int ans=1;
        matrix[st][ed]='N';
        for(int i=st+1;i<matrix.length;i++){
            if(matrix[i][ed]=='N') break;
            else ans=ans+countit(matrix,i,ed);
        }
        for(int i=st-1;i>=0;i--){
            if(matrix[i][ed]=='N') break;
            else ans=ans+countit(matrix,i,ed);
        }
        for(int i=ed+1;i<matrix[0].length;i++){
            if(matrix[st][i]=='N') break;
            else ans=ans+countit(matrix,st,i);
        }
        for(int i=ed-1;i>=0;i--){
            if(matrix[st][i]=='N') break;
            else ans=ans+countit(matrix,st,i);
        }
        return ans;
    }
}
