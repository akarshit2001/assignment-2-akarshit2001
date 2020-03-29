/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private String Name;
    private int backlog;
    private int apperingCount;

    public Student(String name, int backlog, int apperingCount) {
        Name = name;
        this.backlog = backlog;
        this.apperingCount = apperingCount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBacklog() {
        return backlog;
    }

    @Override
    public String toString() {
        return getName() + " " + getBacklog() + " " + getApperingCount();
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getApperingCount() {
        return apperingCount;
    }

    public void setApperingCount(int apperingCount) {
        this.apperingCount = apperingCount;
    }
}
