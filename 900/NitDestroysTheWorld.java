import java.util.*;

public class NitDestroysTheWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] v = new int[n];
            for(int i = 0; i < n; i++) v[i] = sc.nextInt();

            int zeros = 0;
            for(int i = 0; i < n; i++) if(v[i] == 0) zeros++;

            if(zeros == n){
                System.out.println(0);
            }
            else if(zeros == 0){
                System.out.println(1);
            }
            else{
                int curr = 0;
                for(int i = 0; i < n; i++){
                    if(v[i] != 0) break;
                    curr++;
                }
                for(int i = n - 1; i >= 0; i--){
                    if(v[i] != 0) break;
                    curr++;
                }
                if(curr == zeros){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
        }
    }
}
