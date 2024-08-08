package ru.mulyukin.homework.lesson11.Animal;

public abstract class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;


    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public Integer run(int distance) {
        int time = distance / runningSpeed;
        int endurancePower = distance - endurance;
        if (endurancePower >= 0) {
            System.out.println(name + " Устал");
            return -1;
        }else{
            System.out.println(name + " пробежал дистацию за " + time + " минуты " + " выносливость " + endurancePower );
        }
        return time;
    }

    public abstract Integer swim(int distance);


    public void info() {
        System.out.println(name + " выносливость " + endurance);
    }
}
