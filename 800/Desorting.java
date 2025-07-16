import java.util.*;
public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int min= Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                min= Math.min(min, a[i]-a[i-1]);
            }
            System.out.println(min<0?0:min/2+1);
        }
    }
}
