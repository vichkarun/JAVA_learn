package task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1) {
            if (value % i != 0) {
                continue;
            }
            for (int y = value; y >= 1; y = y - 1) {
                if (value != i * y) {
                    continue;
                }
                System.out.println(i + "*" + y);
            }
        }

    }
}
