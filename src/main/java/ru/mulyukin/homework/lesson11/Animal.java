package ru.mulyukin.homework.lesson11;

public abstract class Animal {
    String name;
    Integer runningSpeed;
    Integer swimmingSpeed;
    Integer endurance;

    public Animal(String name, Integer runningSpeed, Integer swimmingSpeed, Integer endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    public Integer run(int distance) {
        int time = distance / runningSpeed;
        int endurancePower = distance - (endurance);

        if (endurancePower >= 0) {
            System.out.println(name + " Устал");
            return -1;
        }else{
            System.out.println(name + " пробежал дистацию за " + time + " минуты");
        }
        return time;
    }

    public abstract Integer swim(int distance);


    public void info() {
        System.out.println(name + " выносливость " + endurance);
    }
}
