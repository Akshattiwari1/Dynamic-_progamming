import java.util.*;
class Test123
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int[] arr=new int[n];

		for (int i=0;i<n;i++) 
		{
			arr[i]=a.nextInt();
		}

		int[] dp=new int[n+1];
		dp[n]=1;
		for (int i=n-1;i>=0;i--) 
		{
			for (int j=0;j<=arr[i] && i+j<dp.length;j++) 
			{
				dp[i]+=dp[i+j];
			}
		}
		System.out.println(dp[0]);
	}
}