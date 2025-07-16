import java.util.*;
public class ComparisionString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            char c[]=sc.next().toCharArray();
            int max=0,cur=1;
            for(int i=0;i<n-1;i++){
                if(c[i]==c[i+1]) cur++;
                else{
                    max=Math.max(max,cur);
                    cur=1;
                } 
            }
            max=Math.max(cur,max);
            System.out.println(max+1);
        }
    }
}
