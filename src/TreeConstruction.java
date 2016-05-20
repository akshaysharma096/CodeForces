import java.util.HashMap;
import java.util.Scanner;

class Node{
	int data;
	Node left;
	Node right;
	Node parent;
	
	public Node(int data) {
		this.data=data;
		parent=null;
	}
}

public class TreeConstruction {

	public static void main(String [] args){
		Node root=null;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		HashMap<Integer, Node> map = new HashMap<>();
		int input;
		for(int i=0;i<n;i++){
			input=sc.nextInt(); 
			arr[i]=input;
			if(i==0){
				root=new Node(input);
			}
			else{
				root=addNode(root, input,null,map);
			}
		}
		
		for(int i=1;i<arr.length;i++){
			System.out.print(map.get(arr[i]).data+" ");;
		}
	}

	private static Node addNode(Node root, int i,Node parent,HashMap<Integer, Node> map) {
		// TODO Auto-generated method stub
		if(root==null){
			Node node=new Node(i);
			map.put(i, parent);
			return node;
		}
		if(i<root.data){
			root.left=addNode(root.left,i,root,map);
		}
		else{
			root.right=addNode(root.right,i,root,map);
		}
		
		return root;
	}
	
}
