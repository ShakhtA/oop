package homework;

import java.util.Comparator;

public class StreamComporator implements Comparator<Stream> {

    /**
     * Метод, сравнивающий потоки по количеству групп
     */
    @Override
    public int  compare(Stream o1, Stream o2) {
        return o1.getGroupList().size() - o2.getGroupList().size();
    }
}
