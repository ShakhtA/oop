package ru.geekbrains.lesson7.observer;



import java.util.ArrayList;
import java.util.Random;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */

    static Random random = new Random();


    static JobSeeker generateJobSeeker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int levelIndex = random.nextInt(4);
        switch (levelIndex)
        {
            case 0:
                return new Student(names[random.nextInt(10)] + " " + surnames[random.nextInt(10)]);
            case 1:
                return new Junior(names[random.nextInt(10)] + " " + surnames[random.nextInt(10)]);
            case 2:
                return new Middle(names[random.nextInt(10)] + " " + surnames[random.nextInt(10)]);
            case 3:
                return new Master(names[random.nextInt(10)] + " " + surnames[random.nextInt(10)]);
        }
        return null;
    }

    static ArrayList<JobSeeker> generateJobSeeker(int count){
        ArrayList<JobSeeker> jobSeekers = new ArrayList<>();
        for (int i = 0; i < count; i++){
            jobSeekers.add(generateJobSeeker());
        }
        return jobSeekers;
    }
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 120000);
        Company yandex = new Company(jobAgency, "Yandex", 95000);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000);

        System.out.println("Список соискателей работы:");
        for (JobSeeker jobSeeker : generateJobSeeker(10)) {
            jobAgency.registerObserver(jobSeeker);
            System.out.println(jobSeeker);
        }

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
