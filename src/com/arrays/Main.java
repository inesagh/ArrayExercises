package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        4.1
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) Math.floor(10 + (Math.random() * 89));
            System.out.println(arr1[i]);
        }
        System.out.println("Enter a number between 0 and 99: \r");
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(a == arr1[i]) count++;
        }
        if(count != 0) System.out.println("Yes");
        else System.out.println("No");

//        4.2
//        int[] arr2 = new int[10];
//        System.out.println("Unsorted array: ");
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = (int) Math.floor(10 + (Math.random() * 89));
//            System.out.println(arr[i]);
//        }
//        boolean k = true;
//        while(k){
//            k = false;
//            for (int i = 0; i < arr2.length - 1; i++) {
//                int a = arr2[i];
//                if(arr2[i] > arr2[i + 1]){
//                    arr2[i] = arr2[i + 1];
//                    arr2[i + 1] = a;
//                    k = true;
//                }
//            }
//        }
//        System.out.println("Sorted array: ");
//        for (int i : arr2) {
//            System.out.println(i);
//        }

//        4.3
//        int[] arr3 = new int[10];
//        System.out.println("Unsorted array: ");
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = (int) Math.floor(10 + (Math.random() * 89));
//            System.out.println(arr3[i]);
//        }
//        boolean k = true;
//        while(k){
//            k = false;
//            for (int i = 0; i < arr3.length - 1; i++) {
//                int a = arr3[i];
//                if(arr3[i] < arr3[i + 1]){
//                    arr3[i] = arr3[i + 1];
//                    arr3[i + 1] = a;
//                    k = true;
//                }
//            }
//        }
//        System.out.println("Sorted array: ");
//        for (int i : arr3) {
//            System.out.println(i);
//        }

//        4.4
//        Scanner scanner1 = new Scanner(System.in);
//        int[] arr4 = new int[10];
//        for (int i = 0; i < arr4.length; i++) {
//            arr4[i] = (int) Math.floor(10 + (Math.random() * 89));
//            System.out.println(arr4[i]);
//        }
//        System.out.println("Enter a number between 0 and 99: \r");
//        int a = scanner1.nextInt();
//        int index = -1;
//        for (int i = 0; i < arr4.length; i++) {
//            if(a == arr4[i]) index = i;
//        }
//        if(index == -1) System.out.println("This number does not exist.");
//        else System.out.println("Index of the number equals " + index);

//        4.5
//        int[][] arr5 = new int[10][15];
//        for (int i = 0; i < arr5.length; i++) {
//            for (int j = 0; j < arr5[i].length; j++) {
//                arr5[i][j] = (int) Math.floor(10 + Math.random() * 89);
//                System.out.print(arr5[i][j] + " ");
//            }
//            System.out.println();
//        }
//        boolean b = true;
//        while(b){
//            b = false;
//            for (int i = 0; i < arr5.length; i++) {
//                for (int j = 0; j < arr5[i].length - 1; j++) {
//                    int a = arr5[i][j + 1];
//                    if(arr5[i][j] > arr5[i][j + 1]){
//                        arr5[i][j + 1] = arr5[i][j];
//                        arr5[i][j] = a;
//                        b = true;
//                    }
//                }
//            }
//        }
//        System.out.println();
//        int min = arr5[0][0];
//        for (int i = 0; i < 10; i++) {
//            if(arr5[i][0] < min){
//                min = arr5[i][0];
//            }
//        }
//        System.out.println(min);

//        4.6
//        Scanner scanner6 = new Scanner(System.in);
//        int[][] arr6 = new int[10][15];
//        for (int i = 0; i < arr6.length; i++) {
//            for (int j = 0; j < arr6[i].length; j++) {
//                arr6[i][j] = (int) Math.floor(10 + Math.random() * 89);
//                System.out.print(arr6[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter a row number: ");
//        int rowNumber = scanner6.nextInt();
//        int sum = 0;
//        for (int i = 0; i < arr6[rowNumber].length; i++) {
//            sum += arr6[rowNumber][i];
//        }
//        System.out.println("Sum = " + sum);

//        4.7
//        int[][] arr7 = new int[10][15];
//        for (int i = 0; i < arr7.length; i++) {
//            for (int j = 0; j < arr7[i].length; j++) {
//                arr7[i][j] = (int) Math.floor(10 + Math.random() * 89);
//                System.out.print(arr7[i][j] + " ");
//            }
//            System.out.println();
//        }
//        rotate90(arr7);


