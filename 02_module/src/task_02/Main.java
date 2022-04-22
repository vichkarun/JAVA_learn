package task_02;

public class Main {
    public static void main(String[] args) {

        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge && katyaAge >= mishaAge) {
            max = vasyaAge;
            middle = katyaAge;
            min = mishaAge;

        } else if (vasyaAge >= katyaAge && vasyaAge >= mishaAge && katyaAge <= mishaAge) {
            max = vasyaAge;
            middle = mishaAge;
            min = katyaAge;
        } else if (vasyaAge >= katyaAge && vasyaAge <= mishaAge) {
            middle = vasyaAge;
            max = mishaAge;
            min = katyaAge;

        } else {
            min = vasyaAge;
            middle = mishaAge;
            max = katyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);

    }
}
