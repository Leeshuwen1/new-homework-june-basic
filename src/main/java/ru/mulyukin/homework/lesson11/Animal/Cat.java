package ru.mulyukin.homework.lesson11.Animal;

public class Cat extends Animal{
    public Cat(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }
    @Override
        public Integer swim(int distance) {
        System.out.println(name + " плавать не умеет");
        return distance;
        }
}
