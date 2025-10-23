import java.util.*;
 
public class ABBalance {
    static int count(String s, String pattern) {
        int c = 0;
        for (int i = 0; i + 1 < s.length(); i++) {
            if (s.substring(i, i + 2).equals(pattern)) c++;
        }
        return c;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ab = count(s, "ab");
            int ba = count(s, "ba");
 
            if (ab == ba) {
                System.out.println(s);
            } else {
                char[] arr = s.toCharArray();
                arr[arr.length - 1] = arr[0]; // make last char same as first
                System.out.println(new String(arr));
            }
        }
        sc.close();
    }
}