import java.util.Scanner;


public class MoneyTransfer {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		//		int[] arr={-5,0,5};

		System.out.println(getCount(arr));
	}

	private static int getCount(int[] arr) {
		int n=arr.length,count=0;
		for(int i=0;i<n;i++){
			
		}
		return count;
	}

	private static boolean isZero(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
}
