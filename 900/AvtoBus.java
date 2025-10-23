import java.util.*;
public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 != 0) {
                System.out.println(-1);
            } else if (n == 2) {
                System.out.println(-1);
            }else {
                long max = n / 4;
                long min = n / 6;
                if (n % 6 != 0) {
                    min++;
                }
                System.out.println(min + " " + max);
            }
        }
    }
}