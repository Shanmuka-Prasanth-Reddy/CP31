import java.util.*;
public class HalloumiBoxes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            int ans=0;
            for(int i=1;i<n;i++) {
                if(a[i-1]>a[i]){
                    ans=1;
                    break;
                }
            }
            if(ans==1) {
                System.out.println(k>1?"YES":"NO");
            }
           else {
                System.out.println("YES");
            }
        }
    }
}