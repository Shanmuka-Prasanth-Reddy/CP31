import java.util.*;

public class LuntikAndSubsequnces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt0 = 0, cnt1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) cnt0++;
                if (a[i] == 1) cnt1++;
            }
            if (cnt1 == 0) {
                System.out.println(0);
            } else {
                long ans = (long) cnt1 * (1L << cnt0);
                System.out.println(ans);
            }
        }
    }
}
