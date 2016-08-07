import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Problem705B {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int q = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		Queue<Pair> que = new LinkedList<Pair>();
		int sum=0;
		for(int i=0;i<q;i++){
			int q_type = sc.nextInt();
			int app_type = sc.nextInt();
			if(q_type == 1){
				if(map.containsKey(app_type)){
					map.put(app_type,map.get(app_type)+1);
				}else{
					map.put(app_type, 1);
				}
				que.add(new Pair(i, app_type));
				sum++;
			}
			else if(q_type==2){
				int n_count = map.get(app_type);
				map.put(app_type,0);
				sum = sum-n_count;
			}
			else{
				for(int j =0;j<q_type;j++){
					Pair p = que.remove();
					int type = p.app_type;
					map.put(type, map.get(type)-1);
					sum--;
				}
			}
			System.out.println(sum);
		}
	}
}

class Pair{
	int index;
	int app_type;
	
	public Pair(int index, int type) {
		this.index=type;
		this.app_type= type;
	}
}