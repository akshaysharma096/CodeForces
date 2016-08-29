
public class FindOddElement {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,2,3,3};
		System.out.println(findODDElement(arr));
	}
	
	public static int findODDElement(int[] arr){
		int result = 0;
		for(int i=0;i<arr.length;i++){
			result = result^arr[i];
		}
		return result;
	}
}
