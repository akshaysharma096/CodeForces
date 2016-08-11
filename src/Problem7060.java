import java.util.PriorityQueue;
import java.util.Scanner;


public class Problem7060 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		PriorityQueue<Double> pq = new PriorityQueue<>();
		int q = sc.nextInt();
		for(int i =0;i<q;i++){
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double speed = sc.nextDouble();
			pq.add(getTime(x1, y1, x2, y2, speed));
		}
		System.out.println(pq.remove());
		sc.close();
	}
	
	public static double getTime(double x1, double y1, double x2, double y2, double speed){
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		double time = distance/speed;
		return time;
	}
}
