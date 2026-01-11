import java.util.*;

public class RoofConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();

            int p = 1;
            while ((p << 1) < n) {
                p <<= 1;
            }

            for (int i = p - 1; i >= 0; i--) {
                sb.append(i).append(" ");
            }

            for (int i = p; i < n; i++) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
