package task_03;

import javax.swing.plaf.IconUIResource;

public class Printer {



    public static void main(String[] args) {
        append("Экономическая теория",50, "Основные школы");
        append("Микроэкономика", 20, "Субъекты");
        print("Очередь печати:");

    }
    private static String queue = "";

    private static int pendingPageCount;
    private static int numberOfDocument;
    private static int allPrintedPages;

    public Printer() {
        queue = "Список документов: ";
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
        queue = queue + "\n" + name + " - " + topic + " - " + pendingPageCount + "стр.";
    }

    public static void clear() {
        queue = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if(queue.isEmpty()) {
            System.out.println("Нет документов на печать");
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
