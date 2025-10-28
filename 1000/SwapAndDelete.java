import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char c[]=sc.next().toCharArray();
            int z=0,o=0;
            for(char ch:c){
                if(ch=='0') z++;
                else o++;
            }
            z=o=Math.min(o,z);
            int res=0;
            for(int i=0;i<c.length;i++){
                if(c[i]=='0'){
                    if(o>0) o--;
                    else{
                        res=c.length-i;
                        break;
                    }
                }
                else{
                    if(z>0) z--;
                    else{
                        res=c.length-i;
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
