package ru.homeWork.lesson_2;
import java.util.Arrays;

public class homeWork {
    public static void main(String[] args) {

        int[] mas1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // Задание 1
        System.out.println(Arrays.toString(mas1));
        masWork(mas1);
        System.out.println(Arrays.toString(mas1));


        int[] mas2 = new int[8]; // Задание 2
        masWork2(mas2);
        System.out.println(Arrays.toString(mas2));


        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Задание 3
        System.out.println(Arrays.toString(mas3));
        masWork3(mas3);
        System.out.println(Arrays.toString(mas3));


        masWork4(); // Задание 4

        masWork5(); // Задание 5


    }

    public static void masWork(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void masWork2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    public static void masWork3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void masWork4() {
        int[][] mas4 = new int[5][5];
        for (int i = 0; i < mas4.length; i++) {
            for (int j = 0; j < mas4[i].length; j++) {
                //mas4[i][j] = (i+1) * (j+1);
                if (i == j || i == (mas4.length - 1)-j){
                    mas4[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(mas4[i]));

        }

    }



    public static void masWork5() {
        int[] mas5 = {1, 5, 3, 2, 11, 4, 8, 9, 6};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < mas5.length; i++) {
            if (mas5[i] > mas5[indexOfMax]) {
                indexOfMax = i;
            } if (mas5[i] < mas5[indexOfMin]) {
                indexOfMin = i;
            }
        }
            //System.out.println(indexOfMax + " " + indexOfMin);
        int maxOut = mas5[indexOfMax];
        int minOut = mas5[indexOfMin];
        System.out.println("Максимальный элемент в массиве: " + maxOut + " Минимальный элемент в массиве: " + minOut);
    }
}

