package Tree;

public class Exam_Main {

	public static void main(String[] args) {
		Node<Integer>root = new Node<Integer>(11);
		root.left=new Node<Integer>(20);
		root.right=new Node<Integer>(30);
		root.left.left=new Node<Integer>(40);
		root.left.left.left=new Node<Integer>(50);
		root.left.right=new Node<Integer>(60);
		root.left.left.right=new Node<Integer>(70);
		Exam2 r=new Exam2();
		r.preOrder(root);
	
	}

}
