package task_01;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 65536; i++){
            char c = (char) i;
            if (c >= 'А' && c <= 'я') {
            System.out.println(i + " - " + c);}
            else if (c == 'Ё' || c == 'ё') {
                System.out.println(i + " - " + c);
            }
        }
        System.out.println();
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());


    }
}


