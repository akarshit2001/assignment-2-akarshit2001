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
    private TreeNode root = null;
    private int max = 0;
    private int count = 0;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);

        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (node.getData() <= parent.getData()) {
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

    public void traverse(TreeNode k) {


        leftnode(k, 1);
        System.out.println("\n" + "No of node that not have left child" + " " + count);

    }

    public void leftnode(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (max < level) {
            System.out.print(node.getData() + " ");


        }
        max = level;

        if (node.getLeft() == null) {
            count++;
            max++;

        }
        leftnode(node.getLeft(), level + 1);
        leftnode(node.getRight(), level + 1);


    }
}


