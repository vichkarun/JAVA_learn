package task_01;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("������", 150, 5);
        basket.add("Cookie",85,2);
        basket.add("Sugar",94,4);

        System.out.println("���������� ��������� ������ - " + Basket.getCount());
        System.out.println("����� ���������� ���� ������� � �������� - " + Basket.getTotalCountForAllBaskets());
        System.out.println("����� ��������� ���� ������� � �������� - " + Basket.getTotalPriceForAllBaskets() + " ���.");
        System.out.println();
        System.out.println("������� ���� ������ �� ���� �������� - " + Basket.averagePriceForAllItems);
        System.out.println("������� ��������� ������� - " + Basket.averageCostForBasket);

    }
}
