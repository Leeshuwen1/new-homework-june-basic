package ru.mulyukin.homework.lesson11;

public class Cat extends Animal{
    public Cat(String name, Integer runningSpeed, Integer swimmingSpeed, Integer endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }
    @Override
        public Integer swim(int distance) {
        System.out.println(name + " плавать не умеет");
        return distance;
        }
}
