import java.util.Scanner;


public class VanyaAndFence {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			int value=sc.nextInt();
			if(value>h){
				count++;
			}
		}
		int width=0;
		width=count*2+width;
		width=width+n-count;
		System.out.println(width);
	}
}
