/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
import problem1.node.TreeNode;
public class MyBinarySearchTree {
    public TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int item) {
        TreeNode node = new TreeNode(item);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (item < temp.getData()) {
                    temp = temp.getLeft();
                } else if (item >= temp.getData()) {
                    temp = temp.getRight();
                }
            }
            if (item <= parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }
    public void traversePreorder(TreeNode ni) {
        if (ni == null) {
            System.out.print("");
        } else {
            System.out.print(ni.getData() +
                    " ");
            traversePreorder(ni.getLeft());
            traversePreorder(ni.getRight());

        }
    }
    public void traversePostorder(TreeNode ni) {
        if (ni == null) {
            System.out.print("");
        } else {

            traversePostorder(ni.getLeft());
            traversePostorder(ni.getRight());
            System.out.print(ni.getData() +
                    " ");

        }

    }
    public void print(TreeNode k){
       print(k.getLeft());
        System.out.println(k.getData());

    }
}



