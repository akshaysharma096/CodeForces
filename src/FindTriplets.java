import java.util.Scanner;


public class FindTriplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>2){
			findTriplet(N);
		}
		else{
			System.out.println(-1);
		}
	}

	private static void findTriplet(int n) {
		// TODO Auto-generated method stub
		if((n&1)!=0){
			int b = (n*n-1)/2;
			int a = b+1;
			System.out.println(b+" "+a);
		}
		else{
			int b = ((n*n)/4)-1;
			int a = b+2;
			System.out.println(b+" "+a);
		}
	}
}
