import java.util.Scanner;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int val=n;
            int l=0,r=n-1;
            String ans="No";
            while(r-l+1>2){
                if(a[l]==val){
                    val--;
                    l++;
                }
                else if(a[r]==val){
                    val--;
                    r--;
                }
                else{
                    ans="Yes";
                    break;
                }
            }
            System.out.println(ans);
            if(ans.equals("Yes")){
                
                int idx=0;
                for(int i=l+1;i<=r;i++){
                    if(a[i]==val){
                        idx=i;
                        break;
                    }
                }
                l++;
                r++;
                idx++;
                System.out.println(l+" "+idx+" "+r);
            }
        }
    }
}
