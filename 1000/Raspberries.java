import java.util.*;
public class Raspberries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int res=Integer.MAX_VALUE;
            if(k!=4)
            {
                for(int i=0;i<n;i++){
                    int x=sc.nextInt();
                    res=Math.min(res,x%k==0?0:k-x%k);
                }
            }
            else{
                int c=0;
                for(int i=0;i<n;i++){
                    int x=sc.nextInt();
                    res=Math.min(res,x%k==0?0:k-x%k);
                    if(x%4==2) c++; 
                }
                if(c>2 && res!=0) res=0;
                else res=Math.min(res,Math.max(0,2-c)); 
            }
            System.out.println(res);
        }
    }
}