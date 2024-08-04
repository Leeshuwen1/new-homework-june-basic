package ru.mulyukin.homework.lesson11;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsic", 10, 3, 50);
        Dog dog = new Dog("Matya", 40, 10, 240);
        Horse horse = new Horse("Plotva", 67, 10, 80);

        cat.run(100);
        cat.swim(30);
        dog.run(50);
        horse.run(150);
        dog.swim(10);
        horse.swim(10);

        cat.info();

    }
}
