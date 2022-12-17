


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

        System.out.println("Задача №1 вариант for");

        int arr[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, }; // int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерироватьМассив
        System.out.println(arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("Сумма трат за " + (i+1) + " составила " + sum);
        }

        System.out.println("Задача №1 вариант for each");
        arr = generateRandomArray();
        for (int element : arr) {
           sum = sum + element;
          System.out.println(sum);
            break;

        }



    }







}
