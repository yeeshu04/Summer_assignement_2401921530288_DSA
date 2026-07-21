import java.util.*;

class InorderTraversal {

    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        inorder(root);

        return result;
    }

    private void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        result.add(root.val);

        inorder(root.right);
    }
}


























// import java.util.ArrayList;

// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class InorderTraversal {

//     static ArrayList<Integer> result = new ArrayList<>();

//     public static void inorder(TreeNode root) {

//         if (root == null) {
//             return;
//         }

//         inorder(root.left);

//         result.add(root.val);

//         inorder(root.right);
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(4);

//         root.left = new TreeNode(2);
//         root.right = new TreeNode(6);

//         root.left.left = new TreeNode(1);
//         root.left.right = new TreeNode(3);

//         root.right.left = new TreeNode(5);
//         root.right.right = new TreeNode(7);

//         inorder(root);

//         System.out.println(result);
//     }
// }