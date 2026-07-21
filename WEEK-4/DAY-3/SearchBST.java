/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        }

        return searchBST(root.right, val);
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

// public class SearchBST {

//     public static TreeNode searchBST(TreeNode root, int val) {

//         if (root == null || root.val == val) {
//             return root;
//         }

//         if (val < root.val) {
//             return searchBST(root.left, val);
//         }

//         return searchBST(root.right, val);
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(4);

//         root.left = new TreeNode(2);
//         root.right = new TreeNode(7);

//         root.left.left = new TreeNode(1);
//         root.left.right = new TreeNode(3);

//         TreeNode result = searchBST(root, 2);

//         if (result != null) {
//             System.out.println("Found: " + result.val);
//         } else {
//             System.out.println("Value not found");
//         }
//     }
// }