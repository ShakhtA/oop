package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {

    /**
     * @streamList - Список потоков.
     */
    private List<Stream> streamList;

    /**
     * Конструктор класса
     */
    public StreamService() {
        streamList = new ArrayList<>();
    }

    /**
     * Метод, возвращающий список потоков.
     */
    public List<Stream> getStreamList() {
        return streamList;
    }

    /**
     * Метод, добавляющий поток в список.
     * @param stream - добавляемый поток.
     */
    public void addStream(Stream stream) {
        streamList.add(stream);
    }

    /**
     * Метод, удаляющий поток из списка потоков.
     * @param stream - удаляемый поток
     */
    public void removeStream(Stream stream) {
        streamList.remove(stream);
    }

    /**
     * Метод сортировки списка потоков, использующий класс StreamComparator
     * @param streamList - список потоков, подлежащий сортировке
     */
    public void sortStreams(List<Stream> streamList) {
        Comparator<Stream> streamComparator = new StreamComporator();
        Collections.sort(streamList, streamComparator);
    }
}
