import java.util.Scanner;


public class Problem706B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = (int)1e5+5;
		int[] cost =  new int[N];
		int[] dp = new int[N];
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			cost[x]++;
		}
		int q = sc.nextInt();
		for(int i=1;i<N;i++)
			dp[i] = dp[i-1]+cost[i];
		for(int i =0;i<q;i++){
			int m = Integer.parseInt(sc.next());
			if(m<=N-1)
				System.out.println(dp[m]);
			else
				System.out.println(m);
		}
	}
}
