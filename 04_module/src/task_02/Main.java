package task_02;

public class Main {
    public static void main(String[] args) {

            int a = 0;
            int b = 0;

        Arithmetic arithmeticAB = new Arithmetic(a,b);

        System.out.println("Сумма чисел " + a + "и" + b + "равно" + arithmeticAB.sum());
        System.out.println("Произведение чисел " + a + "и" + b + "равно" + arithmeticAB.multiply());
        System.out.println("Максимальное из чисел " + a + "и" + b + "это число" + arithmeticAB.max());
        System.out.println("Минимальное из чисел " + a + "и" + b + "это число" + arithmeticAB.min());

    }
}
