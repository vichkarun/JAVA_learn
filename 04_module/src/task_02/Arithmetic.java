package task_02;

public class Arithmetic {

    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int sum() {
        return this.a + this.b;
    }

    public int multiply() {

        return this.a * this.b;
    }

    public int max() {
        return this.a > this.b ? this.a : this.b;
    }

    public int min() {
        return this.a < this.b ? this.a : this.b;
    }

}
