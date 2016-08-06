import java.util.Scanner;



public class MishikaandGame {
	static String M_WIN = "Mishka";
	static String C_WIN = "Chris";
	static String DRAW  = "Friendship is magic!^^";
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int m=0, c=0;
		for(int i = 0;i<N;i++){
			int m_i = sc.nextInt();
			int c_i = sc.nextInt();
			if(m_i > c_i)
				m++;
			else if(c_i > m_i)
				c++;
		}
		if(m > c){
			System.out.println(M_WIN);
		}
		else if(c > m){
			System.out.println(C_WIN);
		}
		else{
			System.out.println(DRAW);
		}
	}
}
