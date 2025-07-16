import java.util.*;
public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s = sc.next();
            String S=sc.next();
            int c=0;
            if(s.indexOf(S)!=-1) {
                System.out.println(0);
                continue;
            }
            if(n<=m)
            {
                    while(s.length()<=2*S.length()) {
                    s+=s;
                    c++;
                    if (s.indexOf(S)!=-1) {
                        break;
                    }
                }
            }
            else{
                s+=s;
                c++;
            }
            if(s.indexOf(S)!=-1) {
                System.out.println(c);
            } else {
                System.out.println(-1);
            }
        }
    }
}