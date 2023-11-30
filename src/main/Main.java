package main;

/**
 * Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел
 * и выполняет следующие действия:
 * a. Рассчитывает среднее значение каждого списка.
 * b. Сравнивает эти средние значения и выводит соответствующее сообщение:
 * - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
 * - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
 * - ""Средние значения равны"", если средние значения списков равны.
 */

public class Main {
    public static void main(String[] args){

        Controller controller = new Controller();

        int[] array1 = controller.createArray();
        double averageArray1 = controller.averageArray(array1);

        int[] array2 = controller.createArray();
        double averageArray2 = controller.averageArray(array2);

        controller.compareArray(averageArray1, averageArray2);
    }
}
