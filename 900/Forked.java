import java.util.*;
public class Forked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();
            int[][] king = { { xk - a, yk - b }, { xk - b, yk - a }, { xk - a, yk + b }, { xk - b, yk + a },
                    { xk + a, yk - b }, { xk + b, yk - a }, { xk + a, yk + b }, { xk + b, yk + a } };
            int[][] queen = { { xq - a, yq - b }, { xq - b, yq - a }, { xq - a, yq + b }, { xq - b, yq + a },
                    { xq + a, yq - b }, { xq + b, yq - a }, { xq + a, yq + b }, { xq + b, yq + a } };
            int ans = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (king[i][0] == queen[j][0] && king[i][1] == queen[j][1]) {
                        ans++;
                    }
                }
            }
            if (a == b) {
                ans /= 4;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}