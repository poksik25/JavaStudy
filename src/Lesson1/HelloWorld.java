package Lesson1;

import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        int[] input = {2, 7, 4, 34, 9, 7, 2,2,2,2,2};

        System.out.println(Arrays.toString(input));

        int[] uniqueArray = getUniqueArray(input);//создание массива из не повторяющихся элементов

        System.out.println("Unique array:"); // вывод массива из не повторяющихся элементов
        for (int i : uniqueArray) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        int[] uniqueQuantities = getUniqueQuantities(input, uniqueArray); //количество повторений элементов
        System.out.println("Quantities:");
        for (int i : uniqueQuantities) {
            System.out.print(i + " ");
        }
        System.out.println(" ");


        if (uniqueQuantities.length == uniqueArray.length) {
            for (int i = 0; i < uniqueQuantities.length; i++) {
                System.err.println(uniqueArray[i] + " " + uniqueQuantities[i]);
            }
        } else {
            System.err.println("Mistake!!");
        }
    }

    public static int[] getUniqueQuantities(int[] initialArr, int[] uniqueArr) {
        int[] uniqueQuantities = new int[uniqueArr.length];

        for (int i = 0; i < uniqueQuantities.length; i++) {
            for (int j = 0; j < initialArr.length; j++) {
                if (uniqueArr[i] == initialArr[j]) {
                    uniqueQuantities[i]++;
                }
            }
        }

        return uniqueQuantities;
    }

    public static int[] getUniqueArray(int[] arr) {
        int[] result = new int[arr.length];
        int quantity = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean contains = false;
            for (int j = 0; j < quantity; j++) {
                if (result[j] == arr[i]) {
                    contains = true;
                    break;
                }
            }

            if (!contains) {
                result[quantity++] = arr[i];
            }
        }


        int[] shortenArr = new int[quantity];
        for (int i = 0; i < shortenArr.length; i++) {
            shortenArr[i] = result[i];
        }

        return shortenArr;
    }
}

