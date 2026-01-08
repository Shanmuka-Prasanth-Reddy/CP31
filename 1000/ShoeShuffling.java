import java.util.*;

public class ShoeShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }
            int[] p = new int[n];
            boolean possible = true;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && s[j] == s[i]) {
                    j++;
                }
                int len = j - i;
                if (len == 1) {
                    possible = false;
                    break;
                }
                for (int k = i; k < j; k++) {
                    if (k + 1 < j)
                        p[k] = k + 2;
                    else
                        p[k] = i + 1;
                }
                i = j;
            }

            if (!possible) {
                System.out.println(-1);
            } else {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
