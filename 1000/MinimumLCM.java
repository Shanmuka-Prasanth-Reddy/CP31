import java.util.*;

public class MinimumLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 == 0) {
                System.out.println((n / 2) + " " + (n / 2));
            } 
            else {
                long bestDivisor = 1;
                for (long i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        bestDivisor = Math.max(bestDivisor, i);
                        bestDivisor = Math.max(bestDivisor, n / i);
                    }
                }
                System.out.println(bestDivisor + " " + (n - bestDivisor));
            }
        }
    }
}
