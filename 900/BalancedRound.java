import java.util.*;
public class BalancedRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxcnt = 0;
            if (n == 1) {
                System.out.println("0");
            }
            else {
                int cnt = 1;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i + 1] - arr[i] <= k) {
                        cnt++;
                    } else {
                        cnt = 1;
                    }
                    maxcnt = Math.max(maxcnt, cnt);
                }
                System.out.println(n - maxcnt);
            }
        }
        sc.close();
    }
}
