/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SerializeDeserializeTree  {

    private int index = 0;

    // Serialize Tree -> String
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode node, StringBuilder sb) {

        if (node == null) {
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");

        preorder(node.left, sb);
        preorder(node.right, sb);
    }

    // Deserialize String -> Tree
    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        index = 0;

        return buildTree(arr);
    }

    private TreeNode buildTree(String[] arr) {

        if (arr[index].equals("null")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        index++;

        root.left = buildTree(arr);
        root.right = buildTree(arr);

        return root;
    }
}



























// import java.util.*;

// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class SerializeDeserializeTree {

//     static int index = 0;

//     // Serialize
//     public static String serialize(TreeNode root) {

//         StringBuilder sb = new StringBuilder();

//         preorder(root, sb);

//         return sb.toString();
//     }

//     private static void preorder(TreeNode node, StringBuilder sb) {

//         if (node == null) {
//             sb.append("null,");
//             return;
//         }

//         sb.append(node.val).append(",");

//         preorder(node.left, sb);
//         preorder(node.right, sb);
//     }

//     // Deserialize
//     public static TreeNode deserialize(String data) {

//         String[] arr = data.split(",");

//         index = 0;

//         return build(arr);
//     }

//     private static TreeNode build(String[] arr) {

//         if (arr[index].equals("null")) {
//             index++;
//             return null;
//         }

//         TreeNode root = new TreeNode(Integer.parseInt(arr[index]));

//         index++;

//         root.left = build(arr);

//         root.right = build(arr);

//         return root;
//     }

//     // Inorder Traversal (to verify)
//     public static void inorder(TreeNode root) {

//         if (root == null)
//             return;

//         inorder(root.left);

//         System.out.print(root.val + " ");

//         inorder(root.right);
//     }

//     public static void main(String[] args) {

//         /*
//                  1
//                 / \
//                2   3
//                   / \
//                  4   5
//         */

//         TreeNode root = new TreeNode(1);

//         root.left = new TreeNode(2);

//         root.right = new TreeNode(3);

//         root.right.left = new TreeNode(4);

//         root.right.right = new TreeNode(5);

//         // Serialize
//         String data = serialize(root);

//         System.out.println("Serialized Tree:");
//         System.out.println(data);

//         // Deserialize
//         TreeNode newRoot = deserialize(data);

//         System.out.println("\nInorder Traversal After Deserialization:");

//         inorder(newRoot);
//     }
// }