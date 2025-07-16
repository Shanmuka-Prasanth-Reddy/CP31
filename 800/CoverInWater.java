import java.util.*;
public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(),res=0;
            char ch[]=sc.next().toCharArray();
            for(int i=0;i<n;i++){
                
                if(ch[i]=='#') continue;
                res++;
                if(i+2<n && ch[i+2]!='#'&& ch[i+1]!='#'){
                    res=2;
                    break;
                }
                
            }
            System.out.println(res);
        }
    }
}
