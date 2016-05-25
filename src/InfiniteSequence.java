import java.util.Scanner;

public class InfiniteSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		
		
		if(b==a){
			System.out.println("YES");
		}
		else{
			if(c==0){
				System.out.println("NO");
			}
			else{
				long n = (b-a)/c;
				if(n>0){
					if(n*c+a==b){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}
				else{
					System.out.println("NO");
				}
			}
		}
	}
}
