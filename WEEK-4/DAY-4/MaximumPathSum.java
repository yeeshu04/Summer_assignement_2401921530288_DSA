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

class MaximumPathSum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        dfs(root);

        return maxSum;
    }

    private int dfs(TreeNode node) {

        if (node == null)
            return 0;

        int left = Math.max(0, dfs(node.left));

        int right = Math.max(0, dfs(node.right));

        maxSum = Math.max(maxSum, left + right + node.val);

        return node.val + Math.max(left, right);
    }
}









// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val){
//         this.val = val;
//     }
// }

// public class MaximumPathSum {

//     static int maxSum = Integer.MIN_VALUE;

//     public static int maxPathSum(TreeNode root){

//         dfs(root);

//         return maxSum;
//     }

//     public static int dfs(TreeNode node){

//         if(node == null)
//             return 0;

//         int left = Math.max(0, dfs(node.left));

//         int right = Math.max(0, dfs(node.right));

//         maxSum = Math.max(maxSum, left + right + node.val);

//         return node.val + Math.max(left, right);
//     }

//     public static void main(String[] args){

//         TreeNode root = new TreeNode(-10);

//         root.left = new TreeNode(9);

//         root.right = new TreeNode(20);

//         root.right.left = new TreeNode(15);

//         root.right.right = new TreeNode(7);

//         System.out.println(maxPathSum(root));
//     }
// }