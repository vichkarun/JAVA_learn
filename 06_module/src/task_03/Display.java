package task_03;

public class Display {

    private final double diagonal;
    private final DisplayType type;
    private final double weight;


    public DisplayType getType() {
        return type;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public Display(double diagonal, DisplayType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public Display setDiagonal(double diagonal) {
        return new Display(diagonal, type, weight);
    }

    public Display setType(DisplayType type) {
        return new Display(diagonal, type, weight);
    }

    public Display setWeight(double weight) {
        return new Display(diagonal, type, weight);

    }
    public String toString() {
        return "Экран:" + "\n" + "диагональ: " + diagonal + " дюйма, " + "тип:  " + type + ", вес: " + weight + " гр.";
    }


}