package ru.mulyukin.homework.lesson9;

public class Box {
    private String color;
    private int size;
    private String[] box;
    private boolean open;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
        this.box = new String[1];
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

    public boolean isOpen(boolean opening) {
        if (opening == true) {
            open = opening;
            System.out.println("Коробка открыта ");
            return true;
        } else {
            System.out.println("Коробка закрыта ");
            return false;
        }
    }

    public void put(String item) {
        if (open == false) {
            System.out.println("Коробка закрыта, откройте коробку");
            return;
        }
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                box[i] = item;
                System.out.println("Вы положили " + item);
            } else {
                System.out.println("Коробка заполнена, вы не можете положить " + item + " освободите коробку");
            }
        }
    }

    public void output() {
        for (int i = 0; i < box.length; i++) {
            if (this.box[i] != null) {
                box[i] = null;
                System.out.println("Коробка пуста, можете положить предмет");
            }
        }
    }
}

