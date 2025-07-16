import java.util.*;
public class OddQueries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            long pre[]=new long[n+1];
            pre[0]=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                pre[i+1]=a[i]+pre[i];
            }
            for(int i=0;i<q;i++){
                int l=sc.nextInt(),r=sc.nextInt(),k=sc.nextInt();
                long cur=pre[l-1]+pre[n]-pre[r];
                cur+=(1L*(r-l+1)*k);
                if(cur%2==1){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
