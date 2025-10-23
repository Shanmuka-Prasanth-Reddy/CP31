import java.util.*;

public class ArrayCloningTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                freq.put(a, freq.getOrDefault(a, 0) + 1);
            }
            int maxFreq = 0;
            for (int f : freq.values()) {
                maxFreq = Math.max(maxFreq, f);
            }
            if (maxFreq == n) {
                System.out.println(0);
                continue;
            }
            int ops = 0;
            int curr = maxFreq;
            while (curr < n) {
                ops++; // cloning
                int add = Math.min(curr, n - curr);
                curr += add; // swaps to add more equal elements
                ops += add;
            }
            System.out.println(ops);
        }
    }
}
