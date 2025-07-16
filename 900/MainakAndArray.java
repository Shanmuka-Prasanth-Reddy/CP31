import java.util.*;
public class MainakAndArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int l=a[0],r=a[n-1];
            Arrays.sort(a);
            if(a[n-1]!=l){
                res=a[n-1]-l;
            }
        }
    }
}