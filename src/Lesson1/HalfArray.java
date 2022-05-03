package Lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HalfArray {
    /*
    Есть массив чисел, разбить его на 2 половину. поменять половины местами пример: [1,2,3,4,5,6,7,8,9] = > [9,8,7,6,5,1,2,3,4]
     */
    public static void main(String[] args) {
        Random random = new Random();
        //int m = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write size array ");
        int n = scanner.nextInt();

        int[] array = new int [n];

        int middleIndex = array.length / 2;
        int rightIndex = array.length - 1;

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int leftIndex = 0; middleIndex < rightIndex; leftIndex++) {
            int tmp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = tmp;
            rightIndex--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ " + array[i] + " } " );
        }
    }
}