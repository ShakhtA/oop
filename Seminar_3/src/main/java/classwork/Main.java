package classwork;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LearnGroup group1 = new LearnGroup();
        LearnGroup group2 = new LearnGroup();
        LearnGroup group3 = new LearnGroup();
        LearnGroup group4 = new LearnGroup();
        LearnGroup group5 = new LearnGroup();
        LearnGroup group6 = new LearnGroup();
        LearnGroup group7 = new LearnGroup();
        LearnGroup group8 = new LearnGroup();
        LearnGroup group9 = new LearnGroup();
        LearnGroup group10 = new LearnGroup();
        LearnGroup group11 = new LearnGroup();
        LearnGroup group12 = new LearnGroup();
        LearnGroup group13 = new LearnGroup();
        LearnGroup group14 = new LearnGroup();
        LearnGroup group15 = new LearnGroup();
        LearnGroup group16 = new LearnGroup();
        LearnGroup group17 = new LearnGroup();
        LearnGroup group18 = new LearnGroup();
        LearnGroup group19 = new LearnGroup();

        Student ivanov = new Student("Petrova Anna", "01.05.2005");
        Student petrova = new Student("Ivanov Ivan", "23.08.2005");
        Student smirnov = new Student("Smirnov Alexey", "27.03.2007");
        Student mordyukova = new Student("Mordyukova Nonna", "25.03.1935");
        group1.add(ivanov);
        group1.add(petrova);
        group1.add(smirnov);
        group1.add(mordyukova);

        Iterator<Student> iter = group1.iterator();
        while (iter.hasNext()) {
            System.out.println((iter.next()).toString());
        }
        System.out.println("==============");
//        for(Student student: group1) {
//            System.out.println(student);
//        }

        LearnGroupService service1 = new LearnGroupService();
        service1.setGroup(group1);

        Controller controller1 = new Controller();
        controller1.setLearnGroupService(service1);
        controller1.sortComparator();

//        controller1.remove("Petrova Anna");

//        while (iter.hasNext()) {
//            System.out.println((iter.next()).toString());
//        }
        for(Student student: group1) {
            System.out.println(student);
        }
    }
}
