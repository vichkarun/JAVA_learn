package task_02;

public class Main {
    public static void main(String[] args) {


        ArithmeticCalculator calculator = new ArithmeticCalculator();
        calculator.calculate(Operation.ADD, 2,10);
        calculator.calculate(Operation.MULTIPLY,6,4);
        calculator.calculate(Operation.SUBTRACT,50,25);


    }
}
