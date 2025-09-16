public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    /**
     * 手动创建二叉树，返回根节点
     */
    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;

        return A;
    }

    // 前序遍历
    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    ;

    // 中序遍历
    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    ;

    // 后序遍历
    void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    ;

    // 获取树中节点的个数
    int size(TreeNode root) {
    }

    ;

    // 获取叶⼦节点的个数
    int getLeafNodeCount(TreeNode root) {
    }

    ;

    // ⼦问题思路-求叶⼦结点个数
// 获取第K层节点的个数
    int getKLevelNodeCount(TreeNode root, int k) {
    }

    ;

    // 获取⼆叉树的⾼度
    int getHeight(TreeNode root) {
    }

    ;

    // 检测值为value的元素是否存在
    TreeNode find(TreeNode root, int val) {
    }

    ;


}
