import java.util.*;
public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();
            long min=k*(k+1)/2;
            long r=n-k;
            long max=(n*(n+1)/2)-(r*(r+1)/2);
            
            System.out.println(min<=x && max>=x?"Yes":"No");
        }
    }
}