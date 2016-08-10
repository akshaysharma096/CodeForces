import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class Problem703D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i =0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int q =  sc.nextInt();
		for(int i=0;i<q;i++){
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			findXor(l, r, arr);
		}
		sc.close();
	}
	
	public static void findXor(int l, int r, int[]arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for(int i=l;i<=r;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1); 
			}
		}
//		System.out.println(map);
		Stack<Integer> st = new Stack<Integer>();
		for(int i=l;i<=r;i++){
			if(map.containsKey(arr[i])){
				if(map.get(arr[i])%2 == 0){
					st.push(arr[i]);
					map.remove(arr[i]);
				}
			}
		}
		if(st.size()==0)
			result = 0;
		else if (st.size()==1)
			result = st.peek();
		else{
			result = st.pop();
			while(!st.empty()){
				result = result^st.pop();
			}
		}
		System.out.println(result);
	}
}
