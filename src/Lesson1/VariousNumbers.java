package Lesson1;

import java.util.Arrays;

public class VariousNumbers {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 4, 4, 4, 6, 7, 9, 9, 2};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count = count + 1;
                    break;
                }
            }
        }
        int lengthOfUniqueArray = array.length - count;

        int[] uniqueArray = new int[lengthOfUniqueArray];

        System.out.println(getUniqueQuantities(array, uniqueArray));
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

}

