import java.util.*;
public class Chemistry {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            char c[]=sc.next().toCharArray();
            int a[]=new int[26];
            for(char ch:c) a[ch-'a']++;
            boolean odd=true;
            for(int i=0;i<26;i++){
                if(a[i]%2==0) continue;
                else if(a[i]%2==1 && odd){
                    odd=false;
                }
                else{
                    k--;
                }
            }
            System.out.println(k>=0?"YES":"NO");
        }
    }
}