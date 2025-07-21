import java.util.*;
public class MainakAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(0);
            } else {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] >= max) {
                        max = a[i];
                    }
                    if (a[i] <= min) {
                        min = a[i];
                    }
                }
                int ans1 = max - a[0];
                int ans2 = a[n - 1] - min;
                int ans = Math.max(ans2, ans1);

                for (int i = 0; i < n - 1; i++) {
                    int diff = a[i] - a[i + 1];
                    ans = Math.max(ans, diff);
                }
                System.out.println(ans);
            }
        }
    }
}