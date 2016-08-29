import java.util.Scanner;


public class MaxSubArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			int[] arr =  new int[N];
			for(int j =0;j<N;j++){
				arr[j] = sc.nextInt(); 
			}
			System.out.println(kadane(arr));
		}
	}
	
	public static int kadane(int[] arr){
		int max_f = arr[0];
		int curr_f = arr[0];
		for(int i=1;i<arr.length;i++){
			curr_f = Math.max(arr[i], curr_f+arr[i]);
			max_f = Math.max(max_f, curr_f);
		}
		return max_f;
	}
}
