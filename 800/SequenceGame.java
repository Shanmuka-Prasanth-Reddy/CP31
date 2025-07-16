import java.util.*;
public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int res[]=new int[2*n];
            int j = 1;
            res[0] = a[0];
            for(int i = 1; i < n; i++) {
               if(a[i-1]>a[i]){
                    res[j++] = a[i];
                } 
               res[j++] = a[i];
            }
            System.out.println(j);
            for(int i = 0; i < j; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
