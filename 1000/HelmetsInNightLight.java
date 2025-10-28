import java.util.*;
public class HelmetsInNightLight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
                if(a[1]==b[1]) return b[0]-a[0];
                return a[1]-b[1];
            });
            for(int i=0;i<n;i++) pq.add(new int[]{arr[i],brr[i]});
            int cnt=n-1;
            long res=k;
            while(cnt>0){
                int x[]=pq.poll();
                if(x[1]>k){
                    res+=1L*cnt*k;
                    break;
                }
                else{
                    res+=1L*Math.min(x[0],cnt)*x[1];
                    cnt-=Math.min(x[0],cnt);
                }
            }
            System.out.println(res);
        }
    }
}
