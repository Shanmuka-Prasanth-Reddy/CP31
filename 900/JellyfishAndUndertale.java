import java.util.*;
public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            int n=sc.nextInt();
            long tools[]=new long[n];
            for(int i=0;i<n;i++) tools[i]=sc.nextLong();
            Arrays.sort(tools);
            long res=0;
            for(int i=0;i<n;i++){
                res+=(b-1);
                b=Math.min(a,tools[i]+1);
            }
            res+=b;
            System.out.println(res);
        }
    }
}
