import java.util.Scanner;

public class ServalAndMochasArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            String ans="NO";
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int a=arr[i],b=arr[j];
                    while(a>0){
                        int temp=a;
                        a=b%a;
                        b=temp;
                    }
                    if(b<=2){
                        ans="YES";
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
