import java.util.Scanner;

public class BadBoy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int i=sc.nextInt();
            int j=sc.nextInt();
            int x=i-1>=n-i?1:n;
            int y=j-1>=m-j?1:m;
            System.out.println(x+" "+y+" "+(x==1?n:1)+" "+(y==1?m:1));
        }
    }
}
