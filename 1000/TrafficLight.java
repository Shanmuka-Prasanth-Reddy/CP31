import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            if (c == 'g') {
                System.out.println(0);
                continue;
            }

            String doubled = s + s;
            int nextGreen = -1;
            int ans = 0;

            for (int i = 2 * n - 1; i >= 0; i--) {
                if (doubled.charAt(i) == 'g') {
                    nextGreen = i;
                }
                if (doubled.charAt(i) == c && i < n && nextGreen != -1) {
                    ans = Math.max(ans, nextGreen - i);
                }
            }

            System.out.println(ans);
        }
    }
}
