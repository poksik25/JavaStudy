package Lesson1;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] array1 = {1,1,1,20,1,3,3,};
        int[] b = {2, 3, 100, 6, 120, 100, 100, 2,120,120,120,22,22,22,1201,12};

        int maxValueOfArrayA = getMaxValueFromArray(array1);
        int maxValueOfArrayB = getMaxValueFromArray(b);

        int countA = getCountOfValueFromArray(array1, maxValueOfArrayA);
        int countB = getCountOfValueFromArray(b, maxValueOfArrayB);

        int[] arrayOfMaxValuesA = createAndFillArray(countA, maxValueOfArrayA);
        int[] arrayOfMaxValuesB = createAndFillArray(countB, maxValueOfArrayB);

        int[] arrayC = createAndMergedArrays(countA, countB, maxValueOfArrayA, maxValueOfArrayB);

        int[] newArrayA = deleteMaxElement(array1, countA, maxValueOfArrayA);
     //   int[] newArrayB = deleteMaxElement(b, countB, maxValueOfArrayB);

    }

    public static int getMaxValueFromArray(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getCountOfValueFromArray(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    public static int[] createAndFillArray(int length, int value) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] createAndMergedArrays(int lengthOfFirstArray, int lengthOfSecondArray, int maxValueOfArrayA, int maxValueOfArrayB) {
        int[] mergedArray = new int[lengthOfFirstArray + lengthOfSecondArray];

        int index = 0;
        while (index < lengthOfFirstArray) {
            mergedArray[index] = maxValueOfArrayA;
            index++;
        }
        while (index < mergedArray.length) {
            mergedArray[index] = maxValueOfArrayB;
            index++;
        }
        System.out.println(Arrays.toString(mergedArray));
        return mergedArray;

    }

    public static int[] deleteMaxElement(int[] array, int countLength, int max) {

        int[] array1 = new int [array.length - countLength];

        for (int i = 0; i < array1.length; i++) {
            if (array[i] != max) {
                for (int j = 0; j < array.length - countLength; j++) {
                    array1[i] = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(array1));
        return array1;
    }
}

