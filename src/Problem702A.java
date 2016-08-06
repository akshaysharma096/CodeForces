import java.util.Scanner;


public class Problem702A {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int N =sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(getMaxdp(arr, N));
	}
	public static int getMaxdp(int[]arr,int N){
		int helper[] = new int[N];
		for(int i=0;i<N;i++){
			helper[i] =1;
		}
		int max = Integer.MIN_VALUE;
		int res =1;
		for(int i = N-2;i>=0;i--){
			if(arr[i+1]>arr[i]){
				helper[i] = Math.max(helper[i+1]+1, helper[i+1]);
			}
		}
		for(int i =0;i<N;i++){
			if(helper[i]>max)
				max=helper[i];
		}
		return max;
	}
}
