package task_03;

import javax.swing.plaf.IconUIResource;

public class Printer {



    public static void main(String[] args) {
        append("������������� ������",50, "�������� �����");
        append("��������������", 20, "��������");
        print("������� ������:");

    }
    private static String queue = "";

    private static int pendingPageCount;
    private static int numberOfDocument;
    private static int allPrintedPages;

    public Printer() {
        queue = "������ ����������: ";
    }

    public static boolean contains(String name) {
        return queue.contains(name);
    }

    public void append(String name) {
        append(name, 1);
    }

    public void append(String name, int pendingPageCount) {
        append(name, pendingPageCount, "");
    }

    public static void append(String name, int pendingPageCount, String topic) {
        boolean error = false;
        if(contains(name)) {
            return;
        }
        pendingPageCount = pendingPageCount * numberOfDocument;
        queue = queue + "\n" + name + " - " + topic + " - " + pendingPageCount + "���.";
    }

    public static void clear() {
        queue = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if(queue.isEmpty()) {
            System.out.println("��� ���������� �� ������");
        }else {
            System.out.println(queue);
        }
        clear();
    }

    public static int getPendingPageCount() {
        return pendingPageCount;
    }

    public static int getAllPrintedPages() {
        return allPrintedPages;
    }
}
