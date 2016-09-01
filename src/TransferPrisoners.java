import java.util.Scanner;


public class TransferPrisoners {

	int[] tree;

	public TransferPrisoners(int N) {
		// TODO Auto-generated constructor stub
		int x = (int) Math.ceil(Math.log(N)/Math.log(2));
		int maxsize = (int) (2*Math.pow(2, x));
		tree =  new int[maxsize];
	}

	public void build(int node, int start, int end, int[]arr, int C){
		if(start==end){
			if(arr[start]<=C){
				tree[node]=1;
			}
			else{
				tree[node]=0;
			}
			return;
		}

		int mid = (start+end)/2;
		build(2*node, start,mid, arr, C);
		build(2*node+1, mid+1, end, arr, C);
		tree[node] = tree[2*node]&tree[2*node+1];
	}

	public void print(){
		for(int i=0;i<tree.length;i++){
			System.out.print(tree[i]+" ");
		}
	}
	
	public int query(int node, int start, int end, int l, int r){
		if(start>end||r<start||l>end)
			return 1;
		if(l<=start&&end<=r)
			return tree[node];
		
		int mid = (start+end)/2;
		int p1= query(2*node, start,mid, l, r);
		int p2 = query(2*node+1, mid+1, end, l, r);
		return p1&p2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,C,T;
		N =sc.nextInt();
		T =sc.nextInt();
		C =sc.nextInt();
		TransferPrisoners t =  new TransferPrisoners(N);
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		t.build(1,0,N-1, arr,T);
		int sum = 0;
		for(int i=0;i<=N-C;i++){
			int val = t.query(1, 0,N-1,i, i+C-1);
			sum += val;
		}
		System.out.println(sum);
	}
}
