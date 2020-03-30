/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args) {

        MyCircularQueue myCircularQueue = new MyCircularQueue();
        Student student1 = new Student("A", "MCA", 1);
        Student student2 = new Student("B", "BCA", 2);
        Student student3 = new Student("c", "btech", 3);
        Student student4 = new Student("d", "Mtech", 4);
        Student student5 = new Student("E", "btech", 5);
        student1.backlogs = 2;
        student2.backlogs = 0;
        student3.backlogs = 2;
        student4.backlogs = 1;
        student5.backlogs = 1;
        myCircularQueue.enqueue(student1);
        myCircularQueue.enqueue(student2);
        myCircularQueue.enqueue(student3);
        myCircularQueue.enqueue(student4);
        myCircularQueue.enqueue(student5);

        MyCircularQueue finalQueue = processQueue(myCircularQueue);
        System.out.print("Number of students with exactly 1 backlog(2>backlog>0) : " + finalQueue.getSize());
        System.out.println("\nStudents with exactly 1 backlog(2>backlog>0) : ");
        finalQueue.viewAll();


    }

    public static MyCircularQueue processQueue(MyCircularQueue initialQ) {

        MyCircularQueue prQ = new MyCircularQueue();
        int size = initialQ.getSize();
        Node n;
        while (size != 0) {
            n = initialQ.peek();
            initialQ.dequeue();
            if (n.getData().backlogs == 1) {
                prQ.enqueue(n.getData());
            }
            size--;

        }
        return prQ;
    }

}
