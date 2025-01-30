class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeTasks {

    public static int calculateTreeLevel(Node root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = calculateTreeLevel(root.left);
        int rightHeight = calculateTreeLevel(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static String checkTreeType(Node root) {
        if (root == null) {
            return "Empty tree";
        }
        boolean isFull = isFullTree(root);
        boolean isComplete = isCompleteTree(root);

        if (isFull && isComplete) {
            return "The tree is both Complete and Full.";
        } else if (isFull) {
            return "The tree is Full.";
        } else if (isComplete) {
            return "The tree is Complete.";
        } else {
            return "The tree is neither Complete nor Full.";
        }
    }

    private static boolean isFullTree(Node root) {
        if (root == null) {
            return true;
        }
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            return false;
        }
        return isFullTree(root.left) && isFullTree(root.right);
    }

    private static boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left != null) {
                if (flag) {
                    return false;
                }
                queue.add(current.left);
            } else {
                flag = true;
            }

            if (current.right != null) {
                if (flag) {
                    return false;
                }
                queue.add(current.right);
            } else {
                flag = true;
            }
        }
        return true;
    }

    public static boolean checkChildrenSumProperty(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        if (root.data == leftData + rightData) {
            return checkChildrenSumProperty(root.left) && checkChildrenSumProperty(root.right);
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(2);

        System.out.println("Level (Height) of the tree: " + calculateTreeLevel(root));
        System.out.println(checkTreeType(root));
        System.out.println("Children Sum Property: " + checkChildrenSumProperty(root));
    }
}
