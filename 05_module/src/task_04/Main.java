package task_04;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions1 = new Dimensions(3,2,1);
        dimensions1 = dimensions1.setHeight(5);

        CargoInformation cargoOrders1 = new CargoInformation("г.Спб, ул.Садовая, д.12", dimensions1,
                2,"NA985623",false,true);


        System.out.println(cargoOrders1);

    }
}
