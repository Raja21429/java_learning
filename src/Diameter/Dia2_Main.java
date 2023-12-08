package Diameter;

public class Dia2_Main {

	public static void main(String[] args) {
		  Btree tree = new Btree();
			 
	        tree.root = new Dia_1(9);
	        tree.root.left = new Dia_1(7);
	        tree.root.right = new Dia_1(8);
	        tree.root.left.left = new Dia_1(6);
	        tree.root.left.right = new Dia_1(22);
	 
	        System.out.println("Height of tree is " + tree.height(tree.root));
	                          
	    System.out.println(tree.diameter(tree.root));
	}

}
