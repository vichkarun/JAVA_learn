package task_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("���������� � �������");
        System.out.print("������������ �������: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.print("���������� ���� ����������: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("���������� ������, ��������� JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
    }
}
