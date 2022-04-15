package task_01;

public class Main {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 500; // g
        int eggsCount = 5; // items
        int sugarAmount = 30; // g
        int oilAmount = 50; // ml
        int appleCount = 10;

        int pancakesPowderRequired = 400;
        int pancakesSugarRequired = 10;
        int pancakesMilkRequired = 1000;
        int pancakesOilRequired = 30;

        int omeletteMilkRequired = 300;
        int omelettePowderRequired = 5;
        int omeletteEggsRequired = 5;

        int applePieApplesRequired = 3;
        int applePieMilkRequired = 100;
        int applePiePowderRequired = 300;
        int applePieEggsRequired = 4;


        // Example
        // appleCount - 5
        if (appleCount > 5 ) {
            System.out.println("Apple Juice");
        } else {
            System.out.println("Недостаточно ингредиентов для Apple Juice :(");
        }

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= pancakesPowderRequired &&
                sugarAmount >= pancakesSugarRequired &&
                milkAmount >= pancakesMilkRequired &&
                oilAmount >= pancakesOilRequired) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Недостаточно ингредиентов для Pancakes :(");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= omeletteMilkRequired &&
                powderAmount >= omelettePowderRequired &&
                eggsCount >= omeletteEggsRequired) {
            System.out.println("Omelette");
        } else {
            System.out.println("Недостаточно ингредиентов для Omelette :(");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= applePieApplesRequired &&
                milkAmount >= applePieMilkRequired &&
                eggsCount >= applePieEggsRequired) {
            System.out.println("Apple pie");
        } else {
            System.out.println("Недостаточно ингредиентов для Apple Pie :(");
        }
    }
}

