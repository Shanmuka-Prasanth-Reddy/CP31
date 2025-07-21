import java.util.*;
public class PermutationSwap{
	static int gcd(int a,int b){
		if(b==0)
		return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int res=0;
			int arr[]=new int[n+1];
			int count=Integer.MAX_VALUE;
			for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
			res=gcd(res, Math.abs(arr[i]-i));
		
		}
			System.out.println(res);

		}
	}
}

