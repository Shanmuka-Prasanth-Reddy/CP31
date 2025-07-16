import java.util.*;
public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int b[] = new int[n];
            int c[] = new int[n];
            int bp=0,cp=0,i=0;
            b[bp++] = a[i++];
            while (i<n) {
                if(a[i-1]==a[i]){
                    b[bp++] = a[i++];
                }
                else{
                    break;
                }
            }
            if(i==n){
                System.out.println("-1");
                continue;
            }
            else{
                cp=n-bp;
                System.out.println(bp +" "+cp);
                for(int j=0;j<bp;j++){
                    System.out.print(b[j]+" ");
                }
                System.out.println();
                for(int j=i;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
