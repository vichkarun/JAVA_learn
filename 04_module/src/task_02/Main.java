package task_02;

public class Main {
    public static void main(String[] args) {

            int a = 0;
            int b = 0;

        Arithmetic arithmeticAB = new Arithmetic(a,b);

        System.out.println("����� ����� " + a + "�" + b + "�����" + arithmeticAB.sum());
        System.out.println("������������ ����� " + a + "�" + b + "�����" + arithmeticAB.multiply());
        System.out.println("������������ �� ����� " + a + "�" + b + "��� �����" + arithmeticAB.max());
        System.out.println("����������� �� ����� " + a + "�" + b + "��� �����" + arithmeticAB.min());

    }
}
