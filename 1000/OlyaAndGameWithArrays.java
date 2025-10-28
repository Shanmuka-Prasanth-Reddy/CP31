import java.util.*;

public class OlyaAndGameWithArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int m=sc.nextInt();
            long res=0,min=Long.MAX_VALUE,rem=Long.MAX_VALUE;
            while (m-->0) {
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++) a[i]=sc.nextInt();
                Arrays.sort(a);
                rem=Math.min(rem,a[1]);
                min=Math.min(a[0],min);
                res+=a[1];
            }
            res+=min-rem;
            System.out.println(res);
        }
    }
}
