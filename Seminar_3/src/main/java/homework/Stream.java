package homework;


import classwork.LearnGroup;
import java.util.*;

public class Stream implements Iterator<classwork.LearnGroup>{

    /**
     * @learnGroupList -  Список учебных групп в потоке.
     */
    private List<LearnGroup> learnGroupList;

    /**
     * Конструктор класса
     */
    public Stream() {
        learnGroupList = new ArrayList<LearnGroup>();
    }

    /**
     * Метод, возвращающий список потока.
     * * @param group - добавляемая группа
     */
    List<LearnGroup> getGroupList() {
        return learnGroupList;
    }

    /**
     * Добавление группы в поток
     */
    public void addGroup (LearnGroup group) {
        learnGroupList.add(group);
    }

    /**
     * Метод, удаляющий группу из потока.
     * @param group - удаляемая группа
     */
    public void removeGroup (LearnGroup group) {
        learnGroupList.remove(group);
    }

    private int index;
    @Override
    public boolean hasNext() {
        if (index++ < getGroupList().size()) {
            return true;
        } else {
            index = 0;
        }
        return false;
    }

    @Override
    public LearnGroup next() {
        return getGroupList().get(index - 1);
    }

    @Override
    public void remove() {
        getGroupList().remove(index - 1);
        index--;
    }

    @Override
    public String toString() {
        for(LearnGroup list: learnGroupList) {
            return String.format("Группа: %d", list.getId());
        }
        return " ";
    }
}
