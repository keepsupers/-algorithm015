package week3;


public class LowestCommonAncestor {

    private TreeNode treeNode;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return treeNode;
    }


    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return false;
        }
        boolean leftChild = dfs(root.left, p, q);
        boolean rightChild = dfs(root.right, p, q);
        boolean result = (leftChild && rightChild) || ((root.val == p.val || root.val == q.val) && (leftChild || rightChild));
        if (result) {
            treeNode = root;
        }
        return leftChild || rightChild || (root.val == p.val || root.val == q.val);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
