package task_04;

public class CargoInformation {

    private final double weight;
    private final Dimensions dimensions;
    private final String deliveryAddress;
    private final boolean flip;
    private final String registrationNumber;
    private final boolean fragile;

    public CargoInformation(String deliveryAddress, Dimensions dimensions,
                            double weight, String registrationNumber, boolean flip, boolean fragile) {
        this.deliveryAddress = deliveryAddress;
        this.dimensions = dimensions;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.flip = flip;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public CargoInformation setDimentions(Dimensions dimentions) {
        return new CargoInformation(deliveryAddress, dimentions,
                weight, registrationNumber, flip, fragile);
    }

    public double getWeight() {
        return weight;
    }

    public CargoInformation setWeight(double weight) {
        return new CargoInformation(deliveryAddress, dimensions,
                weight, registrationNumber, flip, fragile);
    }

    public String getDeliveryAddress() {

        return deliveryAddress;
    }

    public CargoInformation setDeliveryAddress(String deliveryAddress) {
        return new CargoInformation(deliveryAddress, dimensions,
                weight, registrationNumber, flip, fragile);
    }

    public boolean isFlip() {
        return flip;
    }

    public CargoInformation setFlip(boolean flip) {

        return new CargoInformation(deliveryAddress, dimensions,
                weight, registrationNumber, flip, fragile);
    }

    public String getRegistrationNumber() {

        return registrationNumber;
    }

    public CargoInformation setRegistrationNumber(String registrationNumber) {
        return new CargoInformation(deliveryAddress, dimensions,
                weight, registrationNumber, flip, fragile);
    }

    public boolean isFragile() {

        return fragile;
    }

    public CargoInformation setFragile(boolean fragile) {
        return new CargoInformation(deliveryAddress, dimensions,
                weight, registrationNumber, flip, fragile);
    }

    public String toString() {
        return "Информация о грузе: " + "\n" + "\n" + "Адрес: " + deliveryAddress + "\n" + dimensions.toString()
                + "\n" + "Вес - " + weight + " кг " + "\n" + "Регистрационный номер: "
                + registrationNumber + "\n" + "Переворачивать груз: " + (flip ? "Да" : "Нет")
                + "\n" + "Хрупкий груз: " + (fragile ? "Да" : "Нет");

    }

}
