import java.util.*;
public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int x=c-a;
            int y=d-b;
            if(y<0){
                System.out.println(-1);
            }
            else{
                int ans=d-b;
                a+=ans;
                if(c-a>0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(ans+a-c);
                }
            }
            
        }
    }
}
