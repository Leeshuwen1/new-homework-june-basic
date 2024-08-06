package ru.mulyukin.homework.lesson11.Animal;

public class Dog extends Animal{
    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public Integer swim(int distance) {
        int time = distance / swimmingSpeed;
        int endurancePower = distance - (endurance / 2);
        if (endurancePower >= 0) {
            System.out.println(name + " Устал");
            return -1;
        }else{
            System.out.println(name + " проплыл дистацию за " + time + " минуты " + " выносливость " + endurancePower);
        }
        return time;
    }
}
