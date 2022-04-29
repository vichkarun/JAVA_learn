package task_01;
public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Apple",150,1,1.200);
        basket.add("Eggs",100,2,0.3);
        basket.print("Товары: ");
        basket.clear();
        System.out.println();
        basket.print("Товары: ");

    }
}






