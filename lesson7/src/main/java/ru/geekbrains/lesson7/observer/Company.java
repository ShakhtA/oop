package ru.geekbrains.lesson7.observer;

import java.util.*;

public class Company {

    private Random random = new Random();

    /**
     * Ссылка на агенство, с которым работает компания
     */
    Publisher jobAgency;

    /**
     * Имя компании
     */
    private String name;

    /**
     * Максимальная зарплата, которую может выплачивать компания
     */
    private int maxSalary;

    /**
     * Список соискателей, откликнувшихся на поданую вакансию
     */
    private List<JobSeeker> jobSeekersList = new ArrayList<>();

    /**
     * Конструктор класса
     * @param jobAgency
     * @param name
     * @param maxSalary
     */
    public Company(Publisher jobAgency, String name, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void setJobSeekersList(JobSeeker observer) {
        jobSeekersList.add(observer);
    }

    public void getJobSeekersList() {
        if (jobSeekersList.size() != 0) {
            System.out.println("\n" + "=".repeat(20));
            System.out.println("Список откликнувшихся соискателей:");
            for (JobSeeker jobSeeker:jobSeekersList) {
                System.out.printf(jobSeeker.getName() + "; ");
            }
            System.out.println();
        } else {
            System.out.println("\n" + "=".repeat(20));
            System.out.println("Соискателей нет");

        }
    }

    public String getName() {
        return name;
    }

    /**
     * Отправка вакансии агенству
     */
    public void needEmployee(){
            Vacancy vacancy = new Vacancy(this, SpecialityType.randomSpeciality(), random.nextInt(maxSalary));
        System.out.println(vacancy);
        System.out.println("=".repeat(20));
        jobAgency.sendOffer(vacancy);
        getJobSeekersList();
        jobAgency.removeObserver((Observer) maxRating());
        jobSeekersList.clear();
    }

    /**
     * Получение баллов соискателем по результатам собеседования
     * @return количество баллов, полученных соискателем на собеседовании
     */
    public JobSeeker maxRating() {
        if (jobSeekersList.size() != 0) {
            Collections.sort(jobSeekersList);
            System.out.println("\n" + "=".repeat(20));
            for (JobSeeker jobSeeker : jobSeekersList) {
                System.out.printf("%s Rating: %d; ", jobSeeker.getName(), jobSeeker.getRaiting());
            }
            System.out.println();
            System.out.printf("%s принят на работу\n", jobSeekersList.get(jobSeekersList.size() - 1).getName());
            return jobSeekersList.get(jobSeekersList.size() - 1);
        } else {
            return null;
        }
    }

}
