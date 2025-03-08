class TreeNode {
    String value;
    TreeNode left, right;

    TreeNode(String value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class binaryexpressiontree {

    static void inorderTraversal(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                System.out.print("(");
            }
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
            if (root.left != null && root.right != null) {
                System.out.print(")");
            }
        }
    }
    static int evaluate(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return Integer.parseInt(root.value);
        }

        int leftVal = evaluate(root.left);
        int rightVal = evaluate(root.right);

        switch (root.value) {
            case "+": return leftVal + rightVal;
            case "-": return leftVal - rightVal;
            case "*": return leftVal * rightVal;
            case "/": return leftVal / rightVal;
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("/");
        root.left = new TreeNode("*");
        root.right = new TreeNode("-");

        root.left.left = new TreeNode("-");
        root.left.right = new TreeNode("+");
        root.right.left = new TreeNode("6");
        root.right.right = new TreeNode("4");

        root.left.left.left = new TreeNode("8");
        root.left.left.right = new TreeNode("3");
        root.left.right.left = new TreeNode("5");
        root.left.right.right = new TreeNode("2");

        System.out.println("In-order Traversal:");
        inorderTraversal(root);
        System.out.println("\n");

        int result = evaluate(root);
        System.out.println("Evaluated Result: " + result);
    }
}
