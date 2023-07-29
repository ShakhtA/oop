package homework;

import classwork.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Stream stream1 = new Stream();
        int groups = r.nextInt(10) + 1;
        for (int i = 0; i <= groups; i++) {
            stream1.addGroup(new LearnGroup());
        }

        Stream stream2 = new Stream();
        groups = r.nextInt(10) + 1;
        for (int i = 0; i <= groups; i++) {
            stream2.addGroup(new LearnGroup());
        }

        Stream stream3 = new Stream();
        groups = r.nextInt(10) + 1;
        for (int i = 0; i <= groups; i++) {
            stream3.addGroup(new LearnGroup());
        }

        Stream stream4 = new Stream();
        groups = r.nextInt(10) + 1;
        for (int i = 0; i <= groups; i++) {
            stream4.addGroup(new LearnGroup());
        }

        Stream stream5 = new Stream();
        groups = r.nextInt(10) + 1;
        for (int i = 0; i <= groups; i++) {
            stream5.addGroup(new LearnGroup());
        }

        StreamService streamService = new StreamService();
        streamService.addStream(stream1);
        streamService.addStream(stream2);
        streamService.addStream(stream3);
        streamService.addStream(stream4);
        streamService.addStream(stream5);

        List<Stream> tmp = streamService.getStreamList();
        for (Stream stream:tmp) {
            System.out.print(stream.getGroupList().toString());
            System.out.println();
        }
        System.out.println("==============");

        homework.Controller controller = new Controller();
        controller.setStreamService(streamService);
        for (Stream stream:tmp) {
            System.out.print(stream.getGroupList().size() + " ");
        }
        System.out.println();
        System.out.println("==============");
        controller.sortStream();
        for (Stream stream:tmp) {
            System.out.print(stream.getGroupList().size() + " ");
        }
        System.out.println();
        System.out.println("==============");

    }
}
