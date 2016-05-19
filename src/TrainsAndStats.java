import java.util.Scanner;

public class TrainsAndStats {


	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr =new int[n-1];
		for(int i=0;i<n-1;i++){
			arr[i]=sc.nextInt();
		}

		trainsAndStats(arr);
	}

	private static	void  trainsAndStats(int[] arr) {
		int[][] table=new int[arr.length+1][arr.length+1];
		for(int i=0;i<arr.length+1;i++){
			for(int j=0;j<arr.length+1;j++){
				if(j==i+1){
					table[i][j]=1;
				}
				else{
					table[i][j]=-1;
				}
			}
		}
		getStat(arr, table);
	}

	private static void getStat(int[] arr, int[][] table) {
		int n =table.length;
		for(int i=n-2;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				if(i<j){
					if(table[i][j]==1)
						continue;
					if(arr[i]>=j+1){
						table[i][j]=1;
					}
					else if(arr[i]+1==j){
						table[i][j]=1;
					}
					else{
						table[i][j]=1+table[arr[i]-1][j];
					}
				}
			}
		}
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if(i<j){
//					System.out.println((i)+","+(j)+": "+table[i][j]);
					sum=sum+table[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}

