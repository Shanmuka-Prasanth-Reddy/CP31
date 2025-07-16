import java.util.*;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int x=1;
            while(x*10<=n){
                x*=10;
            }
            int res=0;
            while(x>0){
                res+=(n/x);
                n=x-1;
                x/=10;
            }
            System.out.println(res);
        }
    }
}
