
	class TreeNode {
	    int data;
	    TreeNode left, right;

	    public TreeNode(int item) {
	        data = item;
	        left = right = null;
	    }
	}

	public  class Height {
	    TreeNode root;

	    // Function to find the height of a binary tree
	    int height(TreeNode node) {
	        if (node == null) {
	            return 0;
	        } else {
	            // Calculate the height of the left and right subtrees
	            int leftHeight = height(node.left);
	            int rightHeight = height(node.right);

	            // Return the maximum of left and right subtree heights, plus 1 for the current node
	            return Math.max(leftHeight, rightHeight) + 1;
	        }
	    }

	    public static void main(String[] args) {
	    	Height tree = new Height();

	        // Sample tree creation
	        tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);          n
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);

	        // Calculate and print the height of the binary tree
	        int treeHeight = tree.height(tree.root);
	        System.out.println("Height of the binary tree is: " + treeHeight);
	    }
	}


