package org.example.model;

import java.lang.ref.PhantomReference;

public class Wife {
    private String name;
    private int age;
   private Animal animal;


    public Wife() {
    }

    public Wife(String name, int age, Animal animal) {
      this.name = name;
      this.age = age;
        this.animal= animal;
    }
    public void minusPlusImplCat(){
        animal.animalMinus();
        animal.animalPlus();
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
        return "Jena: "+name+","+" "+
               "Age: "+ age+"\n"+
                "Animal "+ animal;
    }


}
