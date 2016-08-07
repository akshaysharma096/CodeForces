import java.util.Scanner;


public class Problem7050 {
	
	public static String hate = "I hate ";
	public static String love = "I love ";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String output = "";
		for(int i=1;i<=N;i++){
			if(i%2==0){
				output = output+love;
			}
			else{
				output = output+hate;
			}
			if(i==N){
				output = output+"it";
			}
			else{
				output = output+"that ";
			}
		}
		System.out.println(output);
	}
}
