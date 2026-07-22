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

class ConstructTree {

    int preIndex = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {

        if (left > right)
            return null;

        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);

        int mid = map.get(rootValue);

        root.left = build(preorder, left, mid - 1);

        root.right = build(preorder, mid + 1, right);

        return root;
    }
}














// import java.util.*;

// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val){
//         this.val = val;
//     }
// }

// public class ConstructTree {

//     static int preIndex = 0;

//     static HashMap<Integer,Integer> map = new HashMap<>();

//     public static TreeNode buildTree(int[] preorder,int[] inorder){

//         for(int i=0;i<inorder.length;i++){
//             map.put(inorder[i],i);
//         }

//         return build(preorder,0,inorder.length-1);
//     }

//     public static TreeNode build(int[] preorder,int left,int right){

//         if(left>right)
//             return null;

//         int value=preorder[preIndex++];

//         TreeNode root=new TreeNode(value);

//         int mid=map.get(value);

//         root.left=build(preorder,left,mid-1);

//         root.right=build(preorder,mid+1,right);

//         return root;
//     }

//     public static void printInorder(TreeNode root){

//         if(root==null)
//             return;

//         printInorder(root.left);

//         System.out.print(root.val+" ");

//         printInorder(root.right);
//     }

//     public static void main(String[] args){

//         int preorder[]={3,9,20,15,7};

//         int inorder[]={9,3,15,20,7};

//         TreeNode root=buildTree(preorder,inorder);

//         printInorder(root);
//     }
// }