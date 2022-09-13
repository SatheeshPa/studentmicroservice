package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;
int nn = 0;
	BinaryTree() {
		root = null;
	}

	void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void innerOrder(Node root) {
		if (root == null) {
			return;
		}
		
		preOrder(root.left);
		System.out.print(root.key+ " ");
		preOrder(root.right);
	}
	
	void postOrder(Node root) {
		if (root == null) {
			return;
		}
		
		preOrder(root.left);
		preOrder(root.right);
		System.out.print(root.key+ " ");
	}

	void preOrder() {
		System.out.println("Pre Order");
		preOrder(root);
	}

	void innerOrder() {
		System.out.println("Inner Order");
		innerOrder(root);
	}
	void postOrder() {
		System.out.println("Post Order");
		postOrder(root);
	}
	void leftView(Node root, int level, List<Integer>list) {
		int maxLevel = 0;
		if(root == null) {
			return;
		}
	
		
		if(maxLevel < level) {
			//System.out.print(root.key+" ");
			list.add(root.key);
			maxLevel = level;
		}
		
		leftView(root.left, level+1, list);
	}
	
	void rightView(Node root, int level) {
		int maxLevel = 0;
		if(root == null) {
			return;
		}
		
		
		if(maxLevel < level) {
			System.out.print(root.key+ " ");
			maxLevel = level;
		}
		rightView(root.right, level+1);
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		//tree.preOrder();
		//tree.innerOrder();
		//tree.postOrder();
		List<Integer> list = new ArrayList<>();
		tree.leftView(tree.root, 1, list);
		
		Collections.reverse(list);
		
		for(Integer ii:list) {
			System.out.print(ii+" ");
		}
		
		tree.rightView(tree.root, 1);
	}

}
