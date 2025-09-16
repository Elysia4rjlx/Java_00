public class Text {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode treeNode = binaryTree.createTree();
        binaryTree.preOrder(treeNode);
        System.out.println();
        binaryTree.inOrder(treeNode);
        System.out.println();
        binaryTree.postOrder(treeNode);
        System.out.println();
    }
}
