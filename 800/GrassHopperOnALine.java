import java.util.*;
public class GrassHopperOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n<k){
                System.out.println("1");
                System.out.println(n);
            }
            else if(n%k==0){
                System.out.println(2);
                System.out.println((n-1)+ " " + 1);
            }
            else{
                System.out.println(1);
                System.out.println(n);
            }
        }
    }
}
