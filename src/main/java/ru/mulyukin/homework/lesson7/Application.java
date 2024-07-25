package ru.mulyukin.homework.lesson7;

import java.lang.reflect.Array;

public class Application {
    public static void main(String[] args) {
        int[][] array = {{3, 5, 6, 2}, {1, 1, 1, 1}, {10, -4, 1, 1}, {5, 5, 51, 11}};
       // System.out.println(sumOfPositiveElements(array));
      //  print(array);
       // reset(array);
       // print(array);
      //  System.out.println(findMax(array));
        System.out.println(sumSecondLine(array));
       // cube(10);


    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void cube(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    array[i][j] = '*';
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void reset(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length < 2) {
                    return -1;
                }else if(i == 1){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
