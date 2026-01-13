import java.util.*;
public class TriangleOnARectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long w = sc.nextLong();
            long h = sc.nextLong();
            long ans = 0;
            for (int i = 0; i < 2; i++) {
                int k = sc.nextInt();
                long first = sc.nextLong();
                long last = first;

                for (int j = 1; j < k; j++) {
                    last = sc.nextLong();
                }

                ans = Math.max(ans, (last - first) * h);
            }
            for (int i = 0; i < 2; i++) {
                int k = sc.nextInt();
                long first = sc.nextLong();
                long last = first;

                for (int j = 1; j < k; j++) {
                    last = sc.nextLong();
                }

                ans = Math.max(ans, (last - first) * w);
            }

            System.out.println(ans);
        }
    }
}
