public class Main {
    // Необходимо реализовать следующий метод:
    // 1. Получаем на входе массив чисел
    // 2. Все четные числа увеличиваем на единицу
    // 3. Возвращаем кусок списка с 3-го по 7-й элемент


    public static int[] oddArray (int number, int max, int first, int last) {
        java.util.Random random = new java.util.Random();
        int [] regularArray = new int[number];
        System.out.println("Печать случайно сгенерированного массива");
        for (int i = 0; i < regularArray.length; i++) {
            regularArray[i] = random.nextInt(max);
            if (i == regularArray.length - 1) {
                System.out.print(regularArray[i]);
                break;
            }
            if (regularArray[i] % 2 == 0) {
                regularArray[i]++;
            }
            System.out.print(regularArray[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Массив с " + first + " элемента массива по " + last + ":");
        for (int i = first-1; i <= last-1; i++) {
            if (i == last - 1) {
                System.out.print(regularArray[i]);
                break;
            }
            System.out.print(regularArray[i] + ", ");
        }
        return regularArray;
    }
    public static void main(String[] args) {
        oddArray(15, 1000, 3, 7);
    }
}