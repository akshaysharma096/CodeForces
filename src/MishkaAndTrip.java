import java.util.Scanner;
public class MishkaAndTrip {
	
	public static void main(String[] args) {
		int N,c;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		c = sc.nextInt();
		int[] arr =  new int[N];
		boolean[] bool_arr =  new boolean[c];
		boolean helper[][] = new boolean[N][N];
		int sum=0;
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<c;i++){
			int j = sc.nextInt()-1;
			bool_arr[j] = true;
		}
		for(int i=0;i<N-1;i++){
			if(!helper[i][i+1]){
				sum = sum +arr[i]*arr[i+1];
				helper[i][i+1]=true;
				helper[i+1][i]=true;
			}
		}
		sum = sum+arr[0]*arr[N-1];
		helper[0][N-1]=true;
		helper[N-1][0]=true;
		for(int i=0;i<N;i++){
			if(bool_arr[i]){
				for(int j=0;j<N;j++){
					if(i!=j&&!helper[i][j]){
						sum=sum+arr[i]*arr[j];
						helper[i][j]=true;
						helper[j][i]=true;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
