/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue= new MyPriorityQueue();
        myPriorityQueue.push("Akarshit",1);
        myPriorityQueue.push("Alankrit",2);
        myPriorityQueue.push("Alankrit",0);
        myPriorityQueue.push("Abhilasha",3);
        String pee= myPriorityQueue.peek();
        System.out.println("Display data");
        myPriorityQueue.print();
    }
}
