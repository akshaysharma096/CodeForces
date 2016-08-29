
public class Problem703E {

	public static void main(String[] args) {
		int[] arr = {2,4,5};
//		System.out.println(getCount(arr, 0, 1, 40));
	}
	
	public static int getCount(int[]arr, int index,int product,int k){
		if(index == arr.length-1){
			if(arr[index]%k == 0){
				return 1;
			}
			int newpro = arr[index]*product;
			if(newpro%k==0){
				return 1;
			}
			else{
				return arr.length;
			}
		}
		if(arr[index]%k==0)
			return 1;
		int newpro = arr[index]*product;
		if(newpro%k==0)
			return 1;
		int res = Integer.MAX_VALUE;
		int min = res;
		for(int j = index+1;j<arr.length;j++){
			res = Math.min(1+getCount(arr,j, arr[index]*product, k), getCount(arr,j, product, k));
			if(min>res)
				min=res;
		}
		return min;
	}
}