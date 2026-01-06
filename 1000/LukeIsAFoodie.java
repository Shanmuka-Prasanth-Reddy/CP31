import java.util.*;
public class LukeIsAFoodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long ans = 0;
            long curL = arr[0] - x;
            long curR = arr[0] + x;
            for (int i = 1; i < n; i++) {
                long l2 = arr[i] - x;
                long r2 = arr[i] + x;
                if (curR < l2 || r2 < curL) {
                    ans++;
                    curL = l2;
                    curR = r2;
                }
                else {
                    curL = Math.max(curL, l2);
                    curR = Math.min(curR, r2);
                }
            }
            System.out.println(ans);
        }
    }
}
