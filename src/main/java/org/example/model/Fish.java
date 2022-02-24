package org.example.model;

import org.example.model.Animal;

public class Fish implements Animal {
    private String name;
    private String color;

    public Fish() {
    }

    public Fish(String name, String color) {
        this.name = name;
        this.color = color;

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

    @Override
    public void animalPlus() {
        System.out.println("Balyktyn Plusu maanaidy kotorot!");

    }
    @Override
    public void animalMinus() {
        System.out.println("Balyktyn minusu kaprizduu uhod kerek!");
    }

    @Override
    public String toString() {
        return "Fish: " +
                "name= '" + name + '\'' +
                ", color='" + color;
    }

}
