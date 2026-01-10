import java.util.*;

public class RedVersusBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            int rep = r / (b + 1);
            int mo = r % (b + 1);
            StringBuilder sb = new StringBuilder();
            while (r > 0 || b > 0) {
                int limit = Math.min(rep, r);
                for (int i = 0; i < limit; i++) {
                    sb.append('R');
                    r--;
                }
                if (mo > 0) {
                    sb.append('R');
                    mo--;
                    r--;
                }
                if (b > 0) {
                    sb.append('B');
                    b--;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
