package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

public class MyCircularQueue {
    private Node rear;
    private int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    private boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }

    public Node getRear() {
        return rear;
    }

    public int getSize() {
        return size;
    }

    public boolean dequeue() {
        boolean response = false;
        if (!isEmpty()) {
            size--;
            response = true;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(rear.getNext().getNext());
            }
        }
        return response;
    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    public void viewAll() {
        Node t = rear;
        while (t.getNext() != rear) {
            System.out.println("Name" + " " + t.getData().name + "\n" + "RollNo" + " " + t.getData().rollNo + "\n" + "Course" + " " + t.getData().course + "\n" + "backlogs" + " " + t.getData().backlogs);
            t = t.getNext();
            System.out.println("*****************|****************");
        }
        System.out.println("Name" + " " + t.getData().name + "\n" + "RollNo" + " " + t.getData().rollNo + "\n" + "Course" + " " + t.getData().course + "\n" + "backlogs" + " " + t.getData().backlogs);
        t = t.getNext();
    }
}
