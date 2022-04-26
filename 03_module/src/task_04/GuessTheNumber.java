package task_04;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int value = new Random().nextInt(100);

        while (true) {
            System.out.println("Введите число");
            int attempt = new Scanner(System.in).nextInt();

            if (attempt == value) {
                System.out.println("Вы угадали!");
                break;
            } else if (attempt < value) {
                System.out.println("Загаданное число больше");
                continue;
            } else {
                System.out.println("Загаданное число меньше");
                continue;
            }
        }
    }
}
