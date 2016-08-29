import java.util.HashMap;
import java.util.Scanner;


public class Problem4C {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int N  = sc.nextInt();
		HashMap<String,Integer> map  = new HashMap<String, Integer>();
		for(int i=0;i<N;i++){
			String input = sc.nextLine();
			if(map.containsKey(input)){
				int count = map.get(input);
				map.put(input,map.get(input)+1);
				System.out.println(input+""+count);
			}
			else{
				map.put(input,1);
				System.out.println("OK");
			}
		}
	}
}
