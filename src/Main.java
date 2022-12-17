


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

        public static int[] generateRandomArray() { // объявление метода сгенерировать массив
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }


    public static void task1() {
        int sum = 0;
        System.out.println("Задача №1 вариант for:");

        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерироватьМассив

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Варинат for each

        System.out.println("Задача №1 вариант for each:");
        int sum1 = 0;
        for (int element : arr) {
           sum1 += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей");
    }

    // Задача 2.

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxValue = -1;
        int minValue = 200001;
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        for (int j : arr) {
            if (j < minValue) {
                minValue = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxValue);
        System.out.println("Минимальная сумма трат за день составила " + minValue);
    }
}
