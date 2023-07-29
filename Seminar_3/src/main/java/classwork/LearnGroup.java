package classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnGroup implements Iterable <Student> {

    static int count = 0;
    /**
     * id - Номер группы
     */
    private int id;
    /**
     * studentList - Список студентов группы.
     */
    private List<Student> studentList;

    /**
     * Конструктор класса
     */
    public LearnGroup() {
        this.id = ++count;
        studentList = new ArrayList<Student>();
    }

    /**
     * Метод, возвращающий номер группы.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод, возвращающий список студентов.
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Метод, добавляющий студента в список студентов. Если у студента не указан номер группы - устанавливается номер текущей группы.
     */
    public void add (Student student) {
        studentList.add(student);
        if (student.getIdGroup() != id) {
            student.setIdGroup(id);
        }
    }

    /**
     * Просмотр состава группы.
     */
    public void showGroup() {
        System.out.println("Group " + id);
        System.out.println("Students:");
        if (!studentList.isEmpty()){
            for (Student student: studentList) {
                System.out.printf("%s %s\n", student.getName(), student.getBirthday());
             }
        } else System.out.printf("Группа %d пуста.\n", id);
    }

    @Override
    public String toString() {
        return String.format("Группа:" + id);
    }
    private int index;

    /**
     * Реализация интерфейса Iterable
     */

    @Override
    public Iterator<Student> iterator() {
        Iterator<Student> it = new Iterator<Student>() {
            @Override
            public boolean hasNext() {
                if (index < studentList.size()) {
                    return index < studentList.size();
                } else {
                    index = 0;
                }
                return false;
            }

            @Override
            public Student next() {
                index++;
                return studentList.get(index - 1);
            }
        };
        return it;
    }

}


