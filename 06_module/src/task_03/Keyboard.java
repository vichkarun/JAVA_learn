package task_03;

public class Keyboard {

    private final KeyboardType type;
    private final boolean illumination;
    private final double weight;

    public Keyboard(KeyboardType type, boolean illumination, double weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public boolean isIllumination() {
        return illumination;

    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setType(KeyboardType type) {
        return new Keyboard(type,illumination,weight);
    }

    public Keyboard setIllumination(boolean illumination) {
        return new Keyboard(type, illumination, weight);
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(type, illumination, weight);
    }

    public String toString() {
        return "Клавиатура:" + "\n" + "тип: " + type + ", наличие подсветки:  " + (illumination ? "Да" : "Нет") + ", вес: " + weight + " гр.";
    }

}
