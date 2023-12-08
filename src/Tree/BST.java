package Tree;

public class BST {
	BSTNode root;
	boolean isAvaiable=false;
	
	public BSTNode insert(int value) {
		return insert(root,value);
		
	}

	public BSTNode insert(BSTNode node, int value) {
		if(node==null) {
			node=new BSTNode(value);
			if(root==null) {
				root=node;
			}
		
		return node;
		}
		if(value<node.getData()) {
			node.setLeft(insert(node.getLeft(),value));
		}
		else {
			node.setRight(insert(node.getLeft(),value));
		}
		return node;
	}
	
	public BSTNode search(int value) {
		isAvaiable=false;
		return search(value,root);
		
	}

	public BSTNode search(int value, BSTNode currentroot) {
		if(currentroot !=null && currentroot.getData()==value) {
			isAvaiable=true;
			return currentroot;
		}
		else if(currentroot !=null && currentroot.getData() > value){
			return search(value,currentroot.getLeft());
		}
		else if(currentroot !=null && currentroot.getData() < value) {
			return search(value,currentroot.getRight());
		}
		return currentroot;
	}
}
		
		
		
	

	

	
