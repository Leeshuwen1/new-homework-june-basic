package ru.mulyukin.homework.lesson9;

public class Box {
    private String color;
    private int size;
    private String[] items;
    private boolean open;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
        this.items = new String[1];
        this.open = false;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void info() {
        System.out.println("Коробка цвета " + color + " размер " + size);
    }


    public boolean open() {
        System.out.println("Вы открыли коробку");
        return open = true;
    }

    public boolean close() {
        System.out.println("Коробка закрыта");
        return open = false;
    }

    public void put(String item) {
        if (open == false) {
            System.out.println("Коробка закрыта, откройте коробку");
            return;
        } else {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = item;
                    System.out.println("Вы положили " + item);
                    return;
                }
            }
        }
        System.out.println("Коробка заполнена, вы не можете положить " + item + " освободите коробку");
    }


    public void output() {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i] != null) {
                items[i] = null;
                System.out.println("Коробка пуста, можете положить предмет");
            }
        }
    }
}




