package Tree;

public class NodeMain {
	public static void main(String[] args) {
		Node<Integer>root=new Node<Integer>(10);
		root.left=new Node<Integer>(1);
		root.right=new Node<Integer>(2);
		root.left.left=new Node<Integer>(4);
		root.left.left.left=new Node<Integer>(7);
		root.left.right=new Node<Integer>(9);
		root.left.left.right=new Node<Integer>(8);
		root.left.right.left=new Node<Integer>(5);
		root.left.right.right=new Node<Integer>(50);
		root.right.left=new Node<Integer>(40);
		root.right.right=new Node<Integer>(30);
		root.right.left.left=new Node<Integer>(60);
		root.right.left.right=new Node<Integer>(70);
		TreeTraversal traversal=new TreeTraversal(root);
		traversal.inOrder();
		System.out.println("---------------");
		traversal.preOrder(root);
		System.out.println("---------------");
		traversal.postOrder();
		}

	}



