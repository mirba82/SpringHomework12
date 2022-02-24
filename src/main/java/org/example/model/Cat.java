package org.example.model;

public class Cat implements Animal {
    private String name;
    private String breed;

    public Cat() {
    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public void animalPlus() {
        System.out.println(name +": Myshyktyn plusu kop");

    }

    @Override
    public void animalMinus() {
        System.out.println(name + ": Myshyktyn minusu jokko ese!");
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '.';
    }
}
