package classwork;

import java.util.Random;

public class Student implements Comparable<Student> {
    private String name;
    private String birthday;
    private int id;
    private int idGroup;

    public Student(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        id = new Random().nextInt(1000);
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setIdGroup (Integer id) {
        idGroup = id;
    }

    public Integer getIdGroup () {
        return idGroup;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, id: %d, group: %d", name, birthday, id, idGroup);
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}

