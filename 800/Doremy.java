import java.util.*;
public class Doremy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(),s=0;
            HashMap<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<n;i++){
                s=sc.nextInt();
                m.put(s,m.getOrDefault(s,0)+1);
            }
            if(m.size() > 2) {
                System.out.println("No");
            } 
            else if(m.size()==1)
                System.out.println("YES");
            else {
                int a[]=new int[2];
                int idx=0;
                for(int i:m.values()){
                    a[idx++]=i;
                }
               if (n%2 == 0) {
                   if (a[0] == a[1]) {
                       System.out.println("Yes");
                   } else {
                       System.out.println("No");
                   }
               }
                else {
                     if (a[0] == a[1] + 1 || a[1] == a[0] + 1) {
                          System.out.println("Yes");
                     } else {
                          System.out.println("No");
                     }
                }
            }
        }
    }
}
