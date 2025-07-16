import java.util.*;
public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(),c=0,f=0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]==2) c++;
            }
            if(c%2==1) System.out.println(-1);
            else{
                int i=0;
                while(f!=c/2){
                    if(a[i]==2) f++;
                    i++;
                }
                System.out.println(i==0?1:i);
            }
        }
    }
}