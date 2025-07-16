import java.util.*;
public class AmbitiousKid {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;   
        while (t-->0) {
            int n=sc.nextInt();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                min=Math.min(min, Math.abs(sc.nextInt()-0));
            }
            System.out.println(min);
        }
   } 
}
