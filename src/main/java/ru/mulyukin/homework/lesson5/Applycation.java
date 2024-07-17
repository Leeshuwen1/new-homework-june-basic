package ru.mulyukin.homework.lesson5;

import java.util.Arrays;

public class Applycation {
    public static void main(String[] args) {
        printWord(5, "Cat");
        sumMoreFive(4, 6, 23, 4, 2, 7);
        int[] arr = new int[10];
        fillingArray(5, arr);
        System.out.println(Arrays.toString(arr));
        increaseNumber(3, arr);
        System.out.println(Arrays.toString(arr));
        sumHalfArray(3, 51, 1, 5, 7, 3, 7, 1, 10, 3, 6);


    }

    public static void printWord(int a, String word) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }

    public static void sumMoreFive(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("Сумма чисел > 5: = " + sum);
    }

    public static void fillingArray(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
        }
    }

    public static void increaseNumber(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += a;
        }
    }

    public static void sumHalfArray(int... arr) {
        int sumLeftHalf = 0;
        int sunRightHalf = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeftHalf += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sunRightHalf += arr[i];
        }

        if (sumLeftHalf > sunRightHalf) {
            System.out.println("Сумма левой половины массива = " + sumLeftHalf);
        } else {
            System.out.println("Сумма правой половины массива = " + sunRightHalf);
        }
    }

}
