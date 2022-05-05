package task_01;

public class Basket {
    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private int limit;

    public static int totalPriceForAllBaskets = 0;
    public static int totalCountForAllBaskets = 0;
    public static double averagePriceForAllItems = 0;
    public static double averageCostForBasket = 0;


    public Basket() {
        increaseCount(1);
        items = "������ �������:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;

    }

    public static int getCount() {

        return count;
    }

    public static void increaseCount(int count) {

        Basket.count = Basket.count + count;
    }


    public void add(String name, int price) {

        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " ��. - " + price;
        totalPrice = totalPrice + count * price;
        Basket.totalCountForAllBaskets = Basket.totalCountForAllBaskets + count;
        Basket.totalPriceForAllBaskets = Basket.totalPriceForAllBaskets + count * price;
        Basket.averagePriceForAllItems = Basket.getTotalPriceForAllBaskets() / Basket.getTotalCountForAllBaskets();
        Basket.averageCostForBasket = Basket.getTotalPriceForAllBaskets() / Basket.count;
    }


    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {

        return totalPrice;
    }

    public boolean contains(String name) {

        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("������� �����");
        } else {
            System.out.println(items);
        }
    }

    public static int getTotalPriceForAllBaskets() {
        return totalPriceForAllBaskets;
    }

    public static int getTotalCountForAllBaskets() {
        return totalCountForAllBaskets;
    }

    public double getAveragePriceAllItems() {
        return averagePriceForAllItems;
    }

    public double getAverageCostForBasket() {
        return averageCostForBasket;
    }

}
