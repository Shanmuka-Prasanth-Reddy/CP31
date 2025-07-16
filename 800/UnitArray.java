import java.util.*;
public class UnitArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int p=0,ng=0;
            for(int i=0;i<n;i++){
               if(a[i]>0) p++;
               else ng++;
            }
            int res=0;
            while(ng>p){
                res++;
                ng--;
                p++;
            }
            if(ng%2==1) res++;
            System.out.println(res);
        }
    }
}