//        4.8
//        int[][] arr8 = new int[10][15];
//        for (int i = 0; i < arr8.length; i++) {
//            for (int j = 0; j < arr8[i].length; j++) {
//                arr8[i][j] = (int) Math.floor(10 + Math.random() * 89);
//                System.out.print(arr8[i][j] + " ");
//            }
//            System.out.println();
//        }
//        rotate180(arr8);

//        4.9
//        int[][] arr9 = new int[10][15];
//        for (int i = 0; i < arr9.length; i++) {
//            for (int j = 0; j < arr9[i].length; j++) {
//                arr9[i][j] = (int) Math.floor(10 + Math.random() * 89);
//                System.out.print(arr9[i][j] + " ");
//            }
//            System.out.println();
//        }
//        rotate270(arr9);

//        4.10
//        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) Math.floor(10 + Math.random() * 89);
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        Scanner scanner10 = new Scanner(System.in);
//        System.out.println();
//        instructions();
//        boolean stop = false;
//        while(!stop){
//            System.out.println("Enter your choice: ");
//            int choice = scanner10.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("90° rotated array ");
//                    rotate90(array);
//                    break;
//                case 2:
//                    System.out.println("180° rotated array ");
//                    rotate180(array);
//                    break;
//                case 3:
//                    System.out.println("270° rotated array ");
//                    rotate270(array);
//                    break;
//                case 4:
//                    System.out.println("Thanks!");
//                    stop = true;
//                    break;
//            }
//        }

//        4.11
//        int[] array1 = {1, 5, 22, 80};
//        int[] array2 = {10, 33, 34, 1000, 1000000};
//        int[] array3 = new int[array1.length + array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            array3[i] = array1[i];
//        }
//        for (int i = 0; i < array2.length; i++) {
//            array3[i + array1.length] = array2[i];
//        }
//        boolean d = true;
//        while(d){
//            d = false;
//            for (int i = 0; i < array3.length - 1; i++) {
//                int a = array3[i];
//                if(array3[i] > array3[i + 1]){
//                    array3[i] = array3[i + 1];
//                    array3[i + 1] = a;
//                    d = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array3));

//        4.12
//        Integer[] array12 = {1, 2, 3, 4, 3, 3, 5, 1, 4, 4, 4};
//        int k = 2;
//        Integer number = null;
//        for (int i = 0; i < array12.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array12.length; j++) {
//                if(array12[i] == array12[j]) count++;
//            }
//            if(k == count) number = array12[i];
//        }
//        System.out.println(number);

    }
    public static void instructions(){
        System.out.println("-----------MENU----------");
        System.out.println("1 - For rotating 90°");
        System.out.println("2 - For rotating 180°");
        System.out.println("3 - For rotating 270°");
        System.out.println("4 - For Exit");
    }
    public static void rotate90(int[][] array){
        int[][] rotatedArr90 = new int[array[0].length][array.length];
        for (int i = 0; i < rotatedArr90.length; i++) {
            for (int j = 0; j < rotatedArr90[i].length; j++) {
                rotatedArr90[i][array.length - 1 - j] = array[j][i];;
            }
        }
        for (int i = 0; i < rotatedArr90.length; i++) {
            for (int i1 = 0; i1 < rotatedArr90[i].length; i1++) {
                System.out.print(rotatedArr90[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void rotate180(int[][] array){
        int[][] rotatedArr180 = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rotatedArr180[array.length - 1 - i][array[i].length - 1 - j] = array[i][j];
            }
        }
        for (int i = 0; i < rotatedArr180.length; i++) {
            for (int i1 = 0; i1 < rotatedArr180[i].length; i1++) {
                System.out.print(rotatedArr180[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void rotate270(int[][] array){
        int[][] rotatedArr270 = new int[array[0].length][array.length];
        for (int i = 0; i < rotatedArr270.length; i++) {
            for (int j = 0; j < rotatedArr270[i].length; j++) {
                rotatedArr270[rotatedArr270.length - 1 - j][i] = array[i][j];
            }
        }
        for (int i = 0; i < rotatedArr270.length; i++) {
            for (int i1 = 0; i1 < rotatedArr270[i].length; i1++) {
                System.out.print(rotatedArr270[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
