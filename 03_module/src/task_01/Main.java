package task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result = 1;

        System.out.println("¬ведите число");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1) {
                result = result * i;
        }
        System.out.println(value + "! = " + result);
    }
}
