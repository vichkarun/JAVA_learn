package task_03;

import javax.swing.plaf.IconUIResource;

public class Printer {

    public static void main(String[] args) {

        append("Экономическая теория",50, "Основные школы");
        append("Микроэкономика", 20, "Субъекты");
        print("Очередь печати: ");
        System.out.println();
        print("Очередь печати: ");

        System.out.println(allPrintedPages);
    }

    private static String queue = "";

    private static int pendingPageCount = 0;
    private static int numberOfPage = 0;
    private static int numberOfDocument = 0;
    private static int allPrintedPages;

    public Printer() {

        queue = "Список документов: ";
    }

    public static boolean contains(String name) {

        return queue.contains(name);
    }

    public void append(String name) {
        append(name, 1);
        numberOfDocument++;
    }

    public void append(String name, int numberOfPage) {
        append(name, numberOfPage, "");
        numberOfDocument++;
        pendingPageCount = pendingPageCount + numberOfPage;

    }

    public static void append(String name, int numberOfPage, String topic) {
        boolean error = false;
        if(contains(name)) {
            return;
        }
        numberOfDocument++;
        pendingPageCount = pendingPageCount + numberOfPage;
        queue = queue + name + " - Тема: " + topic + " - " + numberOfPage + " стр." + "\n";
    }

    public static void clear() {
        queue = "";
        pendingPageCount = 0;
    }


    public static void print(String title) {
        System.out.println(title);
        if(queue.isEmpty()) {
            System.out.println("Нет документов на печать");

        }else {
            System.out.println("Всего страниц в очереди на печать: " + getPendingPageCount());
            System.out.println(queue);
            allPrintedPages = allPrintedPages + getAllPrintedPages();
            clear();
        }

    }

    public static int getPendingPageCount() {
        return pendingPageCount;
    }

    public static int getAllPrintedPages() {

        return allPrintedPages;
    }
}
