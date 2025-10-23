import java.util.Scanner;

public class MulBy2DivBy6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long n=sc.nextLong();
            int res=0;
            while(n>0 && (n%6==0||n%3==0)){
                if(n%6==0){
                    n/=6;
                }
                else n*=2;
                res++;
                //System.out.print(n+" ");
            }
            System.out.println(n<=1?res:-1);
        }
    }
}
