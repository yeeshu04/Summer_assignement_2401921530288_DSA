/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *
 *     TreeNode() {}
 *
 *     TreeNode(int val) {
 *         this.val = val;
 *     }
 *
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        // Swap left and right child
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}















// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class InvertBinaryTree {

//     public static TreeNode invertTree(TreeNode root) {

//         if (root == null) {
//             return null;
//         }

//         // Swap children
//         TreeNode temp = root.left;
//         root.left = root.right;
//         root.right = temp;

//         // Invert subtrees
//         invertTree(root.left);
//         invertTree(root.right);

//         return root;
//     }

//     // Inorder Traversal
//     public static void inorder(TreeNode root) {

//         if (root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.val + " ");
//         inorder(root.right);
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(4);

//         root.left = new TreeNode(2);
//         root.right = new TreeNode(7);

//         root.left.left = new TreeNode(1);
//         root.left.right = new TreeNode(3);

//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(9);

//         System.out.println("Before Invert:");
//         inorder(root);

//         invertTree(root);

//         System.out.println("\nAfter Invert:");
//         inorder(root);
//     }
// }