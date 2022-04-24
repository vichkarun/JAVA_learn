package task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstValue = 1;
        int lastValue = 12;
        int factorial = 1;


        System.out.println("Введите число");


        int value = new Scanner(System.in).nextInt();

        for (value = 1; value <= 12; value = value - 1) {
            factorial  *= value;

        }
        System.out.println("Факториал равен:" + factorial);

        }

    }



