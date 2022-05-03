package Lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VariousNumbers {
    public static void main(String[] args) {

        int[] arr = {9, 0, 8, 0, 13, 2, 4, 42, 5, 7, 8, 4, 3, 9, 2, 1, 7, 0, 6, 4, 1, 2};
        int[] counter = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
        System.out.println(counter);

        // System.out.println("value\t count");
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "\t" + counter[i]);
        }
    }
}
