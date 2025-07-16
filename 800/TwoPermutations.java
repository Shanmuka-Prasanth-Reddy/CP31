import java.util.*;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b && b==n){
                System.out.println("YES");
            }
            else{
                System.out.println(n-a-b>1?"YES":"NO");
            }
        }
    }
}
