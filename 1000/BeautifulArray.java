import java.util.*;

public class BeautifulArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();
            long s = sc.nextLong();
            long[] b = new long[(int) n];
            if (k * m > s) {
                System.out.println("-1");
            }
            else if (n == 1) {
                if (s >= m * k && s <= (m + 1) * k - 1) {
                    System.out.println(s);
                } else {
                    System.out.println("-1");
                }
            }
            else {
                long findMax = k * (m + 1) - 1;

                if (findMax >= s) {
                    for (int i = 0; i < n - 1; i++) {
                        b[i] = 0;
                    }
                    b[(int) n - 1] = s;
                } else {
                    long remain = s - findMax;
                    b[(int) n - 1] = findMax;

                    long quotient = remain / (n - 1);
                    long extra = remain % (n - 1);

                    if (quotient >= k || (quotient == k - 1 && extra != 0)) {
                        System.out.println("-1");
                        continue;
                    }

                    for (int i = 0; i < n - 1; i++) {
                        b[i] = quotient;
                        if (extra > 0) {
                            b[i]++;
                            extra--;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(b[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
