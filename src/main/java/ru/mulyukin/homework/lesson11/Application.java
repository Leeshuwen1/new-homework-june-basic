package ru.mulyukin.homework.lesson11;

import ru.mulyukin.homework.lesson11.Animal.Cat;
import ru.mulyukin.homework.lesson11.Animal.Dog;
import ru.mulyukin.homework.lesson11.Animal.Horse;

public class Application {
    public static void main(String[] args) {
        Cat  cat = new Cat("Barsic", 10, 3, 50);
        Dog  dog = new Dog("Matya", 40, 10, 240);
        Horse  horse = new Horse("Plotva", 67, 10, 80);

        cat.run(100);
        cat.swim(30);
        dog.run(50);
        horse.run(150);
        dog.swim(10);
        dog.swim(10);
        horse.swim(10);

        cat.info();

    }
}
