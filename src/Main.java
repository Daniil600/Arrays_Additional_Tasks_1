import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();
        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();

        task6();

    }

    public static void task1() {
        System.out.println("Задание #1");
        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 30) - 15);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int index;
        index = 0;
        int min = 999_999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            } else {
                continue;
            }
        }
        System.out.println("минимальное число в массиве: " + min + " И его индекс: " + index);
    }

    public static void task2() {
        System.out.println("Задание #2");
        int[] arr = new int[11];
        int count_1 = 0;
        int count_2 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_1++;
            } else {
                count_2++;
            }
        }
        if (count_1 > count_2) {
            System.out.println("Цифры 0 в массиве больше");
        } else if (count_1 < count_2) {
            System.out.println("Цифры 1 в массиве больше");
        } else {
            System.out.println("-1");
        }
    }

    public static void task3() {
        System.out.println("Задание #3");
        int[][] arr = new int[8][5];
        int max = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println();

            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) ((Math.random() * 89) + 10);
                System.out.print(arr[i][j] + " ");
            }
        }

    }

    public static void task4() {
        System.out.println("Задание #4");
        int[][] arr = new int[5][8];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = (int) ((Math.random() * 189) - 99);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } else {
                    continue;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Максимальное значение в массиве: " + max);
    }

    public static void task5() {

        System.out.println("Задание 5");

        int[][] arr = new int[4][7];
        int[] max = new int[4];
        int b = 1;
        int maxIndex = 0;
        int maxIndexCon;


        for (int i = 0; i < 4; i++) {
            System.out.println();

            for (int j = 0; j < 7; j++) {
                arr[i][j] = (int) ((Math.random() * 10) - 5);
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.println();
            b = 1;
            for (int j = 0; j < 7; j++) {
                b *= arr[i][j];
            }
            max[i] = b;
            System.out.print(max[i] + " ");
        }
        maxIndexCon = max[0];
        for (int d = 0; d < max.length; d++) {
            if (maxIndexCon < max[d]) {
                maxIndex = d;
                maxIndexCon = max[d];
            } else {
                continue;
            }
        }
        System.out.println();
        System.out.println("Индекс наибольшего произведения " + maxIndex);
    }

    public static void task6() {
        int[][] arr = new int[6][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomArray(0, 9, 7);
        }

        for (int[] subArr : arr) {
            System.out.println(Arrays.toString(subArr));
        }

        for (int[] subArr : arr) {
            int maxElement = subArr[0];
            int maxElementIndex = 0;
            for (int i = 1; i < subArr.length; i++) {
                if (subArr[i] > maxElement) {
                    maxElement = subArr[i];
                    maxElementIndex = i;
                }
            }
            if (maxElementIndex > 0) {
                int tmp = subArr[0];
                subArr[0] = maxElement;
                subArr[maxElementIndex] = tmp;
            }
        }
        System.out.println("После преобразований:");
        for (int[] subArr : arr) {
            System.out.println(Arrays.toString(subArr));
        }
    }

    private static int[] generateRandomArray(int min, int max, int size) {
        Random random = new Random();
        int bound = max + 1 - min;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(bound) + min;
        }
        return result;
    }
}
