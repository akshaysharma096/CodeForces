import java.util.HashMap;
import java.util.Scanner;


public class Problem650A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Integer> x = new HashMap<>();
		HashMap<Integer, Integer> y = new HashMap<>();
		int count = 0;
		for(int i=0;i<N;i++){
			int x_c = sc.nextInt();
			int y_c = sc.nextInt();
			if(x.containsKey(x_c)&&y.containsKey(y_c)){
				count = count + x.get(x_c)+y.get(y_c)-1;
				x.put(x_c,x.get(x_c)+1);
				y.put(y_c,y.get(y_c)+1);
			}
			else{
				if(x.containsKey(x_c)){
					count = count+ x.get(x_c);
					x.put(x_c,x.get(x_c)+1);
				}
				else{
					x.put(x_c,1);
				}
				if(y.containsKey(y_c)){
					count = count+ y.get(y_c);
					y.put(y_c,y.get(y_c)+1);
				}
				else{
					y.put(y_c,1);
				}
			}
		}
		System.out.println(count);
	}
}
