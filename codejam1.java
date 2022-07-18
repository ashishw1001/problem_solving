package codevita;
import  java.util.*;
public class codejam1 {
    public static int calling(ArrayDeque<Integer> dq){
        int ans=0;
        int ele=0;
        int f=0,l=dq.size();
        while(dq.size()!=0){
            if(dq.getFirst()<=dq.getLast()){
                if(dq.getFirst()>=ele) ans++;
                ele=Math.max(dq.getFirst(),ele);
                dq.removeFirst();
            }
            else{
                if(dq.getLast()>=ele){
                    ans++;
                }
                ele=Math.max(dq.getLast(),ele);
                dq.removeLast();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayDeque<Integer> dq= new ArrayDeque<Integer>(n);
            for(int j=0;j<n;j++){
                dq.add(sc.nextInt());
            }
            System.out.println("Case #" + i+": " + calling(dq));
            dq.clear();
        }
    }
}
