package task_02;


import java.util.Scanner;

public class TrucksContainersAndBoxes {
    public static void main(String[] args) {

        int trucks = 1;
        int containers = 1;
        int boxes = 1;
        int boxesInContainers = 27;
        int containersInTrucks = 12;

        System.out.println("Введите количество ящиков: ");
        int boxes1 = new Scanner(System.in).nextInt();
        for (boxes = 1; ; boxes++) {
            if (boxes1 <= 27) {
                containers = 1;
                trucks = 1;
                System.out.println("Грузовик: " + trucks);
                System.out.println("\t Контейнер: " + containers);
                for (int i = 1; i <= boxes1; i++)
                    System.out.println("\t\t Ящик: " + i);
            }
            break;

            if (boxes1 >= 28) {

            }

        }
//        for (boxes = 28; boxes >= 28 ; boxes++) {
//            if (containers % containersInTrucks == 0) {
//                trucks += 1;
//            }
//            System.out.println("Грузовик: " + trucks);
//
//            if (boxes1 % boxesInContainers == 0) {
//                containers += 1;
//            }
//            System.out.println("\t Контейнер: " + containers);
//            for (int i = 1; i <= boxes1; i++)
//                System.out.println("\t\t Ящик: " + i);
//            break;
//        }


    }
}

