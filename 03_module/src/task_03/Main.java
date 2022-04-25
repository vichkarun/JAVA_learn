package task_03;

public class Main {
    public static void main(String[] args) {

        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 1;
        int fillingTime = 1;

        while (currentVolume != volume) {
            if (currentVolume == currentVolume + fillingSpeed - devastationSpeed);
            System.out.println("Количество литров воды в бассейне в 1 итерации = " + currentVolume);
        }



    }
}
