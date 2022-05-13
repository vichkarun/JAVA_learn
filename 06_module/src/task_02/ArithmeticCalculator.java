package task_02;

import static task_02.Operation.*;

public class ArithmeticCalculator{



    public void calculate(Operation operation, int x, int y) {
        if(operation == ADD) {
            System.out.println(x + y);
        }
        if(operation == SUBTRACT) {
            System.out.println(x - y);
        }
        if(operation == MULTIPLY) {
            System.out.println(x * y);
        }

    }

}
