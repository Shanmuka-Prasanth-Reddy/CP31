import java.util.*;
public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            boolean np = false;
            int ans = 0;
            for (int i = n - 1; i >= 1; i--) {
                while (a[i - 1] >= a[i]) {
                    if (a[i - 1] == 0) {
                        np = true;
                        break;
                    }
                    a[i - 1] /= 2;
                    ans++;
                }
                if (np) {
                    break;
                }
            }
            if (np) {
                System.out.println(-1);
            } else
                System.out.println(ans);
        }
        sc.close();
    }
}