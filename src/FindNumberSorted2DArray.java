
public class FindNumberSorted2DArray {
	/*
	 * Complexity O(N) and space O(1)
	 * */
	public static void main(String[] args) {
		int arr[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		PairItems p = findPair(arr, 29);
		System.out.println(p.i+" "+p.j);
	}
	
	public static PairItems findPair(int arr[][],int item){
		int i =0, N = arr.length, j=N-1;
		while(i<N&&j>=0){
			if(item == arr[i][j]){
				PairItems p = new PairItems(i, j);
				return p;
			}
			else if(item > arr[i][j])
				i++;
			else
				j--;
		}
		return new PairItems(-1, -1);
	}
}


class PairItems{
	int i,j;
	public PairItems(int i,int j) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
	}
}