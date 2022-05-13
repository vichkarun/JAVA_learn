package task_03;

public class RAM {

    private final String type;
    private final double volume;
    private final double weight;

    public RAM(String type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public RAM setType(String type) {
        return new RAM(type, volume, weight);
    }
    public RAM setVolume(double volume) {
        return new RAM(type, volume, weight);
    }
    public RAM setWeight(double weight) {
        return new RAM(type, volume, weight);
    }

    public String toString() {
        return "Оперативная память: " + "\n" + "тип - " + type + ", объем - " + volume + " ГБ " + ", вес - " + weight + " гр.";
    }



}
