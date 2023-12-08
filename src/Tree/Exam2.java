package Tree;

public class Exam2 {
	Node<Integer>root;
	public void Exam2(Node<Integer>root) {
		this.root=root;
	}
	
	public void preOrder(Node<Integer>currentroot) {
		
		if(currentroot !=root) {
			System.out.println(currentroot.data);
			preOrder(currentroot.left);
			preOrder(currentroot.right);
			
			}
		}
	
	    
		
	
	
	

}

