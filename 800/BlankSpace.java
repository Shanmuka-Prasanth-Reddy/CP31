import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int max=0,cur=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==0){
                    cur++;
                } else {
                    max=Math.max(max,cur);
                    cur=0;
                }
            }
            System.out.println(Math.max(max, cur));
        }
    }
}
