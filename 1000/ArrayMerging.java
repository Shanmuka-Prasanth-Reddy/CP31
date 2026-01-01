import java.util.*;
public class ArrayMerging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> m1=new HashMap<>();
            HashMap<Integer,Integer> m2=new HashMap<>();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int l=0,r=1;
            while(r<n){
                while(r<n && a[r]==a[r-1]){
                    r++;
                }
                m1.put(a[l],Math.max(m1.getOrDefault(a[l],0),r-l));
                l=r;
                r++;
            }
            if(l<n){
                m1.put(a[l],Math.max(m1.getOrDefault(a[l],0),r-l));
            }
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            l=0;r=1;
           while(r<n){
                while(r<n && a[r]==a[r-1]){
                    r++;
                }
                m2.put(a[l],Math.max(m2.getOrDefault(a[l],0),r-l));
                l=r;
                r++;
            }
            if(l<n){
                m2.put(a[l],Math.max(m2.getOrDefault(a[l],0),r-l));
            }
            int res=1;
            //System.out.println(m);
            for(int i:m1.keySet()){
                int cur=m1.get(i)+m2.getOrDefault(i, 0);
                res=Math.max(res,cur);
            }
            for(int i:m2.keySet()){
                res=Math.max(res,m2.get(i));
            }
            System.out.println(res);
        }
    }
}
