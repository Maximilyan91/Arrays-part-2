


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

        public static int[] generateRandomArray() { // объявление метода сгенерировать массив
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

        // Задача 1.
    public static void task1() {
        System.out.println("Задача №1 вариант for:");
        int sum = 0;
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерироватьМассив

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Варинат for each

        System.out.println("Задача №1 вариант for each:");
        sum = 0;
        for (int element : arr) {
           sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    // Задача 2.

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxValue = 99999;
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

   //Задача 3.
    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double middleValue = (double)sum/(arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + middleValue + " рублей");

    }
}
