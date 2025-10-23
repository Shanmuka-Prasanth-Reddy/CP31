import java.util.Arrays;
import java.util.Scanner;

public class _01Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            char c[]=sc.next().toCharArray();
            int o=0,z=0;
            for(char x:c){
                if(x=='0') z++;
                else o++;
            }
            int min=Math.min(o,z);
            //System.out.println(Arrays.toString(c)+" "+z+" "+o);
            System.out.println((min%2==1?"DA":"NET"));
        }
    }
}
