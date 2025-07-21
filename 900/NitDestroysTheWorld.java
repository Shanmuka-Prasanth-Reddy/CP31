import java.util.*;
public class NitDestroysTheWorld {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==0) c++;
            }
            int res=0;
            if(c==0||(c==1 && (a[0]==0 ||a[n-1]==0))) res=1;
            else if(c<n) res=2;
            System.out.println(res);
        }
    }
}