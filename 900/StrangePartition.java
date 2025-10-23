import java.util.Scanner;

public class StrangePartition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            long x=sc.nextLong();
            long max=0,min=0;
            for(int i=0;i<n;i++){
                long v=sc.nextLong();
                max+=(v+x-1)/x;
                min+=v;
            }
            min=(min+x-1)/x;
            System.out.println(min+" "+max);
        }
    }
}
