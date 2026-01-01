import java.util.Scanner;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int freq[][]=new int[n][26];
            int a[]=new int[26];
            for(int i=0;i<n;i++){
                a[s.charAt(i)-'a']++;
                freq[i]=a.clone();
            }
            int res=0;
            for(int i=0;i<n;i++){
                int l=0,r=0;
                for(int x:freq[i]){
                    if(x>0) l++;
                }
                for(int j=0;j<26;j++){
                    if(freq[n-1][j]-freq[i][j]>0)
                        r++;
                }
                res=Math.max(l+r,res);
            }
            System.out.println(res);
        }
    }
}
