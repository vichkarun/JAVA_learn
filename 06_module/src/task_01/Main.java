package task_01;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Молоко", 150, 5);
        basket.add("Cookie",85,2);
        basket.add("Sugar",94,4);

        System.out.println("Количество созданных корзин - " + Basket.getCount());
        System.out.println("Общее количество всех товаров в корзинах - " + Basket.getTotalCountForAllBaskets());
        System.out.println("Общая стоимость всех товаров в корзинах - " + Basket.getTotalPriceForAllBaskets() + " руб.");
        System.out.println();
        System.out.println("Средняя цена товара во всех корзинах - " + Basket.averagePriceForAllItems);
        System.out.println("Средняя стоимость корзины - " + Basket.averageCostForBasket);

    }
}
