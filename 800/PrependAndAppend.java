import java.util.*;
public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c[]=sc.next().toCharArray();
            int i=0, j=n-1;
            while (i < j && c[i] != c[j]) {
                i++;
                j--;
            }
            System.out.println(j-i+1);
        }
    }
}
