package org.example.model;

import org.example.model.Animal;

public class Person {
    private String name;
    private int age;
    private Animal animal;

    public Person() {
    }
public void minusPlusImpl(){
        animal.animalMinus();
        animal.animalPlus();
}
    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return " Person: " +
                "name= " + name + '\'' +
                ", age= " + age +
                ",\n animal= " + animal;

    }
    
}
