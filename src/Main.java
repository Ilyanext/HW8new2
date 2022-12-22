public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //task1
    public static void task1() {
        int[] arr = generateRandomArray();
        int sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSalary += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей.");
        System.out.println();
    }

    //task2
    public static void task2() {
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            } else if (minNumber > arr[i]) {
                minNumber = arr[i];
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма трат за день составила " + maxNumber + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + minNumber + "рублей.");
        System.out.println();

    }

    public static void task3() {
        int[] arr = generateRandomArray();
        double arithmeticMean = 0.d;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arithmeticMean += arr[i];
        }
        arithmeticMean = arithmeticMean / 30;
        System.out.println();
        System.out.println("Средняя сумма тратза месяц составила " + arithmeticMean + " рублей.");
        System.out.println();
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int index = -1;

        for (int i = 0; i < reverseFullName.length; i++) {
            index += 1;
        }
        for (; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
        System.out.println();
    }
}