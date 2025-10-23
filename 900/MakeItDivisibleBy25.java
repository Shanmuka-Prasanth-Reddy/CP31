import java.util.*;

public class MakeItDivisibleBy25 {
    public static int minSteps(String n) {
        String[] endings = {"00","25","50","75"};
        int ans = Integer.MAX_VALUE;
        for (String e : endings) {
            int k = 1, j = n.length() - 1;
            while (j >= 0) {
                if (n.charAt(j) == e.charAt(k)) {
                    k--;
                    if (k < 0) {
                        ans = Math.min(ans, n.length() - j - 2);
                        break;
                    }
                }
                j--;
            }
        }
        return ans;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            System.out.println(minSteps(n));
        }
    }

}
