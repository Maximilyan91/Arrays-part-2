


public class Main {
    public static void main(String[] args) {
        task1();
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
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Варинат for each

        System.out.println("Задача №1 вариант for each:");
        int sum1 = 0;
        for (int element : arr) {
           sum1 = sum1 + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей");
    }

}
