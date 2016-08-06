import java.util.HashMap;
import java.util.Scanner;


public class Problem702B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr =  new int[N];
		for(int i =0;i<N;i++)
			arr[i] = sc.nextInt();
		int count = 0;
		for(int i=0;i<N;i++){
			for(int j = 0;j<N;j++){
				if(i<j){
					int sum = arr[i]+arr[j];
					if((sum&(sum-1))==0){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
