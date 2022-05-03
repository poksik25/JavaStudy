package Lesson1;

import java.util.Arrays;

public class LessonMethod {
    public static void main(String[] args) {

        int[] mas1 = {33, 32, 31, 34};
        int[] mas = {3, 3, 3, 3};
        multiElement(mas, 10);
        System.out.println(Arrays.toString(mas));

        multiElement(new int[]{2, 2, 3, 3, 2,}, 10); // оно бы не вывелось, если бы я не написал вывод в методе. Потому что
        // мы не имеем имени массива

        System.out.println();

// возвращаемый метод
        getStrLength("vasya");// не работает.
        int a = getStrLength("AAAA BDBD");
        System.out.println(a);
        System.out.println(getStrLength("AAAAAAAAAAAA"));

        for (int i : compareArrays(mas, mas1)) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] x = compareArrays(new int[]{4,4,4,4,}, new int[]{4,4,4,34,4,24});
        int k = 0;
        while (k < x.length){
            System.out.print(x[k] + ", ");
            k++;
        }


    }

    public static void multiElement(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * value;
            System.out.print(array[i] + " ");
        }
    }

    public static int getStrLength(String str) {
        int strLength = str.length();
        return strLength;
    }

    public static int[] compareArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int j = 0;
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[j];
            j++;
        }
        return c;

    }
}
