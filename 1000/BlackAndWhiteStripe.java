import java.util.*;

public class BlackAndWhiteStripe {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            char c[]=sc.next().toCharArray();
            int b=0,w=0;
            for(int i=0;i<k-1;i++){
                if(c[i]=='B') b++;
                else w++;
            }
            int res=n+1;
            for(int i=k-1;i<n;i++){
                if(c[i]=='B') b++;
                else w++;
                res=Math.min(res,w);
                if(c[i-k+1]=='B') b--;
                else w--;
            }
            System.out.println(res);
        }
    }
}
