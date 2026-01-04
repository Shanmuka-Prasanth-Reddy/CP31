import java.util.*;
public class BasketballTogether {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int res=0;
        int l=0,r=n-1;
        while(l<=r){
            int c=(d+a[r])/a[r];
            if(r-l+1<c) break;
            r--;
            l+=c-1;
            res++;
        }
        System.out.println(res);
    }
}