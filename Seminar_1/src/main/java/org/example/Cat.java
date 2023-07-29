package org.example;

public class Cat {
    private String name;
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
       this.name = name;
        this.color = color;
        this.age = age;
    }
    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void voice() {
        System.out.println(("Издает звук"));
    }

    public void info() {
        System.out.printf("Животное по имени %s, цвета %s, %d лет", name, color, age);
    }
}
