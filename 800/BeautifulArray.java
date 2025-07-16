import java.util.*;
public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            if(a[0]==a[n-1]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                int i=0,j=n-1;
                while (i<j) {
                    System.out.print(a[i++]+" "+a[j--]+" ");
                }
                if(i==j) System.out.print(a[i]);
                System.out.println();
            }
        }
    }
}
