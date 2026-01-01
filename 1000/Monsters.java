import java.util.*;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[][] arr = new long[n][];
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                arr[i] = new long[]{a%k==0?k:a%k, i + 1};
            }
            Arrays.sort(arr, (x, y) -> {
                if (x[0] == y[0]) return Long.compare(x[1], y[1]);
                return Long.compare(y[0], x[0]);
            });

            for (long[] monster : arr) {
                System.out.print(monster[1] + " ");
            }
            System.out.println();
        }
    }
}
