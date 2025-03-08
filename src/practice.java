class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class LL{
   /* Node root;
    LL(){
        this.root = null;
    }
    void insert(int data){
        root = insertrec(root,data);
    }
    Node insertrec(Node root,int data){
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertrec(root.left,data);
        }
        if (data > root.data) {
            root.right = insertrec(root.right, data);
        }
        return root;
    }
    void inorder(){
        inorderrec(root);
    }
    Node inorderrec(Node root){
        inorderrec(root.left);
        System.out.println(root.data);
        inorderrec(root.right);
        return root;
    }*/
   int index = -1;
    Node buildtree(int[]nodes){
index++;
        if (index == -1) {
            return null;
        }
        Node newnode = new Node(nodes[index]);
        newnode.left = buildtree(nodes);
        newnode.right = buildtree( nodes);
        return newnode;
    }
/*import java.util.*;

// TreeNode class definition
class TreeNode {
    String value;
    TreeNode left, right;

    TreeNode(String value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class CombinedTreeOperations {

    // Inorder traversal for expression tree
    public static void inorder(TreeNode root) {
        if (root == null) return;
        if (!isOperator(root.value)) System.out.print(root.value);
        else {
            System.out.print("(");
            inorder(root.left);
            System.out.print(root.value);
            inorder(root.right);
            System.out.print(")");
        }
    }

    private static boolean isOperator(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }

    // Convert sorted array to BST
    private static TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(String.valueOf(nums[mid]));
        root.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        root.right = sortedArrayToBSTHelper(nums, mid + 1, right);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    // Convert Binary Tree to BST
    public static TreeNode convertToBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);
        Collections.sort(values);
        Iterator<Integer> iter = values.iterator();
        inorderUpdate(root, iter);
        return root;
    }

    private static void inorderTraversal(TreeNode root, List<Integer> values) {
        if (root == null) return;
        inorderTraversal(root.left, values);
        values.add(Integer.parseInt(root.value));
        inorderTraversal(root.right, values);
    }

    private static void inorderUpdate(TreeNode root, Iterator<Integer> iter) {
        if (root == null) return;
        inorderUpdate(root.left, iter);
        root.value = String.valueOf(iter.next());
        inorderUpdate(root.right, iter);
    }

    // Level order traversal with null markers
    public static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (!q.isEmpty()) q.add(null);
            } else {
                System.out.print(curr.value + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
    }

    // Check if a tree is full
    public static boolean isFullTree(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left != null && root.right != null)
            return isFullTree(root.left) && isFullTree(root.right);
        return false;
    }

    // Check if a tree is complete
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null) {
                if (flag) return false;
                queue.add(curr.left);
            } else flag = true;
            if (curr.right != null) {
                if (flag) return false;
                queue.add(curr.right);
            } else flag = true;
        }
        return true;
    }

    public static void main(String[] args) {
        // 1. Expression Tree Construction
        TreeNode root = new TreeNode("/");
        root.left = new TreeNode("*");
        root.right = new TreeNode("+");
        root.left.left = new TreeNode("+");
        root.left.right = new TreeNode("-");
        root.right.left = new TreeNode("2");
        root.right.right = new TreeNode("9");
        root.left.left.left = new TreeNode("5");
        root.left.left.right = new TreeNode("2");
        root.left.right.left = new TreeNode("2");
        root.left.right.right = new TreeNode("1");

        System.out.print("Inorder Traversal of Expression Tree: ");
        inorder(root);
        System.out.println();

        // 2. Convert Sorted Array to BST
        int[] sortedArray = {2, 5, 7, 10, 15};
        TreeNode bstRoot = sortedArrayToBST(sortedArray);
        System.out.print("Inorder Traversal of BST: ");
        inorder(bstRoot);
        System.out.println();

        // 3. Convert Binary Tree to BST
        TreeNode binaryTree = new TreeNode("10");
        binaryTree.left = new TreeNode("5");
        binaryTree.right = new TreeNode("15");
        binaryTree.left.left = new TreeNode("2");
        binaryTree.left.right = new TreeNode("7");
        System.out.print("Original Tree In-Order: ");
        inorder(binaryTree);
        System.out.println();
        binaryTree = convertToBST(binaryTree);
        System.out.print("Converted BST In-Order: ");
        inorder(binaryTree);
        System.out.println();

        // 4. Level Order Traversal
        System.out.println("Level Order Traversal:");
        levelOrder(binaryTree);

        // 5. Check Full and Complete Trees
        System.out.println("Is Full Tree: " + isFullTree(binaryTree));
        System.out.println("Is Complete Tree: " + isCompleteTree(binaryTree));
    }
}
*/
}
public class practice {
    public static void main(String[] args) {

    }
}
