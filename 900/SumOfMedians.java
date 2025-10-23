import java.util.*;
public class SumOfMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int size = n * k;
            int a[] = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            long max_sum = 0;
            if (n == 2) {
                for (int i = 0; i < size; i += 2) {
                    max_sum += a[i];
                }
            } else {
                int medianOfk = n / 2;
                if (n % 2 == 0) {
                    medianOfk--;
                }
                int gap = n - medianOfk;
                int idx = size - gap;
                for (int i = 1; i <= k; i++) {
                    max_sum += a[idx];
                    idx -= gap;
                }
            }
            System.out.println(max_sum);
        }
        sc.close();
    }
}
