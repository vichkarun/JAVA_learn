package task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstValue = 1;
        int lastValue = 12;
        int result = 1;

        System.out.println("Введите число");


        int value = new Scanner(System.in).nextInt();
        for (value = firstValue; value <= lastValue; value = value + 1) {
            result = result * value;

        System.out.println("Факториал равен:" + result);
        }


        System.out.println("Факториал не найден");
}
