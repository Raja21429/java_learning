package Diameter;

public class Dia_1 {
	int data ;
	Dia_1 left,right;
	
	
	Dia_1(int item ){
		 
		data = item;
		left=right=null;
		
	}
}
	
	class Btree {
		
		Dia_1 root;
		
	public int diameter(Dia_1 Node ) {
		if(Node == null) {
			return 0;
		}
		else {
			int leftHeight = height(Node.left);
			int rightHeight = height(Node.right);
			
			int leftDia = diameter(Node.left);
			int rightDia = diameter(Node.right);
			
			return Math.max((leftHeight+rightHeight+1), Math.max(leftDia, rightDia));
		}
	}

	public int height(Dia_1 Node) {
		if(Node==null) {
			 return 0;
		 }
		 else {
		 int leftheight=height(Node.left);
		 int rightheight=height(Node.right);
		
		 return Math.max(leftheight, rightheight +1);
	
		 }
		
		
	}
	
	
}
