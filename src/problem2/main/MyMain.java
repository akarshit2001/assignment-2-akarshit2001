/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bin = new MyBinarySearchTree();
        bin.insert(10);
        bin.insert(20);
        bin.insert(3);
        bin.insert(4);
        bin.insert(50);
        System.out.println("Traverse preorder");
        bin.traversePreorder(bin.getRoot());
        System.out.println("\n");
        System.out.println("Traverse postorder");
        bin.traversePostorder(bin.getRoot());

    }

}
