import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //Task 1  Обмен значений
        method_1(1, 2);

        //Task 2 Конец уроков
        method_2(3, 9);

        //Task 3 Разность времен
        method_3(new int[]{1, 1, 1}, new int[]{2, 2, 2});

        //Task 4 Автопробег
        method_4(700, 750);

        //Task 5 Улитка
        method_5(20, 7, 3);

        //Task 6 Максимум
        method_6(5, 8);

        //Task 7 Ладья
        method_7(new int[]{1, 1}, new int[]{2, 2});

        //Task 8 Количество равных из трех
        method_8(1, 2, 2);

        //Task 9 Количество элементов, больших предыдущего
        method_9(5, new int[]{1, 2, 3, 4, 5});

        //Task 10 Количество элементов больших обоих соседей
        method_10(5, new int[] {1, 5, 1, 5, 1});

        //Task 11 Переставить соседние элементы
        method_11(7, new int[]{4, 5, 3, 4, 2, 3, 1});
    }

    private static void method_1(int a, int b) {
        System.out.printf("1) a = %d, b = %d\n", a, b);

        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("result: a = %d, b = %d\n\n", a, b);
    }

    private static void method_2(int lesson, int start) {
        System.out.printf("2) Lesson: %d\n", lesson);

        int sumOfBreaks = lesson / 2 * 5 + (lesson - 1) / 2 * 15;
        int minutes = 45 * lesson + sumOfBreaks;
        int timeInHours = minutes / 60 + start;
        int timeInMinutes = minutes % 60;
        System.out.printf("result: %d:%d\n\n", timeInHours, timeInMinutes);
    }

    private static void method_3(int[] time_1, int[] time_2) {
        System.out.println("3) time_1: " + Arrays.toString(time_1) + ", time_2: " + Arrays.toString(time_2));

        int sec_1 = time_1[0] * 3600 + time_1[1] * 60 + time_1[2];
        int sec_2 = time_2[0] * 3600 + time_2[1] * 60 + time_2[2];
        int sec_3 = sec_2 - sec_1;
        System.out.printf("result: %d\n\n", sec_3);
    }

    private static void method_4(int n, int m) {
        System.out.printf("4) n: %d, m: %d\n", n, m);

        int result = (m + n - 1) / n;
        System.out.printf("result: %d\n\n", result);
    }

    private static void method_5(int h, int a, int b) {
        System.out.printf("5) h: %d, a: %d, b: %d\n", h, a, b);
        int h0 = h - a;
        int step = a - b;
        int result = 1 + (h - b - 1) / step;
        System.out.printf("result: %d\n\n", result);
    }

    private static void method_6(int a, int b) {
        System.out.printf("6) a: %d, b: %d\n", a, b);
        int result = (((a + b) / b - 1) * a + ((a + b) / a - 1) * b) / (a / b + b / a);
        System.out.printf("result: %d\n\n", result);

    }

    private static void method_7(int[] coordinatesOfRook, int[] coordinatesOfOtherFigure) {
        System.out.println("7) Rook: " + Arrays.toString(coordinatesOfRook) + ", other:" + Arrays.toString(coordinatesOfOtherFigure));
        if (((coordinatesOfRook[0] - coordinatesOfOtherFigure[0]) * (coordinatesOfRook[1] - coordinatesOfOtherFigure[1])) == 0) {
            System.out.println("result: Yes\n");
        } else
            System.out.println("result: No\n");
    }

    private static void method_8(int a, int b, int c) {
        System.out.printf("8) a: %d, b: %d, c: %d\n", a, b, c);
        boolean[] coincidence = {a == b, a == c, b == c};
        int result = 0;
        if (coincidence[0] && coincidence[1] && coincidence[2])
            result = 3;
        else if (coincidence[0] || coincidence[1] || coincidence[2])
            result = 2;

        System.out.printf("result: %d\n\n", result);
    }

    private static void method_9(int n, int[] arr) {
        if (n < 1 && n > 10000)
            return;

        System.out.println("9) n: " + n + ", arr: " + Arrays.toString(arr));
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i])
                count++;
        }

        System.out.printf("result: %d\n\n", count);

    }

    private static void method_10(int n, int[] arr) {
        if (n < 1 && n > 100)
            return;
        int count = 0;
        System.out.println("10) n: " + n + ", arr: " + Arrays.toString(arr));

        for (int i = 1; i < n; i = i + 2) {
            if (arr[i - 1] > arr[i] || arr[i] < arr[i + 1]) {
            } else
                count++;
        }
        System.out.printf("result: %d\n\n", count);


    }

    private static void method_11(int n, int[] arr) {
        if (n < 1 && n > 35)
            return;
        int temp;
        System.out.println("11) n: " + n + ", arr: " + Arrays.toString(arr));
        for (int i = 1; i < n; i = i + 2) {
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;

        }
        System.out.println("result: " + Arrays.toString(arr));
    }

}
