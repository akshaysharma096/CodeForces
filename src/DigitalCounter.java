import java.util.HashMap;
import java.util.Scanner;


public class DigitalCounter {
	HashMap<Integer, Integer> map = new HashMap<>();
	
	public DigitalCounter() {
		map.put(6, 2);
		map.put(0, 2);
		map.put(1,7);
		map.put(2, 2);
		map.put(3,3);
		map.put(4,3);
		map.put(5,4);
		map.put(7,5);
		map.put(8,1);
		map.put(9, 2);
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int q = N/10;
		int r = N%10;
		DigitalCounter d =  new DigitalCounter();
		int result = d.map.get(q)*d.map.get(r);
		System.out.println(result);
	}
}
