import java.util.Scanner;


public class CheckDuplicatePrime {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr =  new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(checkDuplicatePrime(arr));
		sc.close();
	}
	
	public static boolean checkDuplicatePrime(int[]arr){
		int result = 1;
		for(int i=0;i<arr.length;i++){
			if(result%arr[i]==0)
				return true;
			result = result*arr[i];
		}
		return false;
	}
}
