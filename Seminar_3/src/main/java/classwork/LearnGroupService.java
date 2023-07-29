package classwork;

import java.util.Collections;
import java.util.Iterator;

public class LearnGroupService implements Iterator<Student>, Iterable<Student> {

    private LearnGroup group;

    public LearnGroupService(LearnGroup group) {
        this.group = group;
    }

    public LearnGroupService() {
        this(new LearnGroup());
    }

    public LearnGroup getGroup() {
        return group;
    }

    public void setGroup(LearnGroup group) {
        this.group = group;
    }

    private int index;

    @Override
    public Iterator<Student> iterator() {
        Iterator<Student> it = new Iterator<Student>() {
            @Override
            public boolean hasNext() {
                if (index < group.getStudentList().size()) {
                    return true;
                } else {
                    index = 0;
                }
                return false;
            }

            @Override
            public Student next() {
                return group.getStudentList().get(index++);
            }
        };
        return it;
    }

    @Override
    public boolean hasNext() {
        if (index < group.getStudentList().size()) {
            return true;
        } else {
            index = 0;
        }
        return false;
    }

    @Override
    public Student next() {
        index++;
        return group.getStudentList().get(index - 1);
    }

    @Override
    public void remove() {
        group.getStudentList().remove(index);
    }

    public void remove(String name) {
        boolean isEmpty = false;
        for (Student student: group.getStudentList()) {
            if (student.getName().equals(name)) {
                group.getStudentList().remove(student);
                System.out.println("Студент " + name + " удален из группы\n");
                break;
            } else isEmpty = true;
        }
        if (isEmpty) {
            System.out.printf("Студента %s нет в группе\n", name);
        }
    }


    public void sortStudent() {
        Collections.sort(group.getStudentList());
    }

    public void sortName() {
        StudentComparator newComparator = new StudentComparator();
        Collections.sort(group.getStudentList(), newComparator);
    }



    @Override
    public String toString() {
        if (group != null) {
            for (Student student : group.getStudentList()) {
                System.out.println(student.toString());
            }
        }
        return null;
    }

}
