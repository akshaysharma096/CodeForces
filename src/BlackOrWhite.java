

import java.util.HashMap;
import java.util.Scanner;

public class BlackOrWhite {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("C", "1");
		map.put("M", "1");
		map.put("Y", "1");
		Scanner sc = new Scanner(System.in);
		String result = "#Black&White";
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				String in = sc.next();
				if(map.containsKey(in)){
					result = "#Color";
					System.out.println("\n"+result);
					return;
				}
			}
		}
		System.out.println(result);
	}
}
