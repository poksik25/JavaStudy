package Lesson1;

public class ObjectsAndMethod {
    public static void main(String[] args) {
        int[] array = {2, 3, 3, 3, 3, 2};

        print(arrayThird(array));
        System.out.println();
        print(array);
    }

    public static int[] arrayThird(int[] a) {
        int count = 0;//счетчик 3

        for (int i = 0; i < a.length; i++){
            if (a[i] == 3) {
                count++;
            }
        }
        int[] c = new int[count];
        for (int i = 0; i < c.length; i++) {
            c[i] = 3;
        }
        System.out.println(count);
        return c;

    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
