import java.util.*;

public class SkiResort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            long res=0,cnt=0;
            for(int i:a){
                if(i<=q){
                    cnt++;
                    res+=Math.max(0L,cnt-k+1);
                }
                else{
                    cnt=0;
                }
            }
            System.out.println(res);
        }
    }
}